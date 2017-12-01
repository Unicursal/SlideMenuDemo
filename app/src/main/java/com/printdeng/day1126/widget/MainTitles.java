package com.printdeng.day1126.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.printdeng.day1126.R;

/*设置标题展示文字*/
public class MainTitles extends LinearLayout{
        TextView text;
    public MainTitles(Context context) {
        this(context,null);
    }

    public MainTitles(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MainTitles(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View inflate = LayoutInflater.from(context).inflate(R.layout.custom_main_titles, this, false);
        text = (TextView) inflate.findViewById(R.id.tv_title);
        addView(inflate);
    }
    public void setTitle(String title){
        text.setText(title);
    }
}