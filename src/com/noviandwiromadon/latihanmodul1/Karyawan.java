package com.noviandwiromadon.latihanmodul1;

import java.util.Scanner;

public class Karyawan {

    private static int umur, lahir, now, masuk, masakerja, thn = 2020;
    private static String nama, nik, alamat, jk;
    private static long gaji, gaji_pokok = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("INPUT DATA KARYAWAN");
        System.out.print("Nama Karyawan                : ");
        nama = scanner.nextLine();
        System.out.print("NIK Karyawan                 : ");
        nik = scanner.nextLine();
        System.out.print("Alamat Karyawan              : ");
        alamat = scanner.nextLine();
        System.out.print("Jenis Kelamin Karyawan (P/L) : ");
        jk = scanner.nextLine();
        System.out.print("Tahun Lahir Karyawan         : ");
        lahir = scanner.nextInt();
        System.out.print("Tahun Masuk Karyawan         : ");
        masuk = scanner.nextInt();

        now = thn - lahir;
        masakerja = thn - masuk;
        System.out.println();

        System.out.println("DATA KARYAWAN");
        System.out.println("Nama                : " +nama);
        System.out.println("NIK                 : " +nik);
        System.out.println("Alamat              : " +alamat);
        System.out.println("Jenis Kelamin       : " +jk);
        System.out.println("Umur                : " +now+ " Tahun");
        System.out.println("Tahun Masuk Kerja   : "+masakerja);

        masakerja = thn - masuk;

        System.out.print("Gaji Karyawan        : ");
        if(masakerja <= 5)
        {
            gaji = gaji_pokok + 3000000;
            System.out.println("Rp 3.000.000");
        }
        else
        if(masakerja >= 5)
        {
            gaji = gaji_pokok + 6000000;
            System.out.println("Rp 6.000.000");
        }
        else
        {
            gaji = gaji_pokok + 0;
            System.out.println("Rp.0");
        }
    }
}