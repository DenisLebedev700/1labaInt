package com.company;

public class Main {

    public static void main(String[] args) {
        /*INT firstNum = new INT();
        firstNum.increment();
        while (!firstNum.equal(512)) {
            firstNum.add(firstNum);
        }
        System.out.println(firstNum);
        for (int i = 0; i < 12; i++) {
            firstNum.decrement();
        }
        System.out.println(firstNum);
        firstNum.add(firstNum);
        System.out.println(firstNum);
	    firstNum.add(firstNum);
	    System.out.println(firstNum);*/
        Fraction first = new Fraction(0, 2);
        Fraction second = new Fraction(1, 4);
        first.sum(second);
        first.show();
        Fraction third = new Fraction(0, 2);
        Fraction fourth = new Fraction(1, 4);
        third.product(fourth);
        third.show();
    }
}
