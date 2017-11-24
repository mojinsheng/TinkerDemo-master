package com.youxiake.tinkerdemo;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.tencent.tinker.lib.tinker.TinkerInstaller;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"应用正常了....",Toast.LENGTH_SHORT).show();
       // File file=Environment.getExternalStorageDirectory().getAbsolutePath();

        Log.i("tapfuns","SD ="+Environment.getExternalStorageDirectory().getAbsolutePath()+"/patch");

        //进行补丁的操作
        TinkerInstaller.onReceiveUpgradePatch(this, Environment.getExternalStorageDirectory().getAbsolutePath()+"/patch");
    }
}
