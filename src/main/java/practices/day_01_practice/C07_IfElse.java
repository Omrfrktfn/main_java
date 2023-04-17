package practices.day_01_practice;

import java.util.Scanner;

public class C07_IfElse {
    public static void main(String[] args) {
        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi degeri giriniz...");
        int a = input.nextInt();

        System.out.println("Lutfen bir sayi degeri daha giriniz...");
        int b = input.nextInt();

        if (a > b){
            System.out.println("sonuc : " + "ilk girilen sayi buyuk");
        }else {
            System.out.println("sonuc : " + "ikinci girilen sayi buyuk");
        }
    }
}
