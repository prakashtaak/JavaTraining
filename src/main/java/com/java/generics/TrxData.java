package com.java.generics;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.List;

public interface TrxData<T extends TrxData> {

    T getThisObject();

    TrxMeta getMetaObject();

    default String getFieldsValuesAsString() {
        getMetaObject().fieldNames().stream()
                .map(e -> getReadMethod(e.toString()));
        return "";
    }

    default Method getReadMethod(String name) {
        Method readMethod = null;
        try {
            readMethod = new PropertyDescriptor(name, getThisObject().getClass()).getReadMethod();
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        return readMethod;
    }


}

interface TrxMeta<T extends TrxMeta> {

     List<String> fieldNames();


}
