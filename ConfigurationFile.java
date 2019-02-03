package com.wy.reflect;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

public class ConfigurationFile {

    public static void main(String[] args) throws Exception{
        Class stu=Class.forName(getValue("className"));
        Method method=stu.getMethod(getValue("methodName"));
        method.invoke(stu.getConstructor().newInstance());
    }
    public static String getValue(String key) throws Exception{
        Properties properties=new Properties();
        FileReader in=new FileReader("src/com/wy/reflect/pro.txt");
        properties.load(in);
        in.close();
        return properties.getProperty(key);
    }
}
