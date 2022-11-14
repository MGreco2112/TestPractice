package com.company;

public class SerialMultiplier {
    private int first = 1;
    private int second = 1;
    private int third = 1;
    private int fourth = 1;
    private int fifth = 1;
    private int result;

    public SerialMultiplier(int first) {
        this.first = first;
        storeResult();
    }

    public SerialMultiplier(int first, int second) {
        this.first = first;
        this.second = second;
        storeResult();
    }

    public SerialMultiplier(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
        storeResult();
    }

    public SerialMultiplier(int first, int second, int third, int fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        storeResult();
    }

    public SerialMultiplier(int first, int second, int third, int fourth, int fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        storeResult();
    }

    private void storeResult() {
        result = first * second * third * fourth * fifth;
    }

    public String toString() {
        return Integer.toString(result);
    }

}
