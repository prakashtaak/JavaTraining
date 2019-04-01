package com.java.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReflectionClient {

    static List<String> methods = Arrays.asList("getField1","getField2","getField3");

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        HeavyClass hc=new HeavyClass("abc","pqr","xyz");
        //Arrays.stream(HeavyClass.class.getDeclaredMethods()).forEach(x -> System.out.println(x.getName()));
       // Arrays.stream(HeavyClass.class.getMethods()).forEach(x -> System.out.println(x.getName()));

        Class<HeavyClass> hcClass= HeavyClass.class;

        hcClass.getDeclaredMethod("compute").getReturnType();
/*
       Field field=  hcClass.getDeclaredField("field1");

        field.setAccessible(true);
       System.out.println(field.get(hc).toString());*/

      /*Method pMethod =   hcClass.getDeclaredMethod("myPrivateMethod");
        pMethod.setAccessible(true);
      System.out.println(pMethod.invoke(hc));*/
        /*List<String> methodResults = methods.stream().map(methodName -> {
            Method method=null;
            try {
                method=  hcClass.getDeclaredMethod(methodName,null);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
            return method;
        }).map( method -> {
            String result = null;
            try {
                result = (String)method.invoke(hc,null);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            return result;
        }).collect(Collectors.toList());

        methodResults.forEach(System.out::println);*/
       /* Method method = HeavyClass.class.getDeclaredMethod("getField8",null);
        String result = (String)method.invoke(hc,null);
        System.out.println(result);*/
    }
}
