package introduction.ssgcalismalari;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        System.out.println("hesap makinesine hos geldiniz");
        /*
        toplama
        cikarma
        bolme
        carpma
         */
        toplama();
        System.out.println("cikarma() = " + cikarma());
        System.out.println("bolme() = " + bolme());
        carpma();
        tumIslemler();
        kapanis();

    }

    public static double toplama() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double sayi = scan.nextDouble();
        double sayi1 = scan.nextDouble();
        System.out.println(sayi + sayi1);
        return sayi + sayi1;

    }

    public static double cikarma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double sayi = scan.nextDouble();
        double sayi1 = scan.nextDouble();
        // System.out.println(sayi-sayi1);
        return sayi - sayi1;
    }

    public static double bolme() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double sayi = scan.nextDouble();
        double sayi1 = scan.nextDouble();
        //System.out.println(sayi/sayi1);
        return sayi / sayi1;
    }

    public static double carpma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double sayi = scan.nextDouble();
        double sayi1 = scan.nextDouble();
        System.out.println(sayi * sayi1);
        return sayi * sayi1;
    }

    public static double tumIslemler() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double sayi = scan.nextDouble();
        double sayi1 = scan.nextDouble();
        System.out.println("Toplama : "+ (sayi + sayi1));
        System.out.println("cikarma : "+(sayi - sayi1));
        System.out.println("bolme : "+(sayi / sayi1));
        System.out.println("carpma : "+(sayi * sayi1));
        return 0;
    }
    public static void kapanis (){
        System.out.println("islemleriniz bitmistir");
    }

}
