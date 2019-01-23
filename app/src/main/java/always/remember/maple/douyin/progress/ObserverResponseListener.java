package always.remember.maple.douyin.progress;


import always.remember.maple.douyin.util.ExceptionHandle;

/**
 * 请求监听
 */

public interface ObserverResponseListener<T> {
    /**
     * 响应成功
     * @param t
     */
    void onNext(T t);

    /**
     * 响应失败
     * @param e
     */
    void onError(ExceptionHandle.ResponeThrowable e);

}
