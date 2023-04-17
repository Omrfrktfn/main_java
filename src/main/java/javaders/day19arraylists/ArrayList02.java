package javaders.day19arraylists;

import javaders.day04memorykullanimiwrapperclass.Araba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Barcelona");
        cities.add("Yozgat");
        cities.add("Miami");
        System.out.println(cities);
        //ArrayList'te bir elemanin ilk gorunumu nasil silinir.
        cities.remove("Miami");//remove boolean olan kisimi sectik
        System.out.println(cities);

        cities.remove(2);//index'i bulup silme islemi yapar. index olani secersek
        System.out.println(cities);

       // ArrayList<Integer> ages= new ArrayList<>();
        List<Integer> ages= new ArrayList<>();//en basta List'de yazilabilir
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);
        System.out.println(ages);
        //12 elemanini siliniz
        ages.remove((Integer) 12); //java'ya 12'nin index olmadigini soylemek icin wrapper class integer kullanicaz
        System.out.println(ages);

        //Bir ArrayList'teki bir elemanin tum gorunumlerini nasil sileriz.
        List<String>citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Giresun");
        citiesToRemove.add("Yozgat");

        cities.removeAll(citiesToRemove);
        System.out.println(cities);

        //iki ArrayList'in birbirine esit olup olmadigini nasil anlariz.
        //Kisa yoldan bir list olusturmak icin asagidaki list.of methodu kullanilabilir.
        List<Character> initials = List.of('a','k','c','d','k');//Arraylisti i add olmadan kisa yoldan kullanmak icin
        //list of methodu kullanilir.
        System.out.println(initials);

        List<Character> letters = List.of('a','c','k','d','k');
        //iki arrayList'in birbirine esit olup olmadigini nasil anlariz.
        //equel methodu ayni elemanlar ayni index'te oldugu surece true verir.
        boolean r1 = initials.equals(letters);
        System.out.println(r1);

        //indexof k yazarsaniz k'nin ilk gorunumunun index'ini verir
        int r2 = initials.indexOf('k');
        System.out.println(r2);

        //
        int r3 = initials.lastIndexOf('k');
        System.out.println(r3);

        //ex-1 Bir list'teki tekrarsiz elemanlri konsola yazdiran kodu yaziniz.
        List<Double> prices = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);

        for (Double w : prices){
            if (prices.indexOf(w) == prices.lastIndexOf(w)){
                System.out.print(w + " ");
            }
        }

        //ex-2 Bir list'te tekrarli eleman olup olmadigini gosteren kodu yaziniz.
        List<Double> height = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);
        int count = 0;
        for (Double w: height){

            if (height.indexOf(w) != height.lastIndexOf(w)){
                count++;
            }
        }
        if (count == 0 ){
            System.out.println("All elements are unique in the list");
        }else {
            System.out.println("At least one element is not unique in the list");
        }


    }
}
