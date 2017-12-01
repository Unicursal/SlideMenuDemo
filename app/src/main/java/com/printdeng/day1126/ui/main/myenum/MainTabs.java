package com.printdeng.day1126.ui.main.myenum;

/**
 * 作者: old样
 * 描述:
 * 上海传智播客android黑马程序员
 **/

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.printdeng.day1126.R;
import com.printdeng.day1126.ui.main.fragment.CareMainFragment;
import com.printdeng.day1126.ui.main.fragment.NewsMainFragment;
import com.printdeng.day1126.ui.main.fragment.PhotosMainFragment;
import com.printdeng.day1126.ui.main.fragment.VideoMainFragment;

/**
 * 这个main下的界面数据枚举
 */
public enum MainTabs {
    NEWS("NEWS", R.mipmap.ic_care_normal, "综合", NewsMainFragment.class, null),
    TWEENT("TWEENT", R.mipmap.ic_girl_normal, "动弹", CareMainFragment.class, null),
    SELECT("SELECT", R.mipmap.ic_home_normal, "弹一弹", PhotosMainFragment.class, null),
    EXPLORE("EXPLORE", R.mipmap.ic_video_normal, "发现", VideoMainFragment.class, null),
    ME("ME", R.mipmap.ic_video_normal, "我的", VideoMainFragment.class, null);

    //tag
    public String                    mTag;
    //图片
    public int                       mImg;
    //文字
    public String                    mTitle;
    //fragment Class
    public Class<? extends Fragment> mFragmentClass;
    public Bundle mBundle;

    MainTabs(String tag, int img, String title, Class<? extends Fragment> fragmentClass, Bundle bundle) {
        mTag = tag;
        mImg = img;
        mTitle = title;
        mFragmentClass = fragmentClass;
        mBundle = bundle;
    }
}
