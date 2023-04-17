package practices.day_02_practice;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        // Kullanıcından adını, ikinci adını ve soyadını arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // adının ilk karakterini, ikinci adının ilk karakterini ve soyadının ilk karakterini BUYUK harfle yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soy isminizi giriniz.");
        String name = input.nextLine().toUpperCase().trim();
        char firstName = name.charAt(0);
        char secondName =name.split(" ")[1].charAt(0);
        char thirddName =name.split(" ")[2].charAt(0);

        System.out.println("Initial word: " +firstName+"-"+secondName+"-"+thirddName);

        /*
        System.out.println("Adinizi, Ikinci Adinizi ve Soyadinizi Aralarinda Bosluk Olacak Sekilde Giriniz");
        String str = input.nextLine().toUpperCase().trim();
        char adIlkKarakter = str.charAt(0);
        char ikinciAdIlkKarakteri = str.charAt(str.indexOf(" ")+1);
        char soyadIlkKarakter = str.charAt(str.lastIndexOf(" ")+1);
        System.out.println("" + adIlkKarakter + ikinciAdIlkKarakteri + soyadIlkKarakter);


         */
    }
}
