package com.syifa.tugas3;

import java.util.Scanner;

public class Soal1 {
    
    public static void main(String args[]) {
      Scanner masuk = new Scanner(System.in);
      int a, b, c;
      
      System.out.print("Masukkan Bilangan Pertama: ");
      a = masuk.nextInt();
      System.out.print("Masukkan Bilangan Kedua: ");
      b = masuk.nextInt();
      System.out.print("Masukkan Bilangan Ketiga: ");
      c = masuk.nextInt();
      
        System.out.println("============== Hasil ==============");
      
      if(a>=1000 && a<=9999){
          System.out.println("Bilangan "+a+" merupakan bilangan ribuan");
      }else{
          System.out.println("Bilangan "+a+" bukan bilangan ribuan");
      }
      
      if(b>=1000 && b<=9999){
          System.out.println("Bilangan "+b+" merupakan bilangan ribuan");
      }else{
          System.out.println("Bilangan "+b+" bukan bilangan ribuan");
      }
      
      if(c>=1000 && c<=9999){
          System.out.println("Bilangan "+c+" merupakan bilangan ribuan");
      }else{
          System.out.println("Bilangan "+c+" bukan bilangan ribuan");
      }
    }
}
