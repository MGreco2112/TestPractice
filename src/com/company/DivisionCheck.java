package com.company;

public class DivisionCheck {
    public static void main(String[] args) {
        double d = 10.0 / -0;

        if (d == Double.POSITIVE_INFINITY) {
            System.out.println("Positive Infinity");
        }

        if (d == Double.NEGATIVE_INFINITY) {
            System.out.println("Negative Infinity");
        }
    }
}
