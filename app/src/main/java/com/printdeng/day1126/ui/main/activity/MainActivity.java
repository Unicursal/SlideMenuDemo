package com.printdeng.day1126.ui.main.activity;


import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.printdeng.day1126.R;
import com.printdeng.day1126.ui.main.fragment.CareMainFragment;
import com.printdeng.day1126.ui.main.fragment.NewsMainFragment;
import com.printdeng.day1126.ui.main.fragment.PhotosMainFragment;
import com.printdeng.day1126.ui.main.fragment.VideoMainFragment;
import com.printdeng.day1126.ui.main.myenum.MainTabs;
import com.printdeng.day1126.widget.MainTitles;
import com.printdeng.day1126.widget.SlideMenu;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    private String[] mTitles = {"首页", "美女", "视频", "关注"};
    private int[] mSelectId = {
          R.drawable.tab_icon_newsmain,R.drawable.tab_icon_photosmain
    ,R.drawable.tab_icon_videomain,R.drawable.tab_icon_caremain};

    private Class[] mFragmentView ={NewsMainFragment.class, PhotosMainFragment.class, VideoMainFragment.class,
        CareMainFragment.class};
    private FrameLayout mMFrameLayout;
    private SlideMenu mActivityMain;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMFrameLayout = (FrameLayout) findViewById(R.id.frame_layout);
        mActivityMain = (SlideMenu) findViewById(R.id.activity_main);
        ButterKnife.bind(this);
        //初始化下面的fragmenttabhost
        initTab();
    }


    //开启跳转页面
    public static void startAction(SplashActivity splashActivity) {
        Intent intent = new Intent(splashActivity, MainActivity.class);
        splashActivity.startActivity(intent);
    }

    private void initTab() {
        //找到控件
        FragmentTabHost tabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        //设置显示的控件
        tabHost.setup(getApplicationContext(), getSupportFragmentManager(), R.id.frame_layout);
        //设置分隔线
        tabHost.getTabWidget().setDividerDrawable(null);
        MainTabs[] values = MainTabs.values();
        for ( int i = 0; i < mFragmentView.length; i++) {
            //设置上标题,，展示不同的fragment
            TabHost.TabSpec tabspec = tabHost.newTabSpec(mTitles[i]);
            //设置上底部的view展示
            tabspec.setIndicator(getItemView(i));
            //fragment的字节码
            Class<?> clss = mFragmentView[i];
            Bundle args = new Bundle();
            //传递值
            args.putString("titleName",mTitles[i]);
            tabHost.addTab(tabspec, clss, args);
        }
        //设置默认选中的是第一个
        tabHost.setCurrentTab(0);
        //点击切换的时候头部展示不同的view
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                MainTitles mainTabs= (MainTitles) findViewById(R.id.main_titles);
                mainTabs.setTitle(tabId);
            }
        });
    }


//    private void initBar() {
//        //用Toolbar替换ActionBar
////        setSupportActionBar(mToolBar);
//        ActionBar supportActionBar = getSupportActionBar();
//        supportActionBar.setTitle(getString(R.string.app_name));
//    }

    ColorStateList mColorStateList;
    public View getItemView(int index) {
        View view=View.inflate(getApplicationContext(),R.layout.tab_botton,null);
        ImageView imageView = view.findViewById(R.id.iv_tab);
        TextView textView = view.findViewById(R.id.tv_tab);
        //设置图片触摸显示状态
        imageView.setImageResource(mSelectId[index]);
        //设置上文字
        textView.setText(mTitles[index]);
        if(mColorStateList==null){
            mColorStateList=getResources().getColorStateList(R.color.main_text_select_color);
            //给文字设置上颜色
            textView.setTextColor(mColorStateList);
        }
        textView.setTextColor(mColorStateList);
        return view;
    }
}
