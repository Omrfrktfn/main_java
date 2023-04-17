package javaders.day13incrementdecrementloops;

public class ForLoopDeneme02 {
    public static void main(String[] args) {
        //Ex : Verilen bir string'de ilk a harfinden onceki tum karakterleri koncola yadiriniz.
        //String I Love Java

        String a = "I Love Java";
        for (int i = 0; i < a.length(); i++) {
            // System.out.println(a.charAt(i));//Tum indexleri tek tek yazdirir
            char ch = a.charAt(i);
            if (ch == 'a') {
                break;
            }
            System.out.println(ch);
        }

        System.out.println("************************************");
        //ex-2verilen bir stringde son a dan sonraki tum chracterleri ters sirada yazdiriniz
        String s = "Germany";
        for (int i = s.length() - 1; i > -1; i--) {
            char ch1 = s.charAt(i);
            if (ch1=='a'){
                break;
            }
            System.out.println(ch1);
        }


    }
}
