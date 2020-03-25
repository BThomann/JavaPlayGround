package com.playground.mvc;

public class CalcModel {

    private int value;

    public void addTwoNumbers(int firstNumber, int secondNumber)
    {
        value = firstNumber + secondNumber;
    }

    public int getValue() {
        return value;
    }
}
