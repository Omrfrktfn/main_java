package practices.day_02_practice;

import java.util.Scanner;

public class C01_ScannerDeneme {
    public static void main(String[] args) {
        /*
        ex : Kullanicidan aldiginiz bir sekil ile asagidaki sekli olusturan kodu yazini.

             A
            A A
           A A A

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karekter veriniz...");
        char ch = input.next().charAt(0);

        System.out.println(" " + " " + ch + " " + " ");
        System.out.println(" " + ch + " " + ch + " ");
        System.out.println(ch + " " + ch + " " + ch);

        System.out.println("*******************************");
        //Kullanicidan iki sayi alip dort islem yapan ve islemlerin sonucunu ekrana yazdiran basit bir
        //hesap makinesi kodu yaziniz.
        System.out.println("Lutfen bir tam sayi veriniz....");
        int a = input.nextInt();
        System.out.println("lutfen bir tam sayi daha giriniz...");
        int b = input.nextInt();

        System.out.println("Toplam " +( a + b));
        System.out.println("Cikarma " +( a - b));
        System.out.println("bolme " +( a / b));
        System.out.println("carpma " +( a * b));


    }
}
