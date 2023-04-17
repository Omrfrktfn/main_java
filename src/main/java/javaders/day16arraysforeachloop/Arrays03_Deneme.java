package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03_Deneme {
    public static void main(String[] args) {
        //specific bir elemanin Array'de olup olmadigini anlamak icin gereken kodu yaziniz.
        String names[] = {"K", "C", "R", "A", "S"};
        String el = "R";

        int counter = 0;
        for (String w : names) {
            if (w.equals(el)) {
                System.out.println(el);
                counter++;
                break;
            }
        }
        if (counter > 0) {
            System.out.println("Array has ==> " + el);
        } else {
            System.out.println("Array does not have ==> " + el);
        }

        System.out.println("*********************************************");
        //second way : binarySearch
        Arrays.sort(names); // siralam islemi yaptiktan sonra kullanmaya devam etmeliyiz.
        int result = Arrays.binarySearch(names,el);
        if (result <0){
            System.out.println("Array does not have ==>" + el);

        }else {
            System.out.println("Array has ==> " + el);
        }
    }

}
