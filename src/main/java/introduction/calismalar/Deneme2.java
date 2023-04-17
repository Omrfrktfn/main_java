package introduction.calismalar;

import java.util.Scanner;

public class Deneme2 {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        // System.out.print("Bir metin girin: ");
        String metin = "Bugun hava oldukca guzel.";

        int sayac = 0;
        for (int i = 0; i < metin.length(); i++) {
            char harf = metin.charAt(i);
            if (harf == 'a') {
                sayac++;
            } else if (harf == 'c') {
                break;
            }
        }

        System.out.println("Metinde " + sayac + " adet 'a' harfi vardır.");


        System.out.println("*****************************************");


        int sayi[][] = {{1, 2, 3}, {4, 5, 6}};

        int carpma = 1;
        for (int[] w : sayi) {
            for (int k : w) {
                carpma = carpma * k;
            }
        }
        System.out.println(carpma);

        System.out.println("**************************");


        int carpma1 = 1;
        for (int i = 0; i < sayi.length; i++) {
            for (int s = 0; s < sayi[i].length; s++) {
                int a = sayi[i][s];
                carpma1 = carpma1 * a;
            }
        }
        System.out.println(carpma1);

        System.out.println("**************************");


        Scanner input = new Scanner(System.in);
        int sayi1 = 0;
        int toplam = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ". sayiyi giriniz: ");
            sayi1 = input.nextInt();
            if (sayi1 < 5 || sayi1 > 10) {
                toplam += sayi1;
            }
        }
        System.out.println("Girilen sayilarin 5 ile 10 arasindakiler haric toplami: " + toplam);

        System.out.println("******************************");


        System.out.print("Lutfen musteri kartiniz varsa var yoksa yok yaziniz");
        boolean deger = input.nextBoolean();

        if (deger) {
            System.out.println("Kullanici var dedi.");
        } else {
            System.out.println("Kullanici yok girdi.");
        }

    }
}
