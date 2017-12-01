package com.printdeng.day1126.ui.main.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Author:  MsDeng
 * Version:  1.0
 * Date:    2017/11/26
 * Modify:
 * Description: //TODO
 * Copyright notice:
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化activiity视图
        setContentView(getLayoutId());

        ButterKnife.bind(this);

        init();

    }

    public  abstract void init();

    public abstract int getLayoutId();
}
