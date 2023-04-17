package javaders.day40Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> iller = new ArrayList<>(Arrays.asList("Van", "MUS", "Gumushane","Kutahya","Ankara","MUS","Ordu","Gaziantep","Hatay","Edirne"));

        System.out.println(iller);
        System.out.println(" ");

        bykHrfLengthArtanDistinct(iller);//VAN MUS ORDU HATAY ANKARA EDİRNE KUTAHYA GUMUSHANE GAZİANTEP
        System.out.println(" ");

        bykHrfSonHarfArtanDistinct(iller);
        System.out.println(" ");

        bykHrfLenghtArtanDistinctLenghtAlfabetikSira(iller);
        System.out.println(" ");

        System.out.println(krktrSysBesFzlOlanlariSil(iller));
        System.out.println(" ");

        System.out.println(seciliHarfleBitenElemanlariSil(iller));
        System.out.println(" ");

    }//main

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void bykHrfLengthArtanDistinct(List<String>iller){
        iller.stream().
                distinct().
                map(t-> t.toUpperCase()).
                sorted(Comparator.comparing(t-> t.length())).
                forEach(t-> System.out.print(t+ " "));
    }


    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void bykHrfSonHarfArtanDistinct(List<String> iller){
        iller.stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                forEach(t -> System.out.print(t + " "));
    }


    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    public static void bykHrfLenghtArtanDistinctLenghtAlfabetikSira (List<String> iller){
        iller.
                stream().
                distinct().
                map(String ::toUpperCase).
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);
    }


    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz

    public static List<String> krktrSysBesFzlOlanlariSil(List<String >iller){
        System.out.print("4) ");
        iller.removeIf(t->t.length()>5);

        return iller;
    }

    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz
    public static List<String> seciliHarfleBitenElemanlariSil(List<String> iller){
   /*     System.out.println("5)");
        iller.stream().
                filter(t->!t.startsWith("H")||t.endsWith("r")).
                forEach(System.out::print);

    */
        iller.removeIf(t-> t.startsWith("H") || t.endsWith("r"));
        return iller;
    }

    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin




    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.
}
