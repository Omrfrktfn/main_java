package javaders.day20arraylistsdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {
    public static void main(String[] args) {
        /*
        ex-1 Kullanicinin girdigi harf list'te var ise o harfi "Buldum!"'a cevirin
        yoksa o harfi list'e ekleyin...


        NOT-1:String class kullanmak tercih edilir cunku string class method acisindan cok zengin'dir
        2-List.of() kullaranrak kisa yoldan olusturabilirsiniz ama bu list'lerin elemanlari degistirilemez
            i-Bu listleerin elemanlari degistirilemez
            ii-Yeni eleman eklenemez
            iii-Bu list'lerden eleman silinemez.
         */

       // List<String> myList = List.of("A","H","J","K","M");
        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");
        myList.add("K");
        myList.add("M");
        int size =myList.size();


        Scanner input = new Scanner(System.in);

        int counter = 0;
        do{


            if (counter == size){
                System.out.println(myList);
                break;
            }

        System.out.println("Please enter a letter...");
        String letter = input.next().toUpperCase().substring(0,1);//String yapmamizin sebebi list'te string kullandigimiz icin

        //System.out.println(myList);

        if (myList.contains(letter)){
            myList.set(myList.indexOf(letter), "Buldum!");
        }else {
            myList.add(letter);
        }

            counter++;
        }while (true);
    }
}
