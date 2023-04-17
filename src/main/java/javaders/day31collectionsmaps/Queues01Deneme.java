package javaders.day31collectionsmaps;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues01Deneme {
    public static void main(String[] args) {

        Queue<String > wareHouse = new LinkedList<>();//ilk gelenin ilk cikmasi durumunda kullanilir.

        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Egg");
        wareHouse.add("Bread");
        wareHouse.add("Chese");

        System.out.println(wareHouse);

        wareHouse.remove();// ilk elemani siler.
        System.out.println(wareHouse);

     //   wareHouse.peek();
        System.out.println(wareHouse.peek());// ilk elemani silmeden verir. copy paste gibi
        System.out.println(wareHouse);

        System.out.println(wareHouse.element()); // peek ile ayni seyi yapti fakat queu'da list bos olursa hata verir
        System.out.println(wareHouse);

        wareHouse.clear();
        System.out.println(wareHouse);
       // System.out.println(wareHouse.element());
    }
}
