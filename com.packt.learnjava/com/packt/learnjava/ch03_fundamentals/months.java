package com.packt.learnjava.ch03_fundamentals;

public enum months {
    January(31), February(28), March(31), April(30), 
    May(31), June(30), July(31), August(31), 
    September(30), October(31), November(30), December(31);

    private int days;

    months(int days) {
        this.days = days;
    }

    public int getDays() {
        return this.days;
    }

    public void setTemperature(int days) {
        this.days = days;
    }

    public String toString() {
        return this.name().charAt(0) +
                this.name().substring(1).toLowerCase() +
                "(" + this.days + ")";
    }

}