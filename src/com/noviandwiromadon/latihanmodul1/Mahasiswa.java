package com.noviandwiromadon.latihanmodul1;

import java.util.Scanner;

public class Mahasiswa {
    Scanner scanner = new Scanner(System.in);

    private String nama, jns_kelamin, alamat, asal_skl, pil_jurusan, tgl_lahir;

    //constructor
    public Mahasiswa() {
        this.nama = nama;
        this.jns_kelamin = jns_kelamin;
        this.alamat = alamat;
        this.asal_skl = asal_skl;
        this.pil_jurusan = pil_jurusan;
        this.tgl_lahir = tgl_lahir;
    }


    public void pendaftar() {
        System.out.println("PENDAFTARAN MAHASISWA");
        System.out.print("Masukkan Nama                 :  ");
        nama = scanner.nextLine();
        System.out.print("Masukkan Jenis Kelamin(L/P)   :  ");
        jns_kelamin = scanner.nextLine();
        System.out.print("Masukkan Tanggal Lahir        :  ");
        tgl_lahir = scanner.nextLine();
        System.out.print("Masukkan Alamat               :  ");
        alamat = scanner.nextLine();
        System.out.print("Masukkan Asal Sekolah         :  ");
        asal_skl = scanner.nextLine();
        System.out.print("Masukkan Jurusan yang dipilih :  ");
        pil_jurusan = scanner.nextLine();

    }

    public void display() {
        System.out.println();
        System.out.println("PENDAFTARAN MAHASISWA");
        System.out.println("Nama                    : " +nama);
        System.out.println("Jenis Kelamin           : " +jns_kelamin);
        System.out.println("Tanggal Lahir           : " +tgl_lahir);
        System.out.println("Alamat                  : " +alamat);
        System.out.println("Asal Sekolah            : " +asal_skl);
        System.out.println("Jurusan yang dipilih    : " +pil_jurusan);
    }
}
