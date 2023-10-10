package com.iottech.firstandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.iottech.android_demo_lib.HelloWorld;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HelloWorld.printLog("Anupama Mishra","hello from Android Lib");
    }
}