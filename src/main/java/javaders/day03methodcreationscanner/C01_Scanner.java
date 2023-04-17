package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {
        /*
        kullanicidan data almak icin Scanne Class i kullanilir. Ve bir input/scan/scanner objesi olusturulur
        Bu objeyi new key worduyla olustururuz.

         */

        //1.adim obje olusturma
        Scanner input = new Scanner(System.in);

        //2.adimda kullanicya ne yapacagini soluyoruz
        System.out.println("please write your salary : ");

        //3.adim kullanicidan alinan datlar yapisina ve buyuklugune gore bir  variable a yerlestirir
        long salary = input.nextLong();

        //4.adim kullanicinin verdigi bilgileri teyit edebilmesi vs. icin yazdiriyoruz
       // System.out.println("salary = " + salary);

        // Kullaniciya cinsiyetini, adini, memleketini , yasini,boyunu,
        // ulkesini sevip sevmedigini , soran bir program yaziniz

        System.out.println("lutfen cinsiyetinizi yaziniz : ");
        char cinsiyet = input.next().charAt(0);
      //  System.out.println("cinsiyet = " + cinsiyet);

        System.out.println("lutfen adinizi yaziniz : ");
        /*
        input.nextLine(); dummy atmak denir
        String name =input.nextLine(); birden fazla isim yazilabilir
         */
        String name =input.next();
      //  System.out.println("name = " + name);

        System.out.println("lutfen memleketinizi giriniz : ");
        String memleket = input.next();
       // System.out.println("memleket = " + memleket);

        System.out.println("lutfen yasinizi giriniz : ");
        byte yas = input.nextByte();
       // System.out.println("yas = " + yas);

        System.out.println("lutfen boyunuzu giriniz : ");
        double boy = input.nextDouble();
      //  System.out.println("boy = " + boy);

        System.out.println("yasadiginiz ulkeyi seviyormusuz true yada false seklinde : ");
        boolean seviyormusnuz = input.nextBoolean();
       // System.out.println("seviyormusnuz = " + seviyormusnuz);

        System.out.println("salary :"+salary+"\ncinsiyet: "+cinsiyet+"\nname: "+name+"\nmemleket"+memleket+
                "\nyas:"+yas+"\nboy:"+boy+"\nseviyormusunuz: "+seviyormusnuz);

    }
}
