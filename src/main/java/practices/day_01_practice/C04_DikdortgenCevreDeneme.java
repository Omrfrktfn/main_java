package practices.day_01_practice;

import java.util.Scanner;

public class C04_DikdortgenCevreDeneme {
    public static void main(String[] args) {
        /*
        kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz
        ve dikdorgenin cevresin hesaplayarak ekrana yazdirniz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Dikdortgenin ilk kenar uzunlugunu giriniz....");
        int a = input.nextInt();
        System.out.println("Dikdortgenin ikinci kenar uzunlugunu giriniz....");
        int b = input.nextInt();

        int cevre = 2*(a+b);
        System.out.println("cevre = " + cevre);
    }
}
