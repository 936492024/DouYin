package always.remember.maple.douyin.presenter;

import android.content.Context;
import com.maning.mndialoglibrary.MToast;
import java.util.HashMap;
import java.util.List;

import always.remember.maple.douyin.base.BaseResponse;
import always.remember.maple.douyin.contract.ShowLifeContract;
import always.remember.maple.douyin.entity.Showlife;
import always.remember.maple.douyin.model.ShowLifeModel;
import always.remember.maple.douyin.progress.ObserverResponseListener;
import always.remember.maple.douyin.util.ExceptionHandle;


public class ShowLifePresenter extends ShowLifeContract.Presenter {
    private ShowLifeModel model;
    private Context context;

    public ShowLifePresenter(Context context) {
        this.model = new ShowLifeModel();
        this.context = context;
    }

    @Override
    public void getlist(HashMap<String, String> map, boolean isDialog, boolean cancelable) {
        model.getlist(context, map, isDialog, cancelable, getView().bindLifecycle(),new ObserverResponseListener() {
            @Override
            public void onNext(Object o) {
                if(getView() != null){
                    BaseResponse<List<Showlife>> BaseResponse = (BaseResponse<List<Showlife>>) o;
                    if(BaseResponse.isSuccess()){
                        getView().result(BaseResponse);
                    }else {
                        getView().setMsg(BaseResponse.getMsg());
                    }
                }
            }
            @Override
            public void onError(ExceptionHandle.ResponeThrowable e) {
                if(getView() != null){
                    MToast.makeTextShort(context,ExceptionHandle.handleException(e).message);
                }
            }
        });
    }
}
