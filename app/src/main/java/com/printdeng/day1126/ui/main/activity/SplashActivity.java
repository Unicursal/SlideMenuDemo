package com.printdeng.day1126.ui.main.activity;

import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

import com.printdeng.day1126.R;

import butterknife.Bind;

/**
 * Author:  MsDeng
 * Version:  1.0
 * Date:    2017/11/26
 * Modify:
 * Description: //TODO
 * Copyright notice:
 */

public class SplashActivity extends BaseActivity {


    @Bind(R.id.image_view)
    ImageView mImageView;

    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    public void init() {
        //设置为全屏模式
        getWindow().setFlags(WindowManager.LayoutParams. FLAG_FULLSCREEN ,WindowManager.LayoutParams. FLAG_FULLSCREEN);

//闪屏的动画
        AnimationSet animationSet = new AnimationSet(false);
        RotateAnimation rotateAnimation = new RotateAnimation(0, 720, ScaleAnimation.RELATIVE_TO_SELF,0.5f,
                ScaleAnimation.RELATIVE_TO_SELF,0.5f );
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.5f, 1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0,1,0,1,
                ScaleAnimation.RELATIVE_TO_SELF,0.5f,
                ScaleAnimation.RELATIVE_TO_SELF,0.5f);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setDuration(1000);
        mImageView.startAnimation(animationSet);
        //监听动画结束后跳转到mainactivity页面中
        animationSet.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                MainActivity.startAction(SplashActivity.this);
                //当动画结束后，结束页面
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }


}
