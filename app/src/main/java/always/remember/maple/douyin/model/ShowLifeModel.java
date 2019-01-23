package always.remember.maple.douyin.model;

import android.content.Context;

import java.util.HashMap;

import always.remember.maple.douyin.api.Api;
import always.remember.maple.douyin.base.BaseModel;
import always.remember.maple.douyin.progress.ObserverResponseListener;
import io.reactivex.ObservableTransformer;

public class ShowLifeModel<T> extends BaseModel {

    public void getlist(Context context, HashMap<String,String> map, boolean isDialog, boolean cancelable,
                      ObservableTransformer<T,T> transformer, ObserverResponseListener observerListener){

        //当不需要指定是否由dialog时，可以调用这个方法
//        subscribe(context, Api.getApiService().login(map), observerListener);
        subscribe(context, Api.getApiService().showlifeList(map), observerListener,transformer,isDialog,cancelable);
    }


}
