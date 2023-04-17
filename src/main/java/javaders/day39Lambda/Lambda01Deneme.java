package javaders.day39Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01Deneme {

    public static void main(String[] args) {

        /*
        1)Lambda method create etme degil mevcut methodlari library'den cagirip kullanmaktir.
        2)java 8 ile eklenmistir.
        3)Functional Programing'dir. Mimari yapiya onem vermez
        4)Hiz, Clean Code ve okunabilirlik acisindan onemlidir.
         */

        List<String> iller = new ArrayList<>(Arrays.asList("Van", "Edirne", "Ordu", "Van", "Izmir", "Eskisehir", "Safranbolu", "Izmir", "Mus"));
        //add ve aslist ile ekleme yapilabilir.
        printElements(iller);
        System.out.println(" ");//karismamasi icin bos bir sout atiyoruz

        printEl(iller);
        System.out.println(" ");

        eHaricElemanYazdir(iller);//Van Ordu Van Izmir Safranbolu Izmir Mus
        System.out.println(" ");

        karakterSayisiDorttenAzYazdir(iller);//Van Van Mus
        System.out.println(" ");

        karakterSayisiDorttenCokBykHrfOlnYazdir(iller);
        System.out.println(" ");

        karakterSayisiDorttenCokTekrrsizOlnYazdir(iller);
        System.out.println(" ");

        karakterSayisiTekrrsizOlnYazdir(iller);
        System.out.println(" ");

        karakterSayisiTekrrsizKucukHrfOlnYazdir(iller);
        System.out.println(" ");

        ilkHarfiniBykDigerleriKucukYazdir(iller);
        System.out.println(" ");

        System.out.print(ilkHarfiEveyaSolnYazdir(iller));
        //System.out.println(" ");

    }

    //Example 1: Bir List'teki elemanlari console'a yazdiran method'u olusturunuz.
    //1.Yol:Structured programing
    public static void printElements(List<String> iller) {
        for (String w : iller) {
            System.out.print(w + " ");
        }
    }

    //2.Yol:LAMBDA
    public static void printEl(List<String> iller) {
        iller.
                stream().//datalari akisa aliyor
                forEach(t -> System.out.print(t + " "));
    }


    //Example 2: Bir List'teki E ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.

    public static void eHaricElemanYazdir(List<String> iller) {
        iller.stream().
                filter(t-> !t.startsWith("E")).
                forEach(t-> System.out.print(t + " "));

    }

    //Example 3: Bir List'te character sayisi 4 den az olan tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void karakterSayisiDorttenAzYazdir(List<String> iller) {
        iller.stream().
                filter(t-> t.length()<4).
                forEach(t-> System.out.print(t + " "));
    }

    //Example 4: Bir List'teki character sayisi 4 den cok olan tum elemanlari buyuk harflerle console'a yazdiran method'u olusturunuz.
    public static void karakterSayisiDorttenCokBykHrfOlnYazdir (List<String> iller) {
        iller.stream().
                filter(t-> t.length() > 4).
                map(t-> t.toUpperCase()).
                forEach(t-> System.out.print(t + " "));
    }


    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.

    public static void karakterSayisiDorttenCokTekrrsizOlnYazdir (List<String> iller) {
        iller.stream().
                distinct(). //tekrarsiz olanlari yazdirmaya yarar.
                filter(t-> t.length() > 4).
                map(t-> t.toLowerCase()).
                forEach(t-> System.out.print(t + " "));
    }

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.
    public static void karakterSayisiTekrrsizOlnYazdir (List<String> iller) {
        iller.stream().
                distinct(). //tekrarsiz olanlari yazdirmaya yarar.
                map(t-> t.toUpperCase()). // yapi degistirir
                sorted().
                forEach(t-> System.out.print(t + " "));
    }
    /*
    sorted methodu iki turlu kullanimi vardir. Icerisine arguman verilmezse , yukarida oldugu gibi natural order'a gore
    kucukten buyuge dogal siralama yapar.
    sorted methoudunda eger icerisine arguman verilirse bizim belirlemis oldugumuz parametreye gore siralama yapar.
     */

    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
    public static void karakterSayisiTekrrsizKucukHrfOlnYazdir (List<String> iller) {
        iller.stream().
                distinct(). //tekrarsiz olanlari yazdirmaya yarar.
                map(t-> t.toLowerCase()).
                sorted(Comparator.comparing(t-> t.length())).
                forEach(t-> System.out.print(t + " "));
    }

    // Example 8: Tum elemanlarin ilk harfini buyuk digerlerini kucuk yazdiran methodu olusturunuz
    public static List<String> ilkHarfiniBykDigerleriKucukYazdir (List<String> iller) {
       iller.
              stream().
              map(t->t.substring(0,1).toUpperCase() +t.substring(1).toLowerCase()).
              forEach(t-> System.out.print(t + " "));

        return iller;

    }

    //Example 9 : Tum elemanlari ilk haffi E veya S olanlari yazdiriniz.
    public static List<String> ilkHarfiEveyaSolnYazdir (List<String> iller) {
       return iller.
                stream().
                filter(t-> t.startsWith("E") || t.startsWith("S")).
                collect(Collectors.toList()); // bir akisin sonuclarini bir list'in icinde toparlamak icin kullanilir
              //  forEach(t-> System.out.print(t + " "));//eger burada yazdirmazsak main icinde sout yapariz

    }
}
