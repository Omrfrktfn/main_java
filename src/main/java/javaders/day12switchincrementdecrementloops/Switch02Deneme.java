package javaders.day12switchincrementdecrementloops;

import java.util.Scanner;

public class Switch02Deneme {
    public static void main(String[] args) {
        //Example 1: Kullanicidan iki sayi ve yapilacak islemi alan ve +,-,*,/,% islemlerini yapan kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz...");
        double a = input.nextDouble();
        System.out.println("lutfen bir sayi daha giriniz...");
        double b = input.nextDouble();

        System.out.println("Yapilacak islemi giriniz. +,-,*,/,%  den birini seciniz..");
        char opr = input.next().charAt(0); //yukari kisimda birden fazla islem girmesi halinde daima ilk olani almasi icin

        switch (opr){
            case'+':
                System.out.println("Toplama islemi sonucu : "+ (a+b));
                break;
            case'-':
                System.out.println("Cikarma islemi sonucu : "+ (a-b));
                break;
            case'*':
                System.out.println("Carpma islemi sonucu : "+ (a*b));
                break;
            case'/':
                System.out.println("Bolme islemi sonucu : "+ (a/b));
                break;
            case'%':
                System.out.println("Modulus islemi sonucu : "+ (a%b));
                break;
            default:
                System.out.println("Girilen islem tanimli degildir...");
        }
    }
}
