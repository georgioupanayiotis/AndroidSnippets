package com.panayiotisgeorgiou.androidbuildlinfo;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvInfo;
        tvInfo = (TextView)findViewById(R.id.info);

        String manufacturer = Build.MANUFACTURER;
        String model = Build.MODEL;
        String release = Build.VERSION.RELEASE;;

        tvInfo.setText(
                manufacturer + "\n"
                + model + "\n"
                + "Android: " + release + "\n");

    }
}
