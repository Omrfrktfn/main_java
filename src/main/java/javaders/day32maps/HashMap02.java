package javaders.day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

        //Example 1: Type code to print the number of occurrences of words in a sentence
        //"I like to move it, move it do you like it?"  => I=1, like=2, to=1, move=2, it=3, do=1, you=1

        String s = "I Like you you, Like Like!";
        System.out.println(s);
        // I like you, Like Like| = Like ile Like| ayni yapabilmek icin tum noktalama isaretlerini silmeliyiz

        s = s.replaceAll("\\p{Punct}", "");
        System.out.println(s);

        //Ben kelimelerle calismaliyim bu yuzden spli kullanacagim
        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> occ = new HashMap<>();
        //"words" arrayindeki kelimeler birer birer map'de var mi yok mu diye kontrol edilecek.
        //words arrayindeki kelimeler map'te yoksa map'e value'su 1 olarak yerlestirilecek.
        //words arrayindeki kelimeler map'te varsa map'e var olan value 1 artirilarak yerlestirilecek.

        for (String w : words) {

            Integer numOfOccurence = occ.get(w);//map'e git orada bu kelime var mi yok mu

            if (numOfOccurence == null) {
                occ.put(w, 1);
            }else {
                occ.replace(w,numOfOccurence+1);
            }

        }
        System.out.println(occ);


    }
}
