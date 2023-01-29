package com.packt.learnjava.ch02_oop;

public interface SomeInterface {

    public static String NAME = "Emin";

    void method1();

    String method2(int i);

    default int method3() {
        return getNumber();
    }

    default int method4() {
        return getNumber() + 22;
    }

    static int getNumber() {
        return 42;
    }

    static String someMethod() {
        return "abc";
    }
}

class SomeClass implements SomeInterface {
    public void method1() {
        // method body
    }

    public String method2(int i) {
        // method body
        return "ABC";
    }

    public int method3() {
        return 15;
    }

    public static SomeClass getInstance() {
        return new SomeClass();
    }
}
