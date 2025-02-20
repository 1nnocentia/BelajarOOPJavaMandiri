package com.tutorial;

public class OperationsInJava {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println("Operasi Matematika");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //augmented assignment
        System.out.println("Augmented assignment");
        int c = 100;
        c+=10;
        System.out.println(c);
        c-=10;
        System.out.println(c);
        c*=10;
        System.out.println(c);

        //unary operator
        int d = +100;
        int e = -10;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

        System.out.println(!true);

        //perbandingan
        int value1 = 100;
        int value2 = 100;

        System.out.println("Perbandingan:");
        System.out.println(value1 > value2);
        System.out.println(value1 < value2);
        System.out.println(value1 >= value2);
        System.out.println(value1 <= value2);
        System.out.println(value1 == value2);
        System.out.println(value1 != value2);

        //operasi boolean
        System.out.println("Operasi Boolean:");
        var absen = 70;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);
    }
}
