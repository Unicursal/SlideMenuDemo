package com.printdeng.day1126.ui.main.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.printdeng.day1126.ui.main.views.LoaderPager;


/**
 * 作者: old样
 * 描述:
 * 上海传智播客android黑马程序员
 **/

public abstract class BaseFragment extends Fragment {

    private LoaderPager mLoaderPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (mLoaderPager == null) {
            mLoaderPager = new LoaderPager(container.getContext()) {
                @Override
                protected Object getNetData() {
                    return requestData();
                }



                @Override
                protected View createSuccessView() {
                    return getSuccessView();
                }
            };
        }




        return mLoaderPager;
    }

    //得到一个成功的view
    protected abstract View getSuccessView();

    //请求数据
    public abstract Object requestData();

    //刷新方法
    public void refreshData() {
        mLoaderPager.loadData();
    }



}
