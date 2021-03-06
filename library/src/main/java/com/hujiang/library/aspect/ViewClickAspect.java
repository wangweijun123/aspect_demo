/*
 * ViewClickAspect      2016-03-04
 * Copyright (c) 2016 hujiang Co.Ltd. All right reserved(http://www.hujiang.com).
 * 
 */

package com.hujiang.library.aspect;

import android.content.Context;
import android.util.Log;
import android.view.View;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * class description here
 *
 * @author simon
 * @version 1.0.0
 * @since 2016-03-04
 */

@Aspect
public class ViewClickAspect {

    @After("execution(* android.view.View$OnClickListener.*(..))")
    public void filterInterface(JoinPoint joinPoint) throws Throwable {
        Log.i("helloAOP", "filterInterface=aspect:::" + joinPoint.getSignature());
    }

    @Pointcut("execution(* android.view.View$OnClickListener.onClick(android.view.View)) && args(view)")
    public void viewOnClick(View view) {
    }

    @After("viewOnClick(view)")
    public void onclick(View view) {
        Log.i("helloAOP", "onclick:view:" + view);
    }

}