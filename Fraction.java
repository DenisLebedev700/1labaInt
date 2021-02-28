package com.company;

public class Fraction {
    private int numerator;
    private int denumerator;

    public Fraction() {
        this.numerator = 1;
        this.denumerator = 1;
    }

    public Fraction(int numerator, int denumerator) {
        this.numerator = numerator;
        this.denumerator = denumerator;
    }

    public void sum(Fraction a) {
        if (this.denumerator != a.denumerator) {
            this.numerator = this.numerator * a.denumerator;
            a.numerator = a.numerator * this.denumerator;
            this.denumerator = this.denumerator * a.denumerator;
            a.denumerator = this.denumerator;
            this.numerator = this.numerator + a.numerator;
        }
        else {
            this.numerator = this.numerator + a.numerator;
        }
    }

    public void product(Fraction a) {
        this.numerator = this.numerator * a.numerator;
        this.denumerator = this.denumerator * a.denumerator;
    }

    void show() {
        System.out.println(this.numerator + "/" + this.denumerator);
    }
}
