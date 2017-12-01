package com.printdeng.day1126.ui.main.fragment;


import android.view.View;

import com.printdeng.day1126.R;

/**
 * Author:  MsDeng
 * Version:  1.0
 * Date:    2017/11/27
 * Modify:
 * Description: //TODO
 * Copyright notice:
 */
public class VideoMainFragment extends BaseFragment {
    @Override
    protected View getSuccessView() {
        View view =View.inflate(getContext(), R.layout.video_main_fragment,null);
        return view;
    }

    @Override
    public Object requestData() {
        return null;
    }
}
