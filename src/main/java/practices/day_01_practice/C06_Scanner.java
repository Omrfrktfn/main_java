package practices.day_01_practice;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // Kullanicidan ismini ve soyismini arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // isminin ilk karakterini ve soyisminin ilk karakterini BUYUK harfle yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen adinizi ve soyadinizi giriniz...");
        String isim = input.nextLine().toUpperCase();

        char a = isim.charAt(0);
        char a1= isim.charAt(isim.indexOf(" ")+1);
        System.out.println("sonuc : "+a+a1);



        System.out.println("************************************");
        //second way
        char first = isim.charAt(0);
        char first1 = isim.split(" ")[1].charAt(0);
        System.out.println("sonuc : " + first + " - " + first1);
    }
}
