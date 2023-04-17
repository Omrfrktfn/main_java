package javaders.day07stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {

        String s1 = "Learn java earn money";

        //*******************endsWith()******************************************
        /*
        endsWith() : Metnin belirli bir data ile bitip bitmedigini bize veririr.True yada false seklinde boolean bir
        deger dondurur. Icerisine tek karakterde de coklu karakterde koyulabilir.
         */
        //ex-1: s1 String'in money ile bitip bitmedigini kontrol eden kodu yaziniz
        boolean s1Money = s1.endsWith("money");
        System.out.println("s1Money = " + s1Money);

        //*************************replace()************************************
        //ex-2 money kelimesini dolar ile degistirn

        String change = s1.replace("money", "dollar");
        System.out.println("change = " + change);

        //ex-3 earn kelimesini win ile degistiren kodu yaziniz

        String change1 = s1.replace("earn", "win");
        System.out.println("change1 = " + change1);

        //ex-3 a hargini * ile degistiren kodu yaziniz
        String change3 = s1.replace("a", "*");
        System.out.println("change3 = " + change3);

        //ex-3 l hargini *** ile degistiren kodu yaziniz
        String change4 = s1.replace("a", "***");
        System.out.println("change4 = " + change4);

        //e olan yerleri silecek kodu yaziniz
        String change5 = s1.replace("e","");
        System.out.println("change5 = " + change5);

        //
        String change6 = s1.replace("earn","");
        System.out.println("change6 = " + change6);

        String t = "Dolma Kalem";
        //t stringindeki kalem yerine biber yerlestirinz
        String change7 = t.replace("Kalem","Biber");
        System.out.println("change7 = " + change7);

        //*********************replaceAll()***************************
        /*
        replaceAll() : Bir grup datayi degistirmek icin kullanilir.
                       Bir grup dataya =Regular Expression (regex) kullanilir.

               En Cok Kullanilan Regexler
                1) Tum Rakamlar ==> [0-9]
                2) Tum Kucuk Harfler ==> [a-z]
                3) Tum Buyuk Harfler ==> [A-Z]
                4) Tum  Harfler ==> [a-zA-Z]
                5) Tum  Harfler ve Rakamlar ==> [a-zA-Z0-9]
                6) Tum Noktalama Isaretleri ==> \\p{Punct}
                7) Tum Sesli Harfler ==> [aeiouAEIOU]

                ^  ==> den farkli, haricinde

                1) Tum Rakamlar Haric ==> [^0-9]
                2) Tum Kucuk Harfler Haric==> [^a-z]
                3) Tum Buyuk HarflerHaric ==> [^A-Z]
                4) Tum  Harfler Haric==> [^a-zA-Z]
                5) Tum  Harfler ve Rakamlar Haric==> [^a-zA-Z0-9]
                6) Tum Noktalama Isaretleri Haric==> \\p{Punct}
                7) Tum Sesli Harfler Haric==> [^aeiouAEIOU]
         */
        System.out.println("***********************************************************************");
        String s = "Mehmet Fatih bey 20 yasinda QA_Developer kursunda $ dolarla maas kazanmistir...";
        System.out.println("asil metin : " +s);

        //ex s stringideki tum rakamlari * cevirin
        String a1 = s.replaceAll("[0-9]","*");
        System.out.println("a1 = " + a1);

        //ex s stringideki tum harfleri ve tum har @ ceriniz
        String a2 = s.replaceAll("[a-zA-Z0-9]", "@");
        System.out.println("a2 = " + a2);


    }
}
