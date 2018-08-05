package com.study.aop;

/**
 * Created by acer on 2018/8/5.
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import javax.inject.Named;

/**
 * Aop通知类
 */
@Named
@Aspect
public class MyAdvice {
    /**
     * 前置通知
     */
    @Pointcut("execution(* com.study.Dao..*.*(..))")
    public void pointcut(){}
    //@Before("pointcut()")
    public void beforeAdvice() {
        System.out.println("前置通知......");
    }

    /**
     * 后置通知
     */
    //@AfterReturning(pointcut ="pointcut()",returning="result")
    public void afterReturingAdvice(Object result) {
        System.out.println("后置通知..  " + result);
    }

    /**
     * 异常通知
     */
    //@AfterThrowing(pointcut = "pointcut()",throwing = "e")
    public void exceptionAdvice(Exception e) {
        System.out.println("异常通知..... " + e.getMessage());
    }

    /**
     * 最终通知
     */
    //@After("pointcut()")
    public void finallyAdvie() {
        System.out.println("最终通知...");
    }


    /**
     * 环绕通知
     */
    @Around("pointcut()")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) {
        Object object = null;
        try {
            System.out.println("~~~~前置通知~~~~");
            object = joinPoint.proceed(); //代表了目标对象方法的执行
            System.out.println("~~~~后置通知~~~~" + object);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("~~~~异常通知~~~~");
        } finally {
            System.out.println("~~~~最终通知~~~~");
        }
        return object;
    }
}
