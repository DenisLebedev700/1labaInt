package com.company;

public class INT {
    private int value;
    INT() {
        value = 0;
    }
    void increment() {
        value++;
    }
    void decrement() {
        value--;
    }
    void add(INT a) {
        this.value += a.value;
    }
    void substract(INT a) {
        this.value -= a.value;
    }

    public String toString() {
        return String.valueOf(value);
    }
    boolean equal(int a) {
        if (value == a) {
            return true;
        }
        else {
            return false;
        }
    }
}
