/*
 * ApplicationAspect      2016-03-04
 * Copyright (c) 2016 hujiang Co.Ltd. All right reserved(http://www.hujiang.com).
 * 
 */

package com.hujiang.library.aspect;


import android.content.Context;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * application aspect
 *
 * @author simon
 * @version 1.0.0
 * @since 2016-03-04
 */
//@Aspect
public class ApplicationAspect {
    /*// 在Application onCreate执行的时候调用applicationOnCreate方法
    @Pointcut("execution(* android.app.Application.onCreate(android.content.Context)) && args(context)")
    public void applicationOnCreate(Context context) {

    }
    // 在调用applicationOnCreate方法之后调用applicationOnCreateAdvice方法
    @After("applicationOnCreate(context)")
    public void applicationOnCreateAdvice(Context context) {
//        AH.applicationOnCreate(context);
    }*/
}