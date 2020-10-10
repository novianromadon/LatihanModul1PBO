package com.noviandwiromadon.latihanmodul1;

import java.util.Scanner;

public class Suhu {
    double c,r,f,k;
    Scanner input = new Scanner(System.in);

    //method celcius
    public void celcius() {
        System.out.print("Masukan Suhu : ");
        c = input.nextInt();
        f = (c * 9/5) + 32;
        k = c + 273;
        r = c * 4/5;
        System.out.println("Konversi :");
        System.out.println("Celsius    : " +c);
        System.out.println("Fahrenheit : " +f);
        System.out.println("Kelvin     : " +k);
        System.out.println("Reamur     : " +r);
    }

    //method fahreinheit
    public void fahreinheit() {
        System.out.print("Masukan Suhu : ");
        f = input.nextInt();
        c = (f-32) * 5/9;
        k = ((f-32) * 5/9) + 273;
        r = (f-32) * 4/9;
        System.out.println("Konversi :");
        System.out.println("Celsius    : " +c);
        System.out.println("Fahrenheit : " +f);
        System.out.println("Kelvin     : " +k);
        System.out.println("Reamur     : " +r);
    }

    //method kelvin
    public void kelvin() {
        System.out.print("Masukan Suhu : ");
        k = input.nextInt();
        c = k - 273;
        f = ((k - 273) * 9/5) + 32;
        r = (k - 273) * 4/5;
        System.out.println("Konversi :");
        System.out.println("Celsius    : " +c);
        System.out.println("Fahrenheit : " +f);
        System.out.println("Kelvin     : " +k);
        System.out.println("Reamur     : " +r);
    }

    //method reamur
    public void reamur() {
        System.out.print("Masukan Suhu : ");
        r = input.nextInt();
        c = r * 5/4;
        f = (r * 9/4) + 32;
        k = (r * 5/4) + 273;
        System.out.println("Konversi :");
        System.out.println("Celsius    : " +c);
        System.out.println("Fahrenheit : " +f);
        System.out.println("Kelvin     : " +k);
        System.out.println("Reamur     : " +r);
    }
}
