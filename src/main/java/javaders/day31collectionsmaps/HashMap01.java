package javaders.day31collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

    public static void main(String[] args) {

        /*
        Hash java'da ki benzersiz id olusturma teknigidir.
        MY NOTES:
        Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
        "key" kismi tekrarsiz, "value kismi tekrarli olabilir.
        Mapler "key" ve "value" structure'ini kullanir.
        Map'lerdeki elemanlara "entry" denir.
        Elemanlarin tamanina ise "entrySet" denilir.
        Enty'ler tekrasiz oldugu icin "EntrySet"denilir
        Key ve Value'lar ayri ayri data type'larinda olabilirler.
        Map'ler Collection degildir farkli bir yapidir.

        HashMap'ler entry'leri rastgele siralar bu yuzden en hizli map'dir.
         */

        //Key ve Value'lar icin ayri ayri data type 'i olusturulmalidir.
        //Map'lar nasil olusturulur
        HashMap<String, Integer> countryPopulation = new HashMap<>();

        //Map'e entry nasil eklenir
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albenia", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkey", 83000000);
        countryPopulation.put("Netherland", 18000000);

        System.out.println(countryPopulation);

        // get() methodu "key" ile calisir ve "value" kismini verir
        int usaPopulation = countryPopulation.get("USA");//USA'in nufusunu verir.
        System.out.println("usaPopulation = " + usaPopulation);

        //keySet() methodu tekrarsiz olan "key"leri bir set'in icine koyarak verir
        //Butun key'leri nasil alabiliriz.
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);

        //Butun value'lari nasil alabilirim
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);

        //ex-1 countryPopulation map'indeki ulkelerin nufus ortalamasi nedir ?
        Collection<Integer> value = countryPopulation.values();
        int sum = 0;
        for (Integer w : value) {
            sum = sum + w;
        }
        System.out.println("ortalama nufus : " + sum / values.size());

        //entrySet() "entry"leri kalip halinde alip bize "Set"in icine koyarak verir
        Set<Map.Entry<String, Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries);

        /*
        Key ve valueler icin ayri ayri data tipi olur.
            HashMap'e baktigimizda birinci yazilan key'in
            ikinci yazilan value'nin data tipini gosterir.

            HashMapler HashSetler'de oldugu gibi entry'leri rastgele siralar.
            Bu yuzden maplerde en hizli HashMap'tir.
            Mapler Collection degildir, tamamiyle farkli bir yapidir.
            Mapler'de {} kullanilir. Ekrana yazdirdigimizda entryleri {} icinde gorduk.
            Setler ise [] kullanir.
            Map'lere eklemeyi add methodu ile degil put methodu ile yaptik.

            Get() methodu key ile calisir ve value kismini verir. Integer calisir, integer verir.
            Ornek getCat() bize Cat'in anlamini verir

            keySet() methodu keyler ile alakalidir. Bize bir set verir. Keyler tekrarsizdir,
            keyler verilirken Set'in icine konulur. KeySet methodu butun keyleri verir.
            Methodun icine girdigimizde methodun return type'i bizim olusturacagimiz
            conteynerin data type ile ayni olmasi gerektigi yazili.

            Tum valueleri Integer ile aliyoruz. Keyleri alirken String kullandik.

            Ortalama nufusu alirken for each loop kullandik ve value.size'i kullandik.
            Value.size'a toplami bolduk.

            Mapler'de bazen sadece valueler bazen de sadece keyler ile calisabiliriz.

            entrySet() methodu entryler'i kalip halinde Set icine koyar. Get() methodu valueler'i Set icine koyar.
            Looplar Mapler'de calismaz. Map'in ismini for each loop parantezi icine koydugumuzda uyari verdi.
            Bazen Mapler'deki elemanlar arasina girmek, loop ile bakmak isteriz. Tekrarli islerde loop yapmamzi gerekir.
            Map'te loop kullanabilmemiz icin entrySet() methodu kullanilir. Aksi halde looplari kullanamayiz.

            entrySet() bize Set verir. Her Set'in < > arasina data tipi yazilir. Set;in elemanlarinin data tipi Map'deki
            entrylerdir. Entry'lerin keyleri String, valueleri Integerdir.
         */

        //ex-2 countrypopulation map'indeki ulkeleirn isimlerin character sayisi ile nufuslarinin toplamini bulunuz

        int toplam = 0;
        for (Map.Entry<String, Integer> w : entries) {
            toplam = toplam + w.getKey().length() + w.getValue();
        }
        System.out.println(toplam);

    }
}
