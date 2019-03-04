package com.java.exercies;

import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static Map<String,String> mapOfData=new HashMap<>();
    public int a;

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        App1 appCLs = (App1)Class.forName("com.java.exercies.App1").newInstance();
        /*ClassLoader cl = app1.getClassLoader();
        App1 appCLs = (App1)cl.loadClass("App1").newInstance();*/
        appCLs.a=10;
        System.out.println(appCLs.a);
    }
}
