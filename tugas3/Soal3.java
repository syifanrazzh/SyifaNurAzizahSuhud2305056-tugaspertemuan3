package com.syifa.tugas3;

import java.util.Scanner;

public class Soal3 {

    public static void main(String args[]) {
        Scanner inputObj = new Scanner(System.in);
        
        int masuk, keluar;
        System.out.print("Masukkan jam masuk : ");
        masuk = inputObj.nextInt();
        System.out.print("Masukkan jam keluar : ");
        keluar = inputObj.nextInt();
        
        int lama, tarif, tambahan, jamTambahan;
        if(keluar<masuk){
            lama= (12-masuk)+keluar;
        }else{
            lama=keluar-masuk;
        }
        System.out.println("Lama parkir "+lama+" jam\n ");
        
        if(lama <= 2){
            tarif = 1500;
            System.out.println("Rp. "+tarif);
        }else{
            tarif = 1500;
            jamTambahan = lama - 2;
            tambahan = tarif + jamTambahan * 1000;
            System.out.println("Biaya parkir = Rp. "+tambahan);
        }
    }
}
