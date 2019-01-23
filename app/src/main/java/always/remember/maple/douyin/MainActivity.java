package always.remember.maple.douyin;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.view.View;
import com.maning.mndialoglibrary.MProgressDialog;
import com.maning.mndialoglibrary.MToast;
import java.util.HashMap;
import always.remember.maple.douyin.base.BaseActivity;
import always.remember.maple.douyin.base.BaseResponse;
import always.remember.maple.douyin.contract.MainContract;
import always.remember.maple.douyin.entity.Login;
import always.remember.maple.douyin.presenter.MainPresenter;
import always.remember.maple.douyin.util.ApkUpDate;
import always.remember.maple.douyin.util.CreateMD5;
import always.remember.maple.douyin.util.ProgressToast;
import butterknife.OnClick;
import io.reactivex.ObservableTransformer;
import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.EasyPermissions;

public class MainActivity extends BaseActivity<MainContract.View, MainContract.Presenter>
        implements MainContract.View {

    //更新
    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public MainContract.Presenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    public MainContract.View createView() {
        return this;
    }

    @Override
    public void init() {
    }


    @Override
    public void result(BaseResponse<Login> data) {
        MProgressDialog.dismissProgress();
    }

    @Override
    public void setMsg(String msg) {
        MToast.makeTextShort(MainActivity.this, "登录成功");
    }


    @Override
    public <T> ObservableTransformer<T, T> bindLifecycle() {
        return this.bindToLifecycle();
    }



    @OnClick({R.id.hell, R.id.xiazai,R.id.recycleview})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.hell:
                MProgressDialog.showProgress(MainActivity.this);
                String mobile = "18123318217";
                String password = "123456";
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("mobile", "18123318217");
                hashMap.put("password", "123456");
                hashMap.put("secret", CreateMD5.getMd5(mobile + password + "xfh"));
                getPresenter().Login(hashMap, true, true);
                break;
            case R.id.xiazai:
                ApkUpDate apkUpDate = new ApkUpDate(this);
                apkUpDate.startdownload();
                break;
            case R.id.recycleview:
                startActivity(new Intent(MainActivity.this,ShowLifeActivity.class));
                break;
            case R.id.permission:
                locationAndContactsTask();
                break;
        }
    }


    @AfterPermissionGranted(101)
    public void locationAndContactsTask() {
        if (EasyPermissions.hasPermissions(this, Manifest.permission.CAMERA)) {
            ProgressToast.MToast(this,"相机权限已经申请");
        } else {
            EasyPermissions.requestPermissions(
                    this,
                    getString(R.string.rationale_location_contacts),
                    101,Manifest.permission.CAMERA);
        }
    }



    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case 101:
                if(grantResults[0]==PackageManager.PERMISSION_GRANTED) {
                //TODO   权限获取成功后做下一步操作
                //处理返回的data,获取选择的联系人信息
                ProgressToast.MToast(this,"获取权限成功");
                }
                break;
        }
    }
}
