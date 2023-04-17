package introduction.studendeneme;

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        String carpma = scanner.nextLine();

/*
        int deger = Integer.valueOf(carpma);
        int result = deger*2;
        System.out.println("Sonuc : " + result);

 */

        try {
            int deger = Integer.valueOf(carpma);
            int result = deger*2;
            System.out.printf("Sonuc: " + result);
        }catch (NumberFormatException e){
            System.out.printf("Girdiginiz string deger sayiya cevrilemez...");
        }

        System.out.println(" ");
        System.out.println("*********************************************");

        String[] urunler = {"ürün1", "ürün2", "ürün3", "ürün4", "ürün5"};
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen ürün sırasını giriniz: ");
        int sira = input.nextInt();

        try {
            String secilenUrun = urunler[sira-1];
            System.out.println("Seçilen ürün: " + secilenUrun);
        } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Girdiğiniz sıra ürün sayısından büyük.");
        }
    }
}
