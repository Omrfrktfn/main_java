package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        //kullanicidan alacaginiz 4 basamakli sayinin ilk ve son rakaminin toplamini
        //ekrana yazdiran programi yaziniz

        // % ==> Modulus operatoru syinin bolumunden kalan sayiyi verir

        Scanner input = new Scanner(System.in); //Beyza
        System.out.println("Lutfen 4 basamakli bir sayi giriniz...");
        int sayi= input.nextInt();//8649
        int sonRakam = sayi%10;//9
        int ilkRakam = sayi/1000;//8
        System.out.println("IlkRakam+ sonRakam = "+(ilkRakam+sonRakam));

    }
}
