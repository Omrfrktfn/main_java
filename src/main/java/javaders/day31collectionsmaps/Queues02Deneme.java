package javaders.day31collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02Deneme {
    public static void main(String[] args) {

        Queue<String > line=new PriorityQueue<>();

        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Orange");
        line.add("Tomatoes");
        System.out.println(line);

        /*Queue bir interface'dir, bu yuzden consdructor'i yoktur, dolayisiyla object olustururken new keywordunden sonra
        kullanilamaz. Data type Queue olan bir object olusturmak icin new keyword'den sonra
            a)LinkedList veya b) PriorityQueue classlari kullanilir.

            Queue olustururken constructor  olarak PriorityQueue kullanirsaniz elemanlari kendi belirleyeceginiz kurala gore
            siralama hakkiniz olur.
         */

        Deque<String > d = new LinkedList<>();
        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");
        System.out.println(d);

    }
}
