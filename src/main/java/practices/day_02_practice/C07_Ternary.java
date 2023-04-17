package practices.day_02_practice;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {
         /*
        Kullanıcıdan bir karakter sisteme girmesini isteyin.
        Ternary kullanarak;
        bu karakterin bir harf olup olmadıgını kontrol edin.
        Harf ise büyük veya kucuk harf oldugunu konsola yazdırın
        Harf degilse konsola "Harf Degil" yazdırın
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        char a = input.next().charAt(0);

        System.out.println((a>='a' && a<='z') || (a>='A' && a<='Z') ? (a>='A' && a<='Z' ? "Buyuk Harf" : "Kucuk Harf") : ("Harf Degil"));
    }
}
