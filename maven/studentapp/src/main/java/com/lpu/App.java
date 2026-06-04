package com.lpu;

public class App {
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Sum: " + app.add(2, 3));
    }
}