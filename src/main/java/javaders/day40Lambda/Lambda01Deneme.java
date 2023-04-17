package javaders.day40Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01Deneme {
    public static void main(String[] args) {


        List<String> iller = new ArrayList<>(Arrays.asList("Van", "Gumushane", "MUS", "Kutahya", "Ankara", "MUS", "Ordu", "Gaziantep", "Hatay", "Edirne"));

        tumElemanlariBykHrfOlnYazdir(iller);
        System.out.println(" ");

        tumElemanlariBykHrfSonHrfGoreOlnYazdir(iller);
        System.out.println(" ");

        tumElemanlariBykHrfUzunluklarinaGoreYazdir(iller);
        System.out.println(" ");

        System.out.println(karakterSayisiBesFazlaElemanlariSilMethod(iller));
        System.out.println(" ");

        System.out.println(hIleBaslayanYadaUIleBitenElemanlariSilMethodu(iller));
        System.out.println(" ");

        System.out.println(elemanlarinKrktrSylrnKrlrnAl(iller));
        System.out.println(" ");


    }//main

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void tumElemanlariBykHrfOlnYazdir(List<String> iller) {
        iller.stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.length())).
                forEach(t -> System.out.print(t + " "));
    }


    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore artan sirada ,tekrarsiz olarak yazdiriniz
    public static void tumElemanlariBykHrfSonHrfGoreOlnYazdir(List<String> iller) {
        iller.stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.charAt(t.length()-1))).
                forEach(t -> System.out.print(t + " "));
        /*
         forEach(t -> System.out.print(t + " ")); lambda bu yapiyi sevmez bunun yerine method referans yontemini
         bulmus.
         */
    }

    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    public static void tumElemanlariBykHrfUzunluklarinaGoreYazdir (List<String> iller) {
        iller.stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);

        /*
         map(t ->t.toUpperCase()). bunun yerine  map(String::toUpperCase) bu sekilde kullanilir referean olarak
         */
    }


    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz

    public static List<String> karakterSayisiBesFazlaElemanlariSilMethod (List<String> iller) {
       // System.out.println(" ");
        iller. removeIf(t->t.length()>5);
        return iller;
    }

    // 5)"H" ile baslayan veya "u" ile biten elemanlari siliniz
    public static List<String> hIleBaslayanYadaUIleBitenElemanlariSilMethodu (List<String> iller) {
       // System.out.println(" ");
        iller. removeIf(t->t.startsWith("H") || t.endsWith("u"));
        return iller;
    }

    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin
    public static List<Integer> elemanlarinKrktrSylrnKrlrnAl  (List<String> iller) {
        //sayilardan olusan Integer bir donut olmasi icin Integer yaptik fakat arguman olarak String olarak devam ettik
      return iller.stream().
              map(utils::karesiniAl). //lambda expression   map(t-> t.length() * t.length())
              collect(Collectors.toList());
    }

    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.


}
