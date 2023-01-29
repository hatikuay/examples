package com.packt.learnjava.ch03_fundamentals;

import static com.packt.learnjava.ch02_oop.SomeInterface.NAME;

public class Packages {
    public static void method() {
        System.out.println(NAME);
    }

    static void modifyParameter(int x) {
        x = 2;
    }

    public static void main(String[] args) {
        int x = 1;        
        modifyParameter(x);
        System.out.println(x); // prints: 1
    }
}
