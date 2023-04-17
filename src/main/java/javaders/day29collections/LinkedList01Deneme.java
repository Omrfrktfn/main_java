package javaders.day29collections;

import javaders.day04memorykullanimiwrapperclass.Araba;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01Deneme {

    public static void main(String[] args) {
        // ArrayList<String > list1 = new ArrayList<>();
        // List<String > list2 = new ArrayList<>();
        // List<String > list3 = new List<>();//sag tarafa tek basina List konulamaz

       /*
       1-ArrayList'ler eleman silme ve eleman eklemede basarisizdirlar.
         o yuzden eleman silme ve ekleme islemleri coklukla yapilacaksa ArrayList kullanmak tavsiye edilmez.

       2-LinkedListler index kullanmadiklarindan dolayi eleman silme ve ekleme'de re-index yapilmasina gerek
         yoktur. Bu da LinkedListlerin eleman ekleme ve silmede cok basarili hale getirir.
         Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken durumlarda LinkedList kullanmak tavsiye edilir.

       3-ArrayListlerde "search" islemi kolay yapilir cunku indexler adres gibidir.
       4-LinkedListlerde search islemi zor yapilir cunku LinkList'ler index kullanmaz.
         Index kullanmayinca her hangi bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da
         cok fazla is demektir.
        */

        LinkedList<String> s = new LinkedList<>();
        s.add("Merve");
        s.add("Murat");
        s.add("Vildan");
        s.add("Fatih");
        s.add("Mustafa");
        s.add("Fatih");
        System.out.println(s);

        s.add(1, "Caner");
        System.out.println(s);

        s.addFirst("Ahmet");
        System.out.println(s);

        s.addLast("Omer");
        System.out.println(s);

        //   s.remove(2);
        //   System.out.println(s);

        //  s.remove("Ahmet");
        //   System.out.println(s);

        //  s.removeFirstOccurrence("Fatih");//ilk gorunumunu kaldirir
        //   System.out.println(s);

        //  s.removeLastOccurrence("Fatih");
        //    System.out.println(s);

        //   s.remove();//ilk elemani siler.
        // System.out.println(s);

        String r1 = s.peek();
        System.out.println(r1);
        System.out.println(s);

        String r2= s.poll();//cut + paste
        System.out.println(r2);
        System.out.println(s);

        String r3 = s.element();
        System.out.println(r3);
        System.out.println(s);

        //poll() ile pop() methodlari ilk node u siler ve size verir
        //poll list bos oldugudna null verir, pop ise hata verir.
        String r4 = s.pop();
        System.out.println(r4);
        System.out.println(s);


    }
}
