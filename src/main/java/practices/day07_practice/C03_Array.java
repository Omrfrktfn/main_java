package practices.day07_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C03_Array {
    public static void main(String[] args) {
        /*
        Kullanicidan 4 tane rakam sisteme girmesini isteyiniz ve bu rakamlari bir array'e esayn ediniz.
        Olusturdunuz array'i yazdiriniz.
        Array'in icindeki elemanlarin ortalamasini bulunuz. ortalamayi yazdiriniz.
        Ortalamadan daha buyuk olan array elemanlarini yazdiriniz.
         */

        Scanner scan = new Scanner(System.in);

        int arr [] = new int[4];

        for (int i = 0; i < 4; i++) {//kullanicidan 4 tane rakam alacagimiz icin 0'dan 4'e kadar for dongusune aldik.
            System.out.println("Bir rakam giriniz...");
            int rakam = scan.nextInt();

            arr [i] = rakam;//kullanicidan algimiz her rakami sirasiyla array'e assayn ettik.

        }
        System.out.println(Arrays.toString(arr));


        double toplam = 0;
        for (int each:arr) {
            toplam=toplam+each;
        }

        double ortalam = toplam/arr.length;
        System.out.println(ortalam);

        for (int each:arr) {
            if (each > ortalam){
                System.out.print(each+ " ");
            }
        }

    }
}
