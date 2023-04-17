package javaders.day06typecastingstringmanipulation;

import java.util.Scanner;

public class C01_StringManipulation {

    public static void main(String[] args) {

        String a = "Tek Rakibim Dunku Ben";
        //*****************toUpperCase*************************\\
        String aupper = a.toUpperCase(); // butun harflari buyuk olarak yazdirir.
        System.out.println("aupper = " + aupper);

        //*****************toLowerCase*************************\\
        String aLower = a.toLowerCase();
        System.out.println("aLower = " + aLower);

        //*****************charAt*************************\\
        char initial = a.charAt(0);
        System.out.println("initial = " + initial);
        System.out.println("a.charAt(10) = " + a.charAt(10));

        char secondWords = a.split(" ")[1].charAt(0);
        char thirdWords = a.split(" ")[2].charAt(0);
        char forthWords = a.split(" ")[3].charAt(0);
        System.out.println("sonuc : " + (initial + "-" + secondWords + "-" + thirdWords + "-" + forthWords));

        System.out.println("***************************************");
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz : ");
        String name = input.nextLine();
        char ilkHarf = name.charAt(0);
        char ikinciHarf = name.split(" ")[1].charAt(0);
        char ucuncuHarf = name.split(" ")[2].charAt(0);
        System.out.println("sonuc :" + (ilkHarf + "-" + ikinciHarf + "-" + ucuncuHarf));
        System.out.println("****************************************");

        char bastanIki = a.charAt(1);
        char sonIki = a.charAt(19);
        System.out.println("sonuc : " + (bastanIki + "-" + sonIki));

        //a stringinde bulunan karekter sayisini bulunuz
        int length = a.length();
        System.out.println("length = " + length);
        // System.out.println("a.length() = " + a.length());

        //a string'indeki ilk 4 karakteri aliniz ve buyuk yaziniz
        String sb1 = a.substring(0, 4).toUpperCase();
        System.out.println("sonuc: = " + sb1);

        String sb2 = a.substring(4, 7);
        System.out.println("sb2 = " + sb2);

        // rakib kelimeisni yaziniz
        System.out.println(a.substring(4, 9).toLowerCase());

        System.out.println("a.substring(4) = " + a.substring(4));

        //a stringinde bim kelimesinin olup olmadigini kontrol ediniz.
        boolean varMi = a.contains("bim");
        System.out.println("varMi = " + varMi);

        //a stringini t harfi ile basliyip baslamadigini kontrol edinz.
        boolean start = a.startsWith("T");
        System.out.println("start T = " + start);

        System.out.println(a.startsWith("Tek", 3));
        //bu method ilk uc karekterden sonraki stringe bakar ve Tek ile baslayip
        //baslamadini kontrol eder.

        //universite numaralari yil+bolumkodu+kacincisiradagirdigi olarak
        //duzenlene bir okulda
        //ogrenci umran'in hukuk fakultesinde okuyup okumadigini gosteren kodu yaziniz
        /*
        sinif ogrt. :22
        hukuk : 33
        bilgisayar : 44
        eczacilik :55
         */

        String str = "20103301";
        System.out.println("hukuk fakultesi ogrencisimi = " + str.startsWith("33", 4));
        //4 satidan itibaren 33 kodu varmi diye kontrol eder

    }
}
