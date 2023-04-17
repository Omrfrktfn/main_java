package javaders.day05typecastingasciivaluestringmanipulation;

public class C02_AsciiValue {

    public static void main(String[] args) {

        /*
        javada char data type'ni matematiksel islemlerde kullanirsaniz
        Ascii table'deki sayisal degerleri alir.

        Numeric Data type'lari : byte-short-long-int-flat-double
        char karekterin hem sayisal deger barindirir hem de resim karekteri barindirir.
        boolean ise numeric olmayan data tipidir.

        java da char data type'ina int degerde atanabilir.Sembol harf vs de atanabilir.
        cunku char data type'nin ascii'den gelen bir sayisal ==numeric bir degeri birde
        resim karakteri vardir.

         */

        // A characterinin ASCII degerini yazdiran kodu yaziniz

        int asciiA = 'A';
        System.out.println("asciiA = " + asciiA);

        int aciia = 'a';
        System.out.println("aciia = " + aciia);

        int asciiO = 'O';
        System.out.println("asciiO = " + asciiO);

        int asciiUnlem = '!';
        System.out.println("asciiUnlem = " + asciiUnlem);

        int asciiSpace = ' ';
        System.out.println("asciiSpace = " + asciiSpace);

        String isim = "zeki";
        char ch = 'z';
        char symbol = '*';
        char rakam = '9';

        int deger = 20;
        char symboll = '$'; //dolar sembolunun ascii tablodahi degeri 36 oldugu icin onu alir
        System.out.println(deger + symboll); //20+36 = 56

        int deger2 = 0;
        char symbol2 = '+';
        System.out.println("sonuc : " + deger2 + symbol2); // be sekilde olursa concat yapar
        System.out.println("sonuc : " + (deger2 + symbol2));

        String name = "sezen";
        int number = 998;
        System.out.println(name + number);

        String str1 = "Java";
        char ch3 = 'G';
        int sayi1 = 5;
        System.out.println(str1 + ch3 + sayi1);
        System.out.println(str1 + (ch3 + sayi1)); // parentez ici onceligi ve G nin ascii degerini aldigi icin toplar

        char rakam1 = '1';
        System.out.println("rakam1 = " + rakam1);

        char rakam2 = '2';
        System.out.println("rakam2 = " + rakam2);

        char rakam3 = '3';
        System.out.println("rakam3 = " + rakam3);

        char rakam4 = '4';
        System.out.println("rakam4 = " + rakam4);

        System.out.println("rakam1+rakam2+rakam3+rakam4 = " + rakam1 + rakam2 + rakam3 + rakam4);
        System.out.println("rakam1+rakam2+rakam3+rakam4 = " + (rakam1 + rakam2 + rakam3 + rakam4)); // ascii degerlerini toplar

        //*******************Ascii degerlerinden faydalanilarak neler yapilabilr*************************

        byte b = 5;
        char ch2 = 'h';

        int asciih = 'h';
        System.out.println("asciih = " + asciih);

        System.out.println("b > ch2 = " + (b > ch2));

        long l = 54216874578l;
        System.out.println("sonuc : " + (ch2 > l));

        float f2 = 2.456648f;
        double d = 2.19658;
        System.out.println("sonuc :" + (f2 > d));

        System.out.println(" sonuc :" + (b < f2));

        int sayiInt = 100;
        long sayiLong = 100l;
        System.out.println(" "+(sayiInt<sayiLong));
    }
}
