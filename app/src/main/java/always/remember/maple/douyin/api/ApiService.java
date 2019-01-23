package always.remember.maple.douyin.api;

import java.util.List;
import java.util.Map;
import always.remember.maple.douyin.base.BaseResponse;
import always.remember.maple.douyin.entity.Login;
import always.remember.maple.douyin.entity.Register;
import always.remember.maple.douyin.entity.Showlife;
import always.remember.maple.douyin.entity.VerificationCode;
import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * api service
 */
public interface ApiService {

    //获取短信验证码
    @POST("sms/send")
    @FormUrlEncoded
    Observable<VerificationCode> getNewCode(@FieldMap Map<String, String> map);
    //注册
    @POST("login/registered")
    @FormUrlEncoded
    Observable<BaseResponse<Register>> register(@FieldMap Map<String, String> map);
    // 登录
    @POST("login/login")
    @FormUrlEncoded
    Observable<BaseResponse<Login>> login(@FieldMap Map<String, String> map);


    //秀生活測試recycleview列表
    @POST("shenghuo/list")
    @FormUrlEncoded
    Observable<BaseResponse<List<Showlife>>> showlifeList(@FieldMap Map<String, String> map);
}
