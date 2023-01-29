package com.packt.learnjava.ch03_fundamentals;

public class Myenum {
    enum Season {
        SPRING, SUMMER, AUTUMN, WINTER;

        public String toString() {
            return this.name().charAt(0) +
                    this.name().substring(1).toLowerCase();
        }
    }

    enum Season2 {
        SPRING(42), SUMMER(67), AUTUMN(32), WINTER(20);

        private int temperature;

        Season2(int temperature) {
            this.temperature = temperature;
        }

        public int getTemperature() {
            return this.temperature;
        }

        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }

        public String toString() {
            return this.name().charAt(0) +
                    this.name().substring(1).toLowerCase() +
                    "(" + this.temperature + ")";
        }

    }

    public static void main(String[] args) {
        System.out.println(Season.SPRING.name()); // prints: SPRING
        System.out.println(Season.WINTER.toString()); // prints: WINTER
        System.out.println(Season.SUMMER.ordinal()); // prints: 1
        Season season = Enum.valueOf(Season.class, "AUTUMN");
        System.out.println(season == Season.AUTUMN); // prints: true
        for (Season s : Season.values()) {
            System.out.print(s.name() + " ");
            // prints: SPRING SUMMER AUTUMN WINTER
        }
        System.out.println("");
        for (Season2 s : Season2.values()) {
            System.out.print(s.toString() + " ");
            // prints: Spring(42) Summer(67) Autumn(32) Winter(20)
        }
        Season2 s = Season2.SPRING;
        s.setTemperature(34);
        System.out.println(s.getTemperature());

    }
}
