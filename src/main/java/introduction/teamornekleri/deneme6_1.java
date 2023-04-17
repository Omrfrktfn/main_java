package introduction.teamornekleri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class deneme6_1 {
    public static void main(String[] args) {

        //List<String > letter = List.of("A","C","E","F");
        List<String > letter = new ArrayList<>();
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

        System.out.println(letter.remove("F"));
        //System.out.println(letter);

        Collections.sort(letter);
        System.out.println("Siralama sonucu = " + letter);


        boolean r1 = letter.contains("L");
        System.out.println(r1);

        boolean r2 = letter.contains("M");
        System.out.println(r2);

        int toplam = letter.size();
        System.out.println("toplam = " + toplam);

        letter.clear();
        System.out.println(letter);

        boolean bosMu = letter.isEmpty();
        System.out.println("bosMu = " + bosMu);


    }

}



