/*
 * ViewClickAspect      2016-03-04
 * Copyright (c) 2016 hujiang Co.Ltd. All right reserved(http://www.hujiang.com).
 * 
 */

package com.hujiang.library.aspect.me;

import android.util.Log;

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
public class MyClickAspect {
    // 切点 call(* MyInterface.*(..))捕捉 MyInterface 定义的方法以及超类型定义的方法调用
    @After("execution(* com.hujiang.library.demo.inter.MyInterface.*(..))")
    public void filterInterface(JoinPoint joinPoint) throws Throwable {
        Log.i("helloAOP", "filterInterface=aspect:::" + joinPoint.getSignature());
    }


}