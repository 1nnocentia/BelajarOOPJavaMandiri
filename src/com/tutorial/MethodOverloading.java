package com.tutorial;

public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Eko");
        sayHello("Eko", "Kurniawan");
        
    }
    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String firstname) {
        System.out.println("Hello " + firstname);
    }
    static void sayHello(String firstname, String lastname){
        System.out.println("Hello " + firstname + " " + lastname);
    }
}
