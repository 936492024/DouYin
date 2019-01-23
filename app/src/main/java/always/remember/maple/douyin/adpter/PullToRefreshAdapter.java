package always.remember.maple.douyin.adpter;

import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import always.remember.maple.douyin.R;
import always.remember.maple.douyin.entity.Showlife;

public class PullToRefreshAdapter extends BaseQuickAdapter<Showlife, BaseViewHolder> {
    public PullToRefreshAdapter() {
        super(R.layout.showlifeitemlayout,null);
    }

    @Override
    protected void convert(BaseViewHolder helper, Showlife item) {
        helper.setText(R.id.content, item.getContent());
        // 加载网络图片
        Glide.with(mContext).load(item.getPortrait()).into((ImageView) helper.getView(R.id.iocn));
    }
}

