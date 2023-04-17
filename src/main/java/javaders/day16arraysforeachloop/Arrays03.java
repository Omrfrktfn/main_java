package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz

        String names[] = {"K", "C", "R", "A", "S"};

        String eL = "E"; //Bu array'de A varmi diye bakiyourz.

        //first way
        int counter = 0;
        for (String w : names) {
            if (w.equals(eL)) {
                counter++;
                break;
            }
        }
        if (counter > 0) {
            System.out.println("Arrays has " + eL);
        } else {
            System.out.println("Arrays doesnt have " + eL);
        }

        System.out.println("************");
        //second way binarySearh() method hizli arama yapar. ************************** ONEMLIIIIII

        Arrays.sort(names);
        /*
        1-binarySearch methodunu sort kullanmadan kullanmayiniz... Cunku binarySearch mantigi sirali elemanlar
        icin gecerlidir.
        2-binarySearch methodu var olan elemanlar icin size o elemanin indexi'ni verir.
        3-binarySearch methodundan aldiginiz index sifir veya sifirdan buyukse bu o eleman Array'de var demektir.
        4-binarySearch methodu olmayan elemanlar icin negatif tam sayi degeri verir. Eksi isaretinin anlamini
        o eleman yok demektir. Sayi ise o eleman olsaydi kacinci eleman olurdu demektir.
         */
        int result = Arrays.binarySearch(names, "E");
        System.out.println(result);//A'nin index i varsa A da var demektir.

        if (result<0){
            System.out.println("Arrays doesnt have " + eL);
        }

    }
}
