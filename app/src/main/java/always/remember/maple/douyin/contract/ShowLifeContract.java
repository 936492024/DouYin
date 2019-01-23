package always.remember.maple.douyin.contract;

import java.util.HashMap;
import java.util.List;

import always.remember.maple.douyin.base.BasePresenter;
import always.remember.maple.douyin.base.BaseResponse;
import always.remember.maple.douyin.base.BaseView;
import always.remember.maple.douyin.entity.Showlife;
import io.reactivex.ObservableTransformer;

public interface ShowLifeContract {
    interface View extends BaseView {

        void result(BaseResponse<List<Showlife>> data);

        void setMsg(String msg);

        <T> ObservableTransformer<T, T> bindLifecycle();

    }

    abstract class Presenter extends BasePresenter<ShowLifeContract.View> {

        public abstract void getlist(HashMap<String, String> map, boolean isDialog, boolean cancelable);

    }
}
