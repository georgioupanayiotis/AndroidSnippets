package com.panayiotisgeorgiou.androidopendialer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
    private Context mContext;
    private Activity mActivity;

    private LinearLayout mRootLayout;
    private Button mBtnDoTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the application context
        mContext = getApplicationContext();
        mActivity = MainActivity.this;

        // Get the widget reference from xml layout
        mRootLayout = findViewById(R.id.root_layout);
        mBtnDoTask = findViewById(R.id.btn_do_task);

        // Set a click listener for the button
        mBtnDoTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialer();
            }
        });
    }

    // Custom method to open dialer app
    protected void openDialer(){
        // Initialize an intent to open dialer app with specified phone number
        // It open the dialer app and allow user to call the number manually
        Intent intent = new Intent(Intent.ACTION_DIAL);
        // Send phone number to intent as data
        intent.setData(Uri.parse("tel:" + "+880XXXXXXXXXXXX"));
        // Start the dialer app activity with number
        startActivity(intent);
    }
}
