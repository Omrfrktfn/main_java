package javaders.day07stringmanipulations;

public class C01_StringManipulationsDeneme {
    public static void main(String[] args) {
        String s = "Learn Java earn money";
        //**************************endsWith********************************
        /*
        endsWith() : Metnin belirli bir datayla bitip bitmedigini kontrol eder.
        Bize boolean bir sonuc dondurur.
        Tek karekterde , coklu karaktede kullanilabilir
         */

        //Ex -1 : s string "money" ile bitip bitmedigini kontrol ediniz.
        boolean isEnd = s.endsWith("money");
        System.out.println("isEnd = " + isEnd);

        //**********************replace () ***************************
        /*
        replace() metnin icerisindeki belirli bir datanin yerine verilen diger datayi yerlestirir.
        String bir data dondurur tekli katakter ile de coklu karakter ile de calisir.
        Ancak her ki taraftada "" yada her iki tarafta da '' kullanilmalidir.
         */

        //ex-2: s String'indeki money kelimesini dollar ile degistiriniz

        String s1 = s.replace("money", "dolar");
        System.out.println("s1 = " + s1);

        //Ex : s String'indeki "earn" kelimesini "win" kelimesine ceviriniz

        String s2 = s.replace("earn", "win");
        System.out.println("s2 = " + s2);

        // Ex : s String'indeki "a" harflerini "*" degistiriniz

        String s3 = s.replace('a', '*');
        System.out.println("s3 = " + s3);

        // Ex : s String'indeki "n" harflerini "***" degistiriniz
        String s4 = s.replace("n", "***");
        System.out.println("s4 = " + s4);

        // Ex : s String'indeki tum "e" harflerini siliniz
        String s5 = s.replace("e", "");//eger bos kalmasini istersek aray bosluk birakiriz.
        System.out.println("s5 = " + s5);

        //********************* replaceAll() **************************\\
       /*
        replaceAll() Bir grup datayi degistirmek icin kullanilir.
                     Bir grup datayi ifade edebilmek icin Regular
                     Expression (Regex) kullanilir
         */

        String t = "Yucel 25 ya$indadir sandik ama 30'mis!.";

        // Ex : t String'indeki tum rakamlari "*"'a ceviriniz
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println("t1 = " + t1);

         /*
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
        // Ex : t String'indeki tum harfleri ve tum rakamlari ! ceviriniz.
        System.out.println("all words is replace ! = " + t.replaceAll("[a-zA-Z0-9]", "!"));

        // Ex : t String'indeki tum space'ler disindaki karakterleri + 'ya donusturunuz
        String t2 = t.replaceAll("[^ ]", "+");
        System.out.println("t2 = " + t2);

        //Ex : t String'indeki tum kucuk harfler disindaki   karakterleri ? 'ne donusturunuz

        String t3 = t.replaceAll("[^a-z]", "?");
        System.out.println("t3 = " + t3);

        //Ex : t String'indeki tum sesli harfler disindaki  karakterleri & 'ne donusturunuz
        String t4 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println("t4 = " + t4);

        // Ex : s String'indeki tum spaceler disindaki karakterleri "+" ceviriniz
        String t5 = t.replaceAll("[^ ]", "+");
        System.out.println("t5 = " + t5);

        // Ex : s String'indeki tum kucuk harfler disindaki karakterleri "*" ceviriniz
        String t6 = t.replaceAll("[^a-z]", "*");
        System.out.println("t6 = " + t6);

        // Ex : s String'indeki tum sesli harfler disindaki karakterleri "&&" ceviriniz
        String t7 = t.replaceAll("[^aeiouAEIOU]","&&");
        System.out.println("t7 = " + t7);


    }
}
