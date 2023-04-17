package practices.day_02_practice;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {
         /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi degeri giriniz....");
        int a = input.nextInt();
        System.out.println("lutfen bir tam sayi degeri daha giriniz....");
        int b = input.nextInt();

        System.out.println(a==b ? ("Sayilar birbirine esittir...") : (a>b ? ("Buyuk sayi: " + a) : ("Buyuk sayi: " + b)));


    }
}
