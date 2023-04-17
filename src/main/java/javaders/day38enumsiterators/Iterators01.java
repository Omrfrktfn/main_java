package javaders.day38enumsiterators;

import java.util.*;

public class Iterators01 {
    /*
    1-Iterator'lar loop'larin yaptigi ayni isi yapar.
    2-Iterator'larda sonsuz loop olusma ihtimali yoktur.
    3-Iterator'lar ile loop'lar arasinda performans farki yoktur.
    4-Iterator'lar bir collection'dan eleman silme ve bir collection'daki elemani degistirme konusunda daha
        basarilidir.
    5-iki tip iterator var; i-Iterator : bu sadece eleman silmede kullanilir, eleman eklemek veya elemani degistirmek
        mumkun degildir. ii-ListIterator : bu eleman silebilir, ekleyebilir  ve degistirebilir
        not : Iterator sadece soldan saga (ilk elemandan son eleman dogru calisir.) calisir.
        ListIterator ise iki yonlu calisabilir.
     */
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);

        //Iterator kullanalim
        //once list'i iterator'a cevirmek lazim kullanabilmek icin
        Iterator<String> myItr = myList.iterator();
        while (myItr.hasNext()) {// hasnext pointer'a senden sonra eleman var mi diye sorar.
            //eleman varsa true yoksa false dondurur.
            myItr.next();//next pointer'i sonraki elemanin onun tasir ve ustunden atladigi elemani return eder.
            myItr.remove();//next methodunun return ettigi elemani siler.
        }
        System.out.println("myList = " + myList);

        //ListIterator kullanalim
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");
        System.out.println(yourList);

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()) {
            String el = yourListItr.next();

            yourListItr.set(el + "!");//elemanin sonun unlem isareti koy
        }
        System.out.println("yourList = " + yourList);

        while (yourListItr.hasPrevious()) {//hasPrevious methodu senden once eleman varmi?
            String el = yourListItr.previous();
            System.out.println(el);
            yourListItr.set("?" + el);
        }
        System.out.println(yourList);
        /*
        hasPrevious() methodu true yada false dondurur.Mutlaka imlec listenin sonunda olmalidir.
         */

        //en sondan en basa nasil iterate edebiliriz.
        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);

        Iterator<String> ourListItr = ourList.descendingIterator();

        while (ourListItr.hasNext()) {

            String el = ourListItr.next();
            System.out.println(el);
        }

        System.out.println(" ");
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(1);
        list.add(17);
        list.add(3);
        System.out.println(list);//[5, 9, 2, 1, 17, 3]
        Iterator itr = list.iterator();

        System.out.println(itr.hasNext());//senden sonra eleman varmi bunu kontrol eder.
        System.out.println(itr.next());// 5'in ustunden zipliyip yan tarafa gecer ve o sayi yi bize veririr
        //5,itr9,2,1
        System.out.println(itr.next());

        itr.remove();//en son kimin uzerinen zipladi ise onu siler 9 bir ustter en son 9 oldugu icin
        System.out.println(list);
      //  itr.remove();//remove methodu uzerinden atladigi elemani siler. Ancak uzerinden atladigi eleman yoksa hata verir
      //  System.out.println(list);


    }
}
