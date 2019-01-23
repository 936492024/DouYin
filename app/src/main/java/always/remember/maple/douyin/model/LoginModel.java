package always.remember.maple.douyin.model;

import android.content.Context;

import java.util.HashMap;

import always.remember.maple.douyin.api.Api;
import always.remember.maple.douyin.base.BaseModel;
import always.remember.maple.douyin.progress.ObserverResponseListener;
import io.reactivex.ObservableTransformer;

public class LoginModel <T> extends BaseModel {

    public void login(Context context, HashMap<String,String> map, boolean isDialog, boolean cancelable,
                      ObservableTransformer<T,T> transformer, ObserverResponseListener observerListener){

        //当不需要指定是否由dialog时，可以调用这个方法
//        subscribe(context, Api.getApiService().login(map), observerListener);
        subscribe(context, Api.getApiService().login(map), observerListener,transformer,isDialog,cancelable);
    }

    public void getNewCode(Context context, HashMap<String,String> map, boolean isDialog, boolean cancelable,
                           ObservableTransformer<T,T> transformer, ObserverResponseListener observerListener){
        subscribe(context, Api.getApiService().getNewCode(map), observerListener,transformer,isDialog,cancelable);
    }

    public void register(Context context, HashMap<String,String> map, boolean isDialog, boolean cancelable,
                         ObservableTransformer<T,T> transformer, ObserverResponseListener observerListener){

        subscribe(context, Api.getApiService().register(map), observerListener,transformer,isDialog,cancelable);
    }

}
