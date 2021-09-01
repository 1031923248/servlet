package com.amane;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class main {
    public static void main(String[] args) {
        PrintCNM printCNM = new Printer();
        InvocationHandler invocationHandler = new MyInvocation(printCNM);
        PrintCNM printCNM1 = (PrintCNM) Proxy.newProxyInstance(printCNM.getClass().getClassLoader(), printCNM.getClass().getInterfaces(),invocationHandler);
        printCNM1.print("sb");
    }
}
