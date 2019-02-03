package com.wy.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Fanxing {
    public static void main(String[] args) throws Exception{
        ArrayList<String> strings=new ArrayList<>();
        strings.add("aaa");
        strings.add("bbb");
        //获取ArrayList的Class对象，反向的调用add()方法，添加数据
        Class listClass=strings.getClass();//得到strings字节码对象
        //获取add()方法
        Method m=listClass.getMethod("add", Object.class);
        m.invoke(strings,100);
        for (Object o:strings){
            System.out.println(o);
        }
    }
}
