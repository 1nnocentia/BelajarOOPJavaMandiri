package com.tutorial;

import java.util.Date;

public class ExpressionStatementBlock {
    public static void main(String[] args) {
        System.out.println("Expression");
        int value;
        value = 10;
 
        System.out.println(value = 100);

        //assignment statement
        double aValue = 8933.234;
        //increment statement
        aValue++;
        //method invocation statement
        System.out.println("Hello World!");
        //object creation statement
        Date date = new Date();
    }
}
