package com.company;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Generator<T> {
    private T t;
    private List<Method> setters;
    private Class c;

    public Generator(){
        t = (T)(new Object());
        c = t.getClass();
        setters = Arrays.stream(c.getDeclaredMethods())
                .filter(method -> method.getParameterCount()==1)
                .collect(Collectors.toList());
    }

    public T getObject() {
        for(Method m: setters){
            Type[] typeParameters = m.getTypeParameters();
            if(typeParameters.length == 0){
                return t;
            }else if(typeParameters.length ==1)
        }
    }


}
