package com.amane;

public class Printer implements PrintCNM{
    @Override
    public String print(String name) {
        System.out.println(name+"nmsl!");
        return name;
    }
}
