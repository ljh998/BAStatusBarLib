package com.example.bastatusbar.bar_stytle;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by BA on 2017/10/24 0024.
 *
 * @Function :设置不同的风格
 */

public class BarStytleBulider {
    private int colorResId;
    private boolean isTrans=false;
    private boolean isImageAsBg=false;
    private static AppCompatActivity activity;

    public static BarStytleBulider getStytleBuilder(AppCompatActivity appCompatActivity){
        activity=appCompatActivity;
        return new BarStytleBulider();
    }
    public  BarStytleBulider setColorResId(int colorResId){
        this.colorResId=colorResId;
        return this;
    }

    public  BarStytleBulider setTrans(){
        isTrans=true;
        return this;
    }

    public BarStytleBulider setImageAsBg(){
        isImageAsBg=true;
        return this;
    }

    public StatusBarRequest build(){
        return new StatusBarRequest(activity,isImageAsBg,isTrans,colorResId);
    }
}
