package com.company;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        TestClass t = new TestClass();
        List<Method> methods = Arrays.stream(t.getClass().getDeclaredMethods())
                .filter(method -> method.getParameterCount()==1)
                .collect(Collectors.toList());
        for (Method m: methods) {
            m.invoke(t, )
        }
    }
}
