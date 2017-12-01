package com.printdeng.day1126.ui.main.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.printdeng.day1126.R;

/**
 * Author:  MsDeng
 * Version:  1.0
 * Date:    2017/11/27
 * Modify:
 * Description: //TODO
 * Copyright notice:
 */
public class CareMainFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= View.inflate(getContext(), R.layout.care_main_fragment,null);
        return view;
    }
    //    @Override
//    protected View getSuccessView() {
//        View view =View.inflate(getContext(), R.layout.news_main_fragment,null);
//        return view;
//    }
//
//    @Override
//    public Object requestData() {
//        return null;
//    }
}