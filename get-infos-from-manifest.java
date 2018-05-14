package net.panayiotisgeorgiou.testandroidcode;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //mPackageManager = context.getPackageManager();

        try {
            PackageInfo mInfo = getPackageManager().getPackageInfo(getPackageName(), PackageManager.GET_META_DATA);
            Log.i("packageInfo", "PackageName = " + mInfo.packageName);
            Log.i("packageInfo", "VersionName = " + mInfo.versionName);
            Log.i("packageInfo", "VersionCode = " + mInfo.versionCode);
            Log.i("packageInfo", "Last Update Time = " + new Date(mInfo.lastUpdateTime));
            Log.i("packageInfo", "Permission = " + mInfo.permissions);
        } catch (PackageManager.NameNotFoundException e) {
            Log.d("AndDev", "Package non found");
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
