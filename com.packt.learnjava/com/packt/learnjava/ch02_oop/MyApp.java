package com.packt.learnjava.ch02_oop;

import java.util.ArrayList;
import java.util.List;

public class MyApp {
    public static void main(String[] args) {

        SomeClass sc = new SomeClass();
        sc.method1();
        sc.method2(22); // returns: "abc"
        System.out.println(sc.method2(22)); // prints: abc
        sc.method3(); // returns: 42
        System.out.println(sc.method3()); // prints: 42

    }

    void someMainMethod(TheParentClass a) {

    }
}