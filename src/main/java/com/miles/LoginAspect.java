package com.miles;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//切面类
@Aspect
@Component
public class LoginAspect {
    //前置方法
    //匹配任意修饰符 任意方法 任意数量参数
    @Before("execution(* com.miles.User.*(..))")
    public  void  Start(JoinPoint joinPoint)
    {
        //方法名
        String methodName =joinPoint.getSignature().getName();
        //参数
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("开始执行"+methodName+"方法,参数:"+args);
    }

    @AfterReturning(value = "execution(* com.miles.User.*(..))",returning = "result")
    public void End(JoinPoint joinPoint,Object result)
    {
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName+"方法执行结束,返回值是:"+result);
    }

}
