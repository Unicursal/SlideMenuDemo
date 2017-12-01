package com.printdeng.day1126.ui.main.fragment;


import android.view.View;
import android.widget.ListView;

import com.printdeng.day1126.R;

/**
 * Author:  MsDeng
 * Version:  1.0
 * Date:    2017/11/27
 * Modify:
 * Description: //TODO
 * Copyright notice:
 */
public class NewsMainFragment extends BaseFragment {


//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view=View.inflate(getContext(), R.layout.news_main_fragment,null);
//        return view;
//    }

    @Override
    protected View getSuccessView() {
        View view=View.inflate(getContext(), R.layout.news_main_fragment,null);
        return view;
    }

    @Override
    public Object requestData() {
        return null;
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
