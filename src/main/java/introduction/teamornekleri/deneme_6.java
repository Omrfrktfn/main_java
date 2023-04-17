package introduction.teamornekleri;

import java.util.*;

public class deneme_6 {
    public static void main(String[] args) {

        List<String > letter = new ArrayList<>();
       // List<String > letter1 = List.of("A","C","A","A","A");

        letter.add("A");
        letter.add("C");
        letter.add("E");
        letter.add("F");

        System.out.println(letter);

        letter.add("B");
        System.out.println(letter);

        letter.add(1,"L");
        System.out.println(letter);

        letter.set(3,"D");
        System.out.println(letter);

        letter.remove("F");
        System.out.println(letter);

        Collections.sort(letter);
        System.out.println(letter);

        //System.out.println(letter.contains("L"));
        boolean r1 = letter.contains("L");
        System.out.println(r1);

        boolean r2 = letter.contains("M");
        System.out.println(r2);

        int numOfElement = letter.size();
        System.out.println("eleman sayisi : " + numOfElement);

        letter.clear();
        System.out.println("Temizleme islemi : "+ letter);

    }
}
