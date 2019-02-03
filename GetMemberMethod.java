package com.wy.reflect;

import java.lang.reflect.Method;

public class GetMemberMethod {
    //获取Class对象
    public static void main(String[] args) throws Exception {
        Class stu=Class.forName("com.wy.reflect.Student");

        System.out.println("==============获取所有公有的方法==============");
        Method[] methods=stu.getMethods();
        for (Method m:methods){
            System.out.println(m);
        }

        System.out.println("==============获取所有的方法==============");
        methods=stu.getDeclaredMethods();
        for (Method m:methods){
            System.out.println(m);
        }

        System.out.println("==============获取公有的show1()方法==============");
        Method method=stu.getMethod("show1", String.class);
        System.out.println(method);
//        Student student=new Student();
//        method.invoke(student,"张飒");
        Object obj=stu.getConstructor().newInstance();
        method.invoke(obj,"张飒");

        System.out.println("==============获取私有的show4()方法==============");
        method=stu.getDeclaredMethod("show4", int.class);
        System.out.println(method);
        //解除私有限定
        method.setAccessible(true);
        //invoke()用来调用方法的
        Object o=method.invoke(obj,20);
        System.out.println("返回值："+o);
    }
}
