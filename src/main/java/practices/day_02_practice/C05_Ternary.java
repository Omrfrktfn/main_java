package practices.day_02_practice;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {
        /*
            Kullanıcıdan bir tam sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi degeri giriniz....");
        int a = input.nextInt();

        System.out.println(a%2==0 ? ("cift sayi") : (a+3));
    }
}
