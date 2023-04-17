package javaders.day20arraylistsdatetime;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01Deneme {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");

        System.out.println(cities);

        //Bu arrayList'te bir elemanin ilk gorunumu nasil silinir.
        cities.remove("Miami");
        System.out.println(cities);

        cities.remove(2);
        //System.out.println(cities.remove(2));//silinen olan index'teki ni gosterir
        System.out.println(cities);

        //remove methodu eleman ile kullanilirsa ilk gorunummu siliyor.
        //remove methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden true yada fasle verir

        //ex-1 Bir integer list olusturun ve bu list'ten 12 elemanini siliniz
        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);
        System.out.println(ages);

        // ages.remove(12);//bu sekilde index'i bulup silme islemi yapar hata verir
        ages.remove((Integer) 12); //bu sekilde integer olarak cevirip silme islemi yapar wraper class'a
        System.out.println(ages);

    }
}
