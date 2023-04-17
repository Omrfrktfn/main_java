package javaders.day03methodcreationscanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C02_ScannerDeneme {
    public static void main(String[] args) {

        /*
        Kullanicidan data almak icin Scanner classinda scan/input/scanner objesi olusturulur.
        Bu sekilde kullaniciyi y,nlendrerek gerekli datalari elde ederiz
         */

        /*
        1- Obje olusturma
        2- Kullanicya ne yapacaginin soylenmesi
        System.out.println("lutfen cinsiyetnizi giriniz K/E seklind ");
        3- Kullanicidan alinan data yapisina,buyuklugune  uygun bir variable'in icine yerlestirilir
        char cinsiyet=input.next().charAt(0);
        4- Ekranda g,rebilmek icin ve kullanicinda verdigi bilgeleri teyi edebilmesi icin yazdiriyoruz
        System.out.println(cinsiyet : + cinsiyet")

         */

        //Kullaniciya cinsiyetini, adini , memleketini, yesini, boyunu
        //ulkesini sevip sevmedigini, maasini soran bir program yazin

          Scanner input = new Scanner(System.in);
        System.out.println("please write your gender : ");
        char gender = input.next().charAt(0);

        System.out.println("please write your name : ");
        String name =input.next();

        System.out.println("please write your hometown : ");
        String hometown =input.next();

        System.out.println("please write your age :");
        byte age =input.nextByte();

      //  System.out.println("please write your length : ");
      //  short length = input.nextShort();

        System.out.println("please write your length : ");
        double llegth = input.nextDouble();

        System.out.println("do you love the country you lived in :");
        boolean love = input.nextBoolean();

        System.out.println("please write your salary : ");
        long salary = input.nextLong();

        System.out.println("gender: "+gender+"\nname: "+name+"\nhometown: "+hometown+"\nage: "+age+"\nlength: " +llegth+
                "\nlove: "+love+"\nsalary: "+salary);


      }
}
