package com.codecool.junitsample;

public class Sample {

    //function doubles returns the value of argument
    public int DoubleANumber(int num) {
        return num * 2;
    }

    //function returns true if input data equals Codecool, otherwise returns false
    public boolean GetBoolean(String inputData) {
        if ("Codecool".equalsIgnoreCase(inputData)) {
            return true;
        } else {
            return false;
        }
    }

    //functions prints a text to terminal in case of proper argument, otherwise throws and exception
    public void DoSomething(String inputData) {
        if ("Codecool".equalsIgnoreCase(inputData)) {
            System.out.println("Writes the input data into the terminal");
        } else {
            throw new IllegalArgumentException("Bad argument:" + inputData);
        }
    }

}
