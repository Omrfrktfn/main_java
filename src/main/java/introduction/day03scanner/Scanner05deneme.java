package introduction.day03scanner;

import java.util.Scanner;

public class Scanner05deneme {
    //kullanicidan bir dikdortgenini iki kenar uzunlugunu aliniz
    //1-alanini hesaplayiniz ==> kisa kenar carpi uzun kenar
    //2-cevresini hesaplayiniz ==> 2*kisa kenar + 2*uzun kenar

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("uzun kenari giriniz...");
        double uzunKenar = input.nextDouble();

        System.out.println("kisa kenari gininiz...");
        double kisaKenar = input.nextDouble();

        double cevre=(2*uzunKenar + 2*kisaKenar);
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + uzunKenar * kisaKenar);
    }
}
