package com.tutorial;

public class NumberConversion {

    public static void NumberConversion (String[] args) {
        
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        //byte iniByte2 = (float) iniInt; //harus manual pakai ()
    
        int iniInt2 = 1000;
        byte iniByte3 = (byte) iniInt2; // number overflow
    }
}
