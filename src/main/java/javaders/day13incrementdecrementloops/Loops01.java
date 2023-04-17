package javaders.day13incrementdecrementloops;

public class Loops01 {
    public static void main(String[] args) {
        //21'den 180'e kadar hem 4 hem de 6 ile bolunebilen tam sayilari yazdiriniz.

        for (int i = 21; i < 181; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + "-");
            }
        }
        System.out.println(" ");
        //Size verilen kucuk harfle yazilmis stringin index'i cift olan karekterleri buyuk harfe donusturunuz.
        //miami ==>MiAmI

        String a = "miami";
        for (int i = 0; i < a.length(); i++) {
            String ch = a.substring(i, i + 1);
            if (i % 2 == 0) {
                System.out.print(ch.toUpperCase());
                //  a = a.replace(ch, ch.toUpperCase());
            } else {
                System.out.print(ch);
            }
        }
        System.out.println(" ");
        //Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        String t = "Hello Java";
        for (int i = 0; i < t.length(); i++) {
            char ch1 = t.charAt(i);
            if (ch1=='a'){
                break;//loop'u herhangi bir sarta gore kirmak icin break keyword kullanilir.
            }else {
                System.out.print(ch1);
            }
        }

        System.out.println(" ");
        //verilen bir string de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        String t1 = "Tokatci";
        for (int i =t1.length()-1; i > -1; i--) {
            char ch2 = t1.charAt(i);
            if (ch2=='a'){
                break;//loop'u herhangi bir sarta gore kirmak icin break keyword kullanilir.
            }else {
                System.out.print(ch2);
            }
        }

    }
}
