package com.noviandwiromadon.latihanmodul1;

import java.util.Scanner;

public class DemoSuhu {

    public static void main(String[] args) {
        Scanner pilih = new Scanner(System.in);
        Suhu konversi = new Suhu();

        System.out.println("Pilih suhu dari :");
        System.out.println("1. Celcius");
        System.out.println("2. Fahreinheit");
        System.out.println("3. Kelvin");
        System.out.println("4. Reamur");
        System.out.print("Masukkan pilihan : ");
        int option = pilih.nextInt();

        switch (option){
            case 1:
                konversi.celcius();
                break;
            case 2:
                konversi.fahreinheit();
                break;
            case 3:
                konversi.kelvin();
                break;
            case 4:
                konversi.reamur();
                break;
            default:
                System.out.println("Menu tidak ada");
        }
    }
}