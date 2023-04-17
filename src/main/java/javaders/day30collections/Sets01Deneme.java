package javaders.day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Sets01Deneme {
        /*
        1-Set'ler tekrarsiz (unique) eleman depolamak icin kullanilir.
        2-3 tane Set Class'i vardir.
            i-HashSet Class : Hash benzersiz bir ID olusturma teknigidir. Bu teknige hashing technique denir.
                "HashSet" elemanlari rastgele random bir tarzda siralar.
                "HashSet" elemanlari siralamadindan cok hizli calisir.
                "HashSet" ler tekrarsiz eleman depolamak icin kullanilir.
                "HashSet"'ler "null"'i eleman olarak kabul eder.

            ii-LinkedHashSet Class :Elemanlari sizin verdiginiz siraya gore(insertion order) dizdiklerinden
                HashSet'lere gore yavastirlar.
                "LinkedHashSet" ler tekrarsiz eleman depolamak icin kullanilir.


           iii-TreeSet Class : TreeSet'ler elemanlari natural order (kucukten buyuge alfabetik sira)'ya gore
                dizerler.
                TreeSet'ler elemanlari natural order'a gore dizdiklerinden cok yavastirlar.
                En yavas set TreeSet'lerdir
                TreeSet'lerde tekrarsiz eleman depolamak icin kullanilir.
         */

    public static void main(String[] args) {
        HashSet<String > hs = new HashSet<>();
        hs.add("Merve");
        hs.add("Tuba");
        hs.add("Sema");
        hs.add("Fatih");
        hs.add("Rana");
        hs.add("Sema");//Tekrarli eleman eklediginzde hata vermez ama tekrarli olan elemani bir kere depolar.
        System.out.println(hs);

        System.out.println(hs.hashCode());//

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(313);
        lhs.add(19);
        lhs.add(353);
        lhs.add(7);
        System.out.println(lhs);

        lhs.add(null);
        lhs.add(null);//hata vermez ama bir tane ekler
        System.out.println(lhs);

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(313);
        ls.add(195);
        ls.add(353);
        ls.add(17);
        System.out.println(ls);//[313, 195, 353, 17]

        lhs.retainAll(ls);
        System.out.println(lhs);//[313, 353]
        System.out.println(ls);//[313, 195, 353, 17]



    }
}
