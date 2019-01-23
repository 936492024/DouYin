package always.remember.maple.douyin;

import android.graphics.Color;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import always.remember.maple.douyin.adpter.PullToRefreshAdapter;
import always.remember.maple.douyin.base.BaseActivity;
import always.remember.maple.douyin.base.BaseResponse;
import always.remember.maple.douyin.contract.ShowLifeContract;
import always.remember.maple.douyin.entity.Showlife;
import always.remember.maple.douyin.presenter.ShowLifePresenter;
import always.remember.maple.douyin.util.CreateMD5;
import butterknife.BindView;
import io.reactivex.ObservableTransformer;

public class ShowLifeActivity extends BaseActivity<ShowLifeContract.View, ShowLifeContract.Presenter>
        implements ShowLifeContract.View {
    @BindView(R.id.rv_list)
    RecyclerView mRecyclerView;
    @BindView(R.id.swipeLayout)
    SwipeRefreshLayout mSwipeRefreshLayout;
    private int currentPage = 0;//当前页数
    private PullToRefreshAdapter mAdapter;
    private List<Showlife> list =new ArrayList<Showlife>();
    private static final int PAGE_SIZE = 8;
    private boolean isRefresh=true;


    @Override
    public int getLayoutId() {
        return R.layout.autosiza_layout;
    }

    @Override
    public ShowLifeContract.Presenter createPresenter() {
        return new ShowLifePresenter(this);
    }


    @Override
    public ShowLifeContract.View createView() {
        return this;
    }

    @Override
    public void init() {
        mSwipeRefreshLayout.setColorSchemeColors(Color.rgb(47, 223, 189));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        initAdapter();
        mSwipeRefreshLayout.setRefreshing(true);
        refresh();
    }

    @Override
    public void result(BaseResponse<List<Showlife>>data) {
        setData(isRefresh,data);
    }

    private void initAdapter() {
        mAdapter = new PullToRefreshAdapter();
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refresh();
            }
        });
        mAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {
                loadMore();
            }
        });
        mAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
        mAdapter.setPreLoadNumber(3);
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addOnItemTouchListener(new OnItemClickListener() {
            @Override
            public void onSimpleItemClick(final BaseQuickAdapter adapter, final View view, final int position) {
                Toast.makeText(ShowLifeActivity.this, Integer.toString(position), Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public void setMsg(String msg) {

    }

    @Override
    public <T> ObservableTransformer<T, T> bindLifecycle() {
        return this.bindToLifecycle();
    }

    private void setData(boolean isRefresh, BaseResponse<List<Showlife>> data) {
        list =data.getData();
        final int size = data == null ? 0 : list.size();
        if (isRefresh) {
            mAdapter.setNewData(list);
        } else {
            if (size > 0) {
                mAdapter.addData(list);
            }
        }
        if (size < PAGE_SIZE) {
            //第一页如果不够一页就不显示没有更多数据布局
            mAdapter.loadMoreEnd(isRefresh);
            Toast.makeText(this, "no more data", Toast.LENGTH_SHORT).show();
        } else {
            mAdapter.loadMoreComplete();
        }
        mSwipeRefreshLayout.setRefreshing(false);
    }

    //請求第一頁數據
    public void getlist(){
        String id = "";
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("id", id);
        hashMap.put("page", currentPage + "");
        hashMap.put("pageSize", PAGE_SIZE+"");
        hashMap.put("uid", "7376");
        hashMap.put("secret", CreateMD5.getMd5(id + currentPage + "8" + "7376" + "xfh"));
        getPresenter().getlist(hashMap, false, true);
    }

    private void refresh() {
        mAdapter.setEnableLoadMore(false);//这里的作用是防止下拉刷新的时候还可以上拉加载
        currentPage=0;
        isRefresh=true;
        getlist();
    }

    private void loadMore() {
        currentPage++;
        isRefresh=false;
        getlist();
    }
}
