package com.tutorial;

public class Method { //kalau class awalnya pakai kapital
    public static void main(String[] args) {
        //method = function
        sayHelloWorld();
        sayHello("Eko","Khannedy");
    }
    static void sayHelloWorld(){ //kalau method kata pertamanya huruf kecil lanjutnya kapital lagi
        System.out.println("Hello World");
    
    }
    //method parameter
    static void sayHello(String firstname, String lastname) {
        System.out.println("Hello" + firstname + " " + lastname);
    }
}
