package practices.day_01_practice;

import java.util.Scanner;

public class C05_ScannerDeneme {
    public static void main(String[] args) {
        /*
        Kullanicidan girilen isim ve soyismin ilk harflerini buyuk harf olarak konsola yazdirma
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz....");
        String name = input.nextLine().toUpperCase();

        char firstC= name.charAt(0);
        char secondC= name.split(" ")[1].charAt(0);
        char thirdC= name.split(" ")[2].charAt(0);
        System.out.println("result : "+firstC+"-"+secondC+"-"+thirdC);
    }
}
