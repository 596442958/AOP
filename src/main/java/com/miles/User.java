package com.miles;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("user")
public class User {
    public void  GetUser(String userName)
    {
        System.out.println("用户名："+userName);
    }
    public int  GetAge(Integer age)
    {
        System.out.println("年龄是:"+age);
       return  age;
    }
}
