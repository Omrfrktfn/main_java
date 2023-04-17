package javaders.day31collectionsmaps;

import java.util.HashMap;

public class HashMap01Deneme {

    public static void main(String[] args) {

        /*
        Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanimi vardir.
        key kismi tekrarsiz value kismi ise tekrarsiz olabilir.
        Map'lerdeki elemanlara entry denir.
        Elemanlarin tamamina EntrySet denir.
        Cunku Entry'ler tekrarsiz oldugu icin EntrySet denir.
        Key ve Value'lar ayri ayri data type'larinda olabilirler.
        Map'ler collection degildir.
         */

        HashMap<String,Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albenia", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkey", 83000000);
        countryPopulation.put("Netherland", 18000000);

        System.out.println(countryPopulation);
    }
}
