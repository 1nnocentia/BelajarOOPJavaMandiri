package com.tutorial;

public class MethodVariableArgument {
    public static void main(String[] args) {
        
        sayCongrats("Eko", 80,80, 90, 49);
    }
    static void sayCongrats (String nama, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + nama + ", anda lulus");
        } else {
            System.out.println("Maaf " + nama + ", anda tidak lulus");
        }
    }
}
