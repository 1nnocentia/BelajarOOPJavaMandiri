package com.tutorial;

public class Break {
    public static void main(String[] args) {
        //break
        var counter = 1;
        while (true) {
            System.out.println("Perulangan ke-" + counter);
            counter++;

            if (counter > 10) {
                break;
            }
        }
    }
}
