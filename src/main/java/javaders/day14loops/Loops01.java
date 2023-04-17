package javaders.day14loops;

import java.util.Scanner;

public class Loops01 {
    public static void main(String[] args) {
        //kullanicidan alinan bir tam sayinin tekrarsiz rakamlarinin toplamini bulunuz.
        //1838 ==? 1+3 =4
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        String s = input.next();//Integeri string almamizin sebebi indexof Strnglerde kullanilir.

        int sun = 0; // yeni datayi memorye yerlestirmemiz icin bu sekilde yapiyoruz.
        for (int i = 0; i < s.length(); i++) {
            String d = s.substring(i, i + 1);//ilk rakami verir d=1 verir
            if (s.indexOf(d) == s.lastIndexOf(d)){//ilk gorunum son gorunume esitse tekrarsiz demek
                sun = sun+Integer.valueOf(d);
            }
        }
        System.out.println(sun);

        System.out.println("******************************************");
        //Bir stringdeki tekrarli characterleri ekrana yazdiriniz
        //Alabala  ==>la
        String t = "Alala";
        String result = "";
        for (int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if((t.indexOf(ch) != t.lastIndexOf(ch)) && !result.contains("" + ch)){
                result = result +ch;
            }
        }
        System.out.println(result);
    }
}
