/*
 * AOPActivity      2016-03-28
 * Copyright (c) 2016 hujiang Co.Ltd. All right reserved(http://www.hujiang.com).
 * 
 */
package com.hujiang.library.demo;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.hujiang.library.javaexeceptionlib.MyClass;
import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * class description here
 *
 * @author simon
 * @version 1.0.0
 * @since 2016-03-28
 */
@Route(path = "/com/AOPActivity")
public class AOPActivity extends Activity {
    String url = "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg3.duitang.com%2Fuploads%2Fitem%2F201509%2F22%2F20150922121054_5PyBN.jpeg&refer=http%3A%2F%2Fimg3.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1632668788&t=fb6ef37daa084606a959fd1dea8de191";
//    String url = "http://cichang.hujiang.com/images/friendquan_share.png"; // 抛异常去捕获
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // test
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        setContentView(R.layout.aop_activity_layout);
        ImageView imageView = (ImageView)findViewById(R.id.img_t);
        ImageLoader.getInstance().displayImage(url, imageView);

        MyClass.exeception();
        SharedPreferences xxxx = getSharedPreferences("xxxx", Context.MODE_PRIVATE);
        xxxx.edit().putInt("xxx", 12);
    }

    @Override
    protected void onResume() {
        super.onResume();

        new AspectJavaDemo().work();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}