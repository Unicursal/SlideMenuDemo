package com.printdeng.day1126.global;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

import com.githang.statusbar.StatusBarCompat;
import com.printdeng.day1126.R;

/**
 * Author:  MsDeng
 * Version:  1.0
 * Date:    2017/11/26
 * Modify:
 * Description: //TODO
 * Copyright notice:
 */

public class MyApplication extends Application {

    public  static Handler mHandler;
    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mHandler = new Handler();
        mContext=this;


    }
}
