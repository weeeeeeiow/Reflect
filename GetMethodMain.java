package com.wy.reflect;

import java.lang.reflect.Method;

public class GetMethodMain {
    public static void main(String[] args) throws Exception {
        Class clazz=Class.forName("com.wy.reflect.Student");
        Method methodmain=clazz.getMethod("main", String[].class);
        methodmain.invoke(0,(Object)new String[]{});
    }
}
