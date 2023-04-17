package javaders.day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();
        //Queue ==> Ilk giren urun ilk cikmalidir.  First In First Out .Bankalardaki numaralandirma sistemi bu sekildedir.

        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");

        System.out.println(wareHouse);

        wareHouse.remove();//ilk elemani silecek.
        System.out.println(wareHouse);

        System.out.println(wareHouse.peek());//ilk elemani silmeden bize verir. Bos listler icin null verir
        System.out.println(wareHouse);

        System.out.println(wareHouse.element());//bos listler icin hata verir peek ile farki
        System.out.println(wareHouse);

        System.out.println(wareHouse.poll());//ilk elemani silerek bize verir. Bos olanlar icin null verir
        System.out.println(wareHouse);

        wareHouse.clear();
        System.out.println(wareHouse.poll()); //bos icin ilk elemani istedigimde null verir.
       // System.out.println(wareHouse.remove());//remove ise hata verdi.


    }
}
