package introduction.day03scanner;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {
        //kullanicidan bir dikdortgenini iki kenar uzunlugunu aliniz
        //1-alanini hesaplayiniz ==> kisa kenar carpi uzun kenar
        //2-cevresini hesaplayiniz ==> 2*kisa kenar + 2*uzun kenar

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen dikdortgenin bir kenar uzunlugunu girniz...");
        double uzunKenar = input.nextDouble();
        System.out.println("lutfen dikdortgenin bir kenar uzunlugunu girniz...");
        double kisaKenar = input.nextDouble();
        System.out.println("Alani = " + uzunKenar * kisaKenar);
        System.out.println("Cevresi = " + 2*uzunKenar + 2*kisaKenar);

        //double alan = uzunKenar*kisaKenar; Tavsiye edilen yontem bu  bu sekilde de kullanilabilir
       // System.out.println("alan = " + alan);

    }
}
