package javaders.day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {

    /*
    1)Sets'ler tekrarsiz eleman(unique) depolamak icin kullanilir.
    2)3 tane set class vardir:
        i)HashSet Class:
                Hash benzersiz id olusturma teknigidir. Bu teknige Hashing Technique denir.
                HashSet elemanlari rastgele siralar
                HashSet elemanlari rastgele siraladigindan cok hizli calisir.
                HashSet'ler null'i eleman olarak kabul eder
                HashSet'ler tekrarsiz eleman depolamak icindir

        ii)LinkedHashSet Class:
                LinkedHashSet'ler elemanlari sizin verdiginiz siraya gore(insertion order) dizdiklerinden HashSet'lere
                gore yavastirlar.
                LinkedHashSet'ler tekrarsiz eleman depolamak icindir
        iii)TreeSet Class:
                TreeSet'ler elemanlari natural order'a gore dizerler.
                TreeSet'ler elemanlari natural order'a gore dizdiklerinde cooook yavastirlar.
                En yavas Set TreeSet'tir

      3) TreeSet cok yavas oldugundan mumkun oldugu kadar TreeSet kullanmaya calisiriz.
     */

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cuneyt");//Tekrarli eleman eklendiginde hata vermez ama tekrarli elemani sadece bir kere ekler.
        hs.add(null);

        System.out.println(hs);//rastgele siralar

        System.out.println(hs.hashCode());

        LinkedHashSet<Integer> lsh = new LinkedHashSet<>();
        lsh.add(234);
        lsh.add(87);
        lsh.add(-32);
        lsh.add(124);
        lsh.add(null);
        lsh.add(null);//tekrarli elemanlari linkedHashSet'te bir kere gosterir.
        System.out.println(lsh);//verilen siraya gore

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);
        System.out.println(ls);

        lsh.retainAll(ls);
        System.out.println(lsh);//ilk LinkedHashSet'teki farkli elemanlari siler
        System.out.println(ls);

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('R');
       // ts.add(null); // TreeSet'lere null eklenemez
        System.out.println(ts);//alfabetik siray koyar


        System.out.println(ts.first());
        System.out.println(ts.last());


        System.out.println(ts.lower('R'));//G ==> Verilen eleman olan R'den bir onceki harfi veririr.

        System.out.println(ts.higher('K'));//R ==> Verilen elemen olan K'dan bir sonraki elemani verir.

        System.out.println(ts.headSet('R'));//A G ==> Parentez icinde R dahil degildir.
        //Senin soyledigin harfe kadar en bastan aliyor.

        System.out.println(ts.headSet('R',true));//R yi dahil etmek icin

        System.out.println(ts.tailSet('G'));//G R U Z ==> Parentez icindeki G dahil ve sonrasi

        System.out.println(ts.tailSet('G',false));//G yi dahil etme demek

        System.out.println(ts.ceiling('R'));//R ==> Eleman set'in icinde vars elemanini kendisi return eder
        System.out.println(ts.ceiling('K'));//R ==> Eleman set'in icinde yoksa sonraki eleman return eder

        System.out.println(ts.floor('G'));//G ==> Eleman set'in icinde vars elemanini kendisi return eder
        System.out.println(ts.floor('J'));//G ==> Eleman set'in icinde yoksa onceki elemane return eder

        System.out.println(ts.subSet('G','U'));//Ilk parametre dahil ikinci paremetre haric
        System.out.println(ts.subSet('G',false,'Z',true));
        //G haric R dahil





    }
}
