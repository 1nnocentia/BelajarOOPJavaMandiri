package com.tutorial;

public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Innocentia Handani";
        System.out.println(name);

        int age = 24;
        String address = "Indonesia";
        System.out.println(age);
        System.out.println(address);

        var age2 = 24; //java langsung membaca tipe data
        System.out.println(age2);

        //varibel konstan (tidak bisa berubah value)
        final String name2 = "Innocentia Handani";

        //konversi dari tipe primitif
        int age3 = 30;
        Integer age3Object = age;

        int age3Again = age3Object;

        //kalau tidak sama tipe datanya
        short shortAge3 = age3Object.shortValue();
        byte byteAge3 = age3Object.byteValue();

        //Array
        String[] arrayStrings;
        arrayStrings = new String[3]; //jumlah data yang ditampung
        arrayStrings[0] = "Innocentia";
        arrayStrings[1] = "Handani";
        arrayStrings[2] = "Innocent";

        System.out.println(arrayStrings[0]);

        String[] stringArray2 = new String[3];

        String[] namaNama = {
            "Innocentia", "Handani", "Innocent"
        };

        //array initializer
        int[] arrayInt = new int[]{
            10, 95, 80, 67, 29
        };

        long[] arrayLong = {
            10, 98, 80, 67, 29
        };

        System.out.println(arrayLong.length);

        //Array dalam array
        String[][] members = {
            {"Eko", "Kurniawan", "Khannedy"},
            {"Budi", "Nugraha"},
            {"Joko", "Morro"},
        };
        String[] member1 = members[0];
        System.out.println(member1[0]);
        System.out.println(members[1][0]);
        System.out.println(members[2][0]);

    }
}
