package javaders.day38enumsiterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class iterator02 {

    public static void main(String[] args) {

        //verilen bir listeyi tersten yazdiran kodu olusturunuz.

        List<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        ListIterator itr = list.listIterator();
        while (itr.hasNext()){
            itr.next();

        }
        while (itr.hasPrevious()){
            System.out.print(itr.previous() + " ");
        }
    }
}
