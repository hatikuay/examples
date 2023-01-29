package com.packt.learnjava.ch02_oop;

public class NewChildClass extends TheParentClass {
    private String prop;

    public NewChildClass(int arg1, String arg2) {
        super(arg1);
        this.prop = arg2;
    }

    public NewChildClass(String prop) {
        super();
        this.prop = prop;
    }

    public void someChildMethod() {
    }
}