package com.packt.learnjava.ch02_oop;

public abstract class TheParentClass {
    private int prop;

    public TheParentClass() {
    }

    @Override
    public String toString() {
        return "TheParentClass [prop=" + prop + "]";
    }

    public TheParentClass(int prop) {
        this.prop = prop;
    }

    public void someParentMethod() {

    }

}
