package com.packt.learnjava.ch02_oop;

public class App {
    public static void main(String... args) {
        someMethod("str", 42, 10, 17, 4, 5, 6, 14);
    }

    private static String someMethod(String s, int i, int... arr) {
        for (double d : arr) {
            System.out.print(d + ", ");
        }
        // prints: 10.0, 17.23, 4.0
        return s;
    }
}

