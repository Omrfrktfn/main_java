package javaders.day10stringmanipulations;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {
        // if it rains, i will cancel the picnic

        //ex:Verilen karakter buyuk harf ise ekran yazdiriniz
        char ch = 'a';
        int a = 'A'; //Buyuk harfler icin buyuk harf araligindaki ascii degerlerden ogrenebilir.
        System.out.println("ASCII DEGERI = " + a);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk Harf");
        }
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Kucuk Harf");
        } else {
            System.out.println("Girilen deger harf degil");
        }
        System.out.println("*******************************");
        int number = 9;
        if (number % 2 == 0) {
            System.out.println("Cift sayi");
        } else {
            System.out.println("Tek");
        }

        System.out.println("**********************************");
        //verilen bir sayi 300 den kucuk veya 1200 den buyuk ise harika sayi yazdiran kodu yaziniz
       int number1 = 1201;
        if (number1< 300 || number1 >1200){
            System.out.println("HARIKA SAYI");
        }else {
            System.out.println("HARIKA SAYI DEGIL");
        }
        System.out.println("****************************");
        //kullanicidan alinan datanin tek mi cift mi oldugnu yazdiran kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("please write your number ...");
        int number2 = input.nextInt();
        if (number2 % 2 ==0){
            System.out.println("Cift sayi");
        }if (number2 % 2 != 0){
            System.out.println("Tek sayi");
        }

        System.out.println("***********************");

        //verilen bir sayinin pozitif mi negatif mi notr mu oldugunu kontrol eden kodu yaziniz
        int number3 = 65;
        if (number3>0){
            System.out.println("pozitif");
        }if (number3<0){
            System.out.println("Negatif");
        } else if (number3 ==0) {
            System.out.println("notr");
        }
    }
}
