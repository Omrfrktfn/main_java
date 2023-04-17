package introduction.calismalar;

import java.util.Arrays;

public class Deneme1 {
    public static void main(String[] args) {

       // String name1 [] = new String[5];
        String name [] ={"Ali","Veli","Ayse","Fatma"};
        System.out.println(Arrays.toString(name));

        System.out.println("************************************");

        name [0]= "Can";
        name [2]= "Gul";
        System.out.println(Arrays.toString(name));

        System.out.println("******************************************");

        int[] array = {1, 2, 3}; // Verilen 3 elemanlı dizi
        int temp = array[0]; // Dizinin ilk elemanını geçici bir değişkende sakla
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1]; // Her elemanı bir soldaki konuma taşı
        }
        array[array.length - 1] = temp; // Geçici değişkendeki ilk elemanı dizinin sonuna ekle
        System.out.println(Arrays.toString(array)); // Diziyi yazdır

        System.out.println("*********************************************");

        int sum = 0;
        for (int w : array){
            sum = sum +w;
        }
        System.out.println("Toplamlari : " + sum);

        System.out.println("************************************************");

        //ex bir char array olusturunuz uc eleman ekleyiniz elemanlarin carpimini bulup concola yazdiriniz

        char initial[] = new char[3];

        initial[0] = 'J';
        initial[1] = 'P';
        initial[2] = 'A';

        int carpim = 1;
        for (char w : initial) {
            carpim = carpim*w;
        }
        System.out.println("carpim sonucu : " + carpim);

        System.out.println("************************************************");

        //  int grades[] = new int[5]; // bes ogrenci notu girelim

        int grades[] = {67, 98, 100, 34, 76};
        System.out.println(Arrays.toString(grades));

        //grades array'in deki en kucuk ve en buyuk grade'in toplamini ekrana yazdiran kodu ekrana yadirin.

        Arrays.sort(grades); // kucukten buyuge siralama islemi yapar 34 67 76 98 100
        System.out.println(Arrays.toString(grades)); //
        System.out.println(grades[0] + grades[grades.length - 1]);


        System.out.println("********************************");

    }
}
