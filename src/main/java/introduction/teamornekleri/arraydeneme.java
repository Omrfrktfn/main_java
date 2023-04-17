package introduction.teamornekleri;

import java.util.ArrayList;
import java.util.Arrays;

public class arraydeneme {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        //String color;
        myList.add("siyah");
        myList.add("mavi");
        myList.add("kirmizi");
        myList.add("yesil");
        myList.add("mor");
        myList.add("turuncu");


        System.out.println(myList);
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println(myList.get(3));
        System.out.println(myList.get(4));
        System.out.println(myList.get(5));
      /*  System.out.print(myList); // yan yana yazdirma islemi yapiyor
        System.out.println(" ");
        myList.add(0,"pembe");
        myList.add(3,"yesil");
        System.out.println(myList);

       */
      /*  System.out.println(" ");
        for (String color : myList) {
            System.out.println(color);
        }

       */
    }
}
