package javaders.day33maps;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {

    /*
       1-TreeMap "thread-safe" ve "synchronized" degildir.
         NOTE: Map'lerde "multi thread" kullanmaniz gerektiginde sadece HashTable kullanabilirsiniz.
       2-TreeMap'ler value'larda null kullanimina musaade eder, key'lerde etmez.
       3-TreeMap entry'leri key'lerine gore natural order'a gore siraya koyar. Bu yuzden cooook yavastir.
     */
    public static void main(String[] args) {

        long t1 = System.nanoTime();

        TreeMap<String , Integer> countryPopulations = new TreeMap<>();

        countryPopulations.put("USA",400000000);
        countryPopulations.put("Netherlan",180000000);
        countryPopulations.put("Turkey",830000000);
        countryPopulations.put("Belgium",120000000);
        countryPopulations.put("Mexico",1250000000);
        countryPopulations.put("Brasil",215000000);
        countryPopulations.put("Fransa",750000000);
        countryPopulations.put("Finland",80000000);
        countryPopulations.put("Germany",85000000);
        countryPopulations.put("Madagsakar",300000000);

        System.out.println(countryPopulations);
        long t2 = System.nanoTime();

        HashMap<String , Integer> countryPop = new HashMap<>();

        countryPop.put("USA",400000000);
        countryPop.put("Netherlan",180000000);
        countryPop.put("Turkey",830000000);
        countryPop.put("Belgium",120000000);
        countryPop.put("Mexico",1250000000);
        countryPop.put("Brasil",215000000);
        countryPop.put("Fransa",750000000);
        countryPop.put("Finland",80000000);
        countryPop.put("Germany",85000000);
        countryPop.put("Madagsakar",300000000);

        TreeMap<String , Integer> countrypop2 = new TreeMap<>(countryPop);

        System.out.println(countrypop2);
        long t3 = System.nanoTime();

        System.out.println(t2-t1);
        System.out.println(t3-t2);

    }
}
