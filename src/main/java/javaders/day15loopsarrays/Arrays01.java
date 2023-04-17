package javaders.day15loopsarrays;

import java.util.Arrays;

public class  Arrays01 {
    public static void main(String[] args) {
        /*
        1-Array; Java'nin coklu ayni data tipinde coklu data depolamak icin olusturdugu bir yapidir.
        2-Array'lar primitive data type'lari yada referenceler ile calisir
        3-Array'lerin super hizli olmasinin tercih etmistir.Memory de cok az yer kaplarlar
         */

        String stdName[] = new String[5]; //Array olusturmak icin yazilmasi gereken kisim.
        //noktali virgulden once data sayisini yazmazsak hata verir

        //Array nasil yazdirilir.
        System.out.println(Arrays.toString(stdName));

        //Array'a nasil eleman eklenir.
        stdName[0] = "Ajda";
        System.out.println(Arrays.toString(stdName));

        stdName[3] = "Cuneyt";
        System.out.println(Arrays.toString(stdName));

        stdName[2] = "Kemal";
        System.out.println(Arrays.toString(stdName));

        stdName[1] = "Ayhan";
        System.out.println(Arrays.toString(stdName));

        stdName[4] = "Filiz";
        System.out.println(Arrays.toString(stdName));

        //Array'deki specific bir elemani nasil alabiliriz.
        System.out.println(stdName[3]);//Sadece cuneyti yazdirir. ozel bir eleman almak icin

        //ex : stdName array'indeki her ismin sonuna yildiz koyarak consola yazdiriniz

        for (int i = 0; i < stdName.length; i++) {//length stringlerde parentezli arrayler de parantezsiz kullanilir.

            System.out.println(stdName[i] + " ***");
        }

        System.out.println("*****************");

        //second way for each loop ==> enhanced zenginlestiril loop demek.Mumkumnse bu loop kullanilir.
        for (String w : stdName) {
            System.out.println(w + " **");
        }

        System.out.println("********************************");
        //ex bir integer Array olusturunuz. Bes eleman ekleyiniz. Elemanlarin toplamini bulup consola yazdiriniz.
        int eleman[] = new int[5];
        System.out.println(Arrays.toString(eleman));

        eleman[0] = 12;
        eleman[1] = 23;
        eleman[2] = 9;
        eleman[3] = 38;
        eleman[4] = 27;
        System.out.println(Arrays.toString(eleman));

        int sum = 0;
        for (int w : eleman) {
            sum = sum + w;
        }
        System.out.println("Toplam : " + sum);

        System.out.println("********************************");
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


    }
}
