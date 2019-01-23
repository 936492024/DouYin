package always.remember.maple.douyin;

import android.app.Application;
import android.content.Context;

import me.jessyan.autosize.AutoSizeConfig;
import me.jessyan.autosize.unit.Subunits;

public class MyApplication extends Application {

    private static Context mContext;//全局上下文对象

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();

        AutoSizeConfig.getInstance().getUnitsManager()
                .setSupportDP(false)
                .setSupportSP(false)
                .setSupportSubunits(Subunits.MM);
    }

    public static Context getContext() {
        return mContext;
    }


}
