package com.gla;

public class Sum implements Calculator {
    int calculate(int a, int b){
        return a+b;
    }

    @Override
    public int calculator(int a, int b) {
        return 0;
    }
}
