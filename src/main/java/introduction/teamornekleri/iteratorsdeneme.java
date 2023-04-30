package introduction.teamornekleri;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class iteratorsdeneme {
    public static void main(String[] args) {
        LinkedList<Integer> liste = new LinkedList<Integer>();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(5);

        ilkElemanArtir(liste);
        System.out.println("*********************");
        sondanBasaYazdir(liste);
    }


    private static void ilkElemanArtir(LinkedList<Integer> liste) {
        Iterator<Integer> iterator = liste.iterator();

        int i = 0;
        while (iterator.hasNext() && i < 3) {
            int eleman = iterator.next();
            eleman += 3;
            System.out.print(eleman + " ");
            i++;
        }


    }

    public static void sondanBasaYazdir(LinkedList<Integer> liste) {
        Iterator<Integer> iterator = liste.descendingIterator();
        while (iterator.hasNext()) {
            int eleman = iterator.next();
            System.out.print(eleman + " ");
        }
    }


}
