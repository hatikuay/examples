package com.packt.learnjava.ch02_oop;

public class TheChildClass extends TheParentClass {
    private String prop;
    private static int id = 0;

    public TheChildClass(int arg1, String arg2) {
        super(arg1);
        this.prop = arg2;
        id++;
    }

    @Override
    public String toString() {
        return "TheChildClass [prop=" + prop + "]";
    }

    public TheChildClass(String prop) {
        super();
        this.prop = prop;
        id++;
    }

    public void someChildMethod() {
    }

    public static void someMethod(int i) {
        // do something
        System.out.println("Static Method");
    }

    public static int getId() {
        return id;
    }
}