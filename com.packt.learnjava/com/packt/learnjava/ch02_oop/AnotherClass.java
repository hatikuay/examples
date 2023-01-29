package com.packt.learnjava.ch02_oop;

public class AnotherClass {
    private int result;

    public void display(String s) {
        System.out.println(s);
    }

    public AnotherClass(int result) {
        this.result = result;
    }

    public int process(int i) {
        result = i * 2;
        return result;
    }

    public int getResult() {
        return result;
    }

    double doSomething(String s, int i) {
        // some code goes here
        double a = 12.23;
        return a;
    }

    double doSomething(int s, String i) {
        // some code other code goes here
        double a = 12.23;
        return a;
    }

    String someMethod(String s, int i, double... arr) {
        // statements that compose method body
        return s;
    }
}