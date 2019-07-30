package com.kodilla;

public class Calculator {

    public int addAtoB(int a, int b){
        return a + b;

    }

    public int subtractAfromB(int a, int b){
        return b - a;

    }

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        int addResult = calculator.addAtoB(5, 7);
        int subtractResult = calculator.subtractAfromB(5,11);
        System.out.println("Result 1: " + addResult);
        System.out.println("Result 2: " + subtractResult);

    }
}
