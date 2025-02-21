package com.syifa.tugas3;

import java.util.Scanner;

public class Soal2 {

    public static void main(String args[]) {
      Scanner inputAngka = new Scanner(System.in);
      int a, b, c;
      
      System.out.print("Masukkan Bilangan Pertama: ");
      a = inputAngka.nextInt();
      System.out.print("Masukkan Bilangan Kedua: ");
      b = inputAngka.nextInt();
      System.out.print("Masukkan Bilangan Ketiga: ");
      c = inputAngka.nextInt();
      
      if(a>b && a>c){
          System.out.println("Bilangan "+a+" merupakan bilangan terbesar");
      }else if(b>a && b>c){
          System.out.println("Bilangan "+b+"merupakan bilangan terbesar");
      }else if(c>a && c>b){
          System.out.println("Bilangan "+c+"merupakan bilangan terbesar");
      }else{
          System.out.println("Ada bilangan yang sama besar");
      }
    }
}
