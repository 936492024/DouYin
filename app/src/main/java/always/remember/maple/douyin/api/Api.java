package always.remember.maple.douyin.api;



import always.remember.maple.douyin.base.BaseApi;


/**
 *
 */

public class Api {

    private volatile static ApiService apiService;

    //Double Check
    public static ApiService getApiService() {
        if (apiService == null) {
            synchronized (Api.class) {
                if (apiService == null) {
                    new Api();
                }
            }
        }
        return apiService;
    }

    private Api() {
        BaseApi baseApi = new BaseApi();
        apiService = baseApi.getRetrofit(ApiConfig.API).create(ApiService.class);
    }
}
