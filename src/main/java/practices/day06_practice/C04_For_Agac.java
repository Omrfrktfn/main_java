package practices.day06_practice;

import java.util.Scanner;

public class C04_For_Agac {
    public static void main(String[] args) {
          /*

         Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
         sisteme girmesini isteyiniz.

         Asagıdaki agac seklini konsala yazdırınız


        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||


         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yaprak satir sayisini giriniz...");
        int yaprakSayi = input.nextInt();
        System.out.println("lutfen govde satir sayisisni giriniz...");
        int govdeSayi = input.nextInt();

        String yaprak = "";
        String govde ="";

        for (int i = 0; i <yaprakSayi ; i++) {
           yaprak= yaprak+"^";
            System.out.println(yaprak);
        }
        for (int i = 0; i < govdeSayi; i++) {
           // govde=govde+"||";
            System.out.println("||");
        }
    }
}
