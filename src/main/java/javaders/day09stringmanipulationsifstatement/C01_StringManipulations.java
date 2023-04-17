package javaders.day09stringmanipulationsifstatement;

public class C01_StringManipulations {
    public static void main(String[] args) {

        //ex-1 Bir stringin hic karakter icerip ecermedigni kontrol eden kodu yaziniz

        String str = ""; // hiclik denir

        boolean result = str.length() == 0; //hic karakter yoksa true dondurecek
        System.out.println("string bos mu ? = " + result);

        String str1 = " "; // hiclik denir
        boolean result1 = str1.length() == 0;
        System.out.println("string bos mu ? = " + result1);

        //second way
        boolean result2 = str.isEmpty();
        System.out.println("string bos mu ? = " + result2);

        /*
        isEmpyt methodu string datanin icerisinde hic birsey yoksa true dondurur.Java'da space de bir karakter
        oldugu icin space varsa false dondurur.
         */

        System.out.println("******************************");

        //ex-3 bir string datanin space haric hic bir karakter icerip icermedigini gosteren kodu yaziniz.
        String t = "  ";

        //first way
        boolean tResult = t.replace(" ", "").length() == 0;
        System.out.println("tResult = " + tResult);

        //second way
        boolean tResult1 = t.replace(" ", "").isEmpty();
        System.out.println("tResult1 = " + tResult1);

        //third way ****recommended
        /*
        isBlan methodu space + hiclik ise ture dondurur. String bir data'nin bos mu dolu mu olduguna bakar
        isEmpty den farki space varsa yine true dondurur.
         */

        boolean tResult2 = t.isBlank();
        System.out.println("tResult2 = " + tResult2);

        System.out.println("*****************************************");

        //ex-4 Bir string de a,i,e karakterlerinin ilk gorunumunun indexleri toplamini ekrana yazdiriniz
        /*
        indexOf verilen karakter veya karakterlerin ilk gorunumun indexleri toplamin veririr.
         */

        String s = "Java is easy to learn";

        int aIdx = s.indexOf('a'); // ilk gordugu a harfinin indexi ni alir.
        System.out.println("a'nin index degeri = " + aIdx);

        int aIdx1 = s.indexOf('e');
        System.out.println("e'nin index degeri = " + aIdx1);

        int aIdx12 = s.indexOf('i');
        System.out.println("i'nin index degeri = " + aIdx12);

        System.out.println("indexlerin toplam degeri : " + (aIdx + aIdx1 + aIdx12));

        String s1 = "java is easy to learn to easy to";
        int aI = s1.indexOf("to"); //ilk gordugu to index'ini alir.
        //ilk gordugu kelimenin ilk karakterini bize verir.
        System.out.println("aIdx1 = " + aI);

        int aI1 = s1.indexOf('p');// olmayan bir karakterin degeri -1 dir
        System.out.println("aI1 = " + aI1);

        //java kelimesinin basladigi ilk olarak kacinci index te oldugunu gosteren kodu yaziniz

        int javaIndex = s1.indexOf("java");
        System.out.println("javaIndex = " + javaIndex);

        System.out.println("******************************************");
        /*
        lastIndexOf methodu bu method karakter veya karaktelerin son gorunumunun
        index degerini veririr
        olmayan bir karakter sorgulanirsa -1 dondurur mantik ayni
        */
        //ex-4 Bir string de a,i,e karakterlerinin son  gorunumunun indexleri toplamini ekrana yazdiriniz
        String last = "Java is easy to learn";

        int a = last.lastIndexOf('a');
        System.out.println("a = " + a);

        int b = last.lastIndexOf('e');
        System.out.println("b = " + b);

        int c = last.lastIndexOf('i');
        System.out.println("c = " + c);

        System.out.println("Toplam : " + (a+b+c));

    }
}
