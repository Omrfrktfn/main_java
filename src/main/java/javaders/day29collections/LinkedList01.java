package javaders.day29collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {

        /*
        Arraylistler eleman silme ve eklemede tekrar indexleme yapmak zorunda oludklarindan eleman ekleme ve silmede
        basarisizdirlar.

        ArrayListler eleman silme ve eklemede yavastirlar. Cunku tekrar indexlemeye ihtiyac duyarlar.
        LinkedListler ise elaman silmede basarilidirlar. LinkedListlerde her eleman bir sonrakini gosteriyor
        ve en sondakinin sonrasi olmasa da null gosterir. LinkedListeler index kullanmazlar.

        LinkedListlerde en bastaki elemandan daha once Head eleman vardir. Son eleman'a Tail denir en sonda
        oldugu icin. Elemanlarin yapisi farkli olup bunlara Node denir. Yapinin bir yuzune point, on yuzune
        ornegimize gore harf olan kismina Data denir. Node, Data ve Point'den olusuyor.
        Bir eleman sildigimizde eleman sildik demiyoruz, node sildigimizi soyluyoruz.

        LinkdListler index kullanmazlar. Bu yuzden eleman ekleme ve silme islemlerinde tekrar indexleme yapilmaz.
        Linkdlistler'de node ekleme ve silme islemleri yaparken sadece pointerlari degistirir.

        1-Linkendlist'ler node silme ve eklem'de cok basarili olduklari icin silme ve ekleme islemlerini coklukla
        yapacaginiz zaman linkedList kullaniniz.(data ve pointer bututnune "node" denir)
        2-ArrayList'ler indexleri adres gibi kullanir bu yuzden ArrayLIst'ler serach islemlerinde cok basarilidirlar
        note:ihtiyaciniz olan collection cogunlukla silme ve ekleme islemleri yapaaksa muze ziyaretcileri gibi
        yapacaksa linkedList, search islemleri yapacaksa (amerika eyaletleri gibi) ArrayList kullaniniz.
         */

        LinkedList<String> s = new LinkedList<>();
        s.add("Esra");
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");


        s.add(2,"Esen");
        s.addFirst("Kemal");
        s.addLast("Ajdar");


       // s.remove(2);//Ajda silindi
       // s.remove("Ajdar");
      //  s.remove();//her hangi bir paremetre olmadan kullanirsak ilk elemani siler.
      //  s.removeFirstOccurrence("Esra");
      //  s.removeLastOccurrence("Esra");

       String r1 = s.peek();//ilk elemani getirir ama silmez yani ilkini kopyalayip bana vericei
        System.out.println(r1);

        String r2 = s.poll();//ilk elemani verir ve listeden siler.
        System.out.println(r2);

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:
        the head of this list

     Note:peek ile element ikiside ilk elemani silmeden size verir. Ama peek list bos oldugunda size null verir,
     element ise hata verir.
         */
        String r3 = s.element();//ilk elemani silmeden verir.
        System.out.println(r3);
        System.out.println(s);
    }

}
