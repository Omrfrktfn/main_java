package javaders.day33maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
        "HashMap" ile "HashTable" arasindaki fark nedir?
        1-"HashMap" "thread-safe" degildir. "HashTable" "Thread-safe"'dir.
          "HashMap" "synchronized" degildir. "HashTable" "synchronized"'dir.
        2-"HashMap" bir tane "null" key'e ve istediginiz kadar null value'a musaade eder.
          "HashTable" key'lerde de valuelarda'da null kullanilmasina musaade etmez.
        3-"HashMap" hizlidir "HashTable" "HashMap"'e gore yavastir.
        NOTE: HashMap ve HashTable ikiside entry'leri rastgele siralar.

     */
    public static void main(String[] args) {

        Hashtable<String, Integer> stdAges = new Hashtable<>();

        stdAges.put("Tom", 43);
        stdAges.put("Jim", 52);
        stdAges.put("Jack", 21);
        stdAges.put("Henry", 43);
        stdAges.put("Walker", 85);
        // stdAges.put(null,85); // null HashTable'larin key'lerine null konulamaz.
        //  stdAges.put("Chris" , null);//hashTable'lerin valualrina'da null konulamaz
        //ama HashMap'lerde boyle bir hata almayiz.

        System.out.println(stdAges);

    }
}
