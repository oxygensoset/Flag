package com.company;

public class Main {
    static final String RESET = "\u001b[0m";
    static final String BLACK = "\u001b[30m";
    static final String RED = "\u001b[31m";
    static final String GREEN = "\u001b[32m";
    static final String YELLOW = "\u001b[33m";
    static final String BLUE = "\u001b[34m";
    static final String PURPLE = "\u001b[35m";
    static final String CYAN = "\u001b[36m";
    static final String WHITE = "\u001b[37m";

    public static void main(String[] args) {
        print(RESET);
        print(RESET);
        print(RESET);
        print(BLUE);
        print(BLUE);
        print(BLUE);
        print(RED);
        print(RED);
        print(RED);
    }

    public static void print(String color) {
        for (int i = 0; i < 30; i++) {
           System.out.print(color + "\u0580");
        }
        System.out.println();
    }
}
