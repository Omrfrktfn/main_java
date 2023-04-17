package javaders.day02printmethodcreation;

public class MethodCreationDeneme {

    public static void main(String[] args) {
        // static ==> protokol tribunu vip class

        //karenin alanini veren kodu yaziniz
        kareninAlani(7); //49
        /*
        return type void oldugunda dondurdugu her hangi bir deger olmadigi icin
        sadece ekranda bastirdigi icin; ekleme cikarma ya da method kullanma vs.
        hic bir islem yapamayiz.
        Method sonucunda ortaya cikan datayi kullanamayiz. Sadece ekranda goruruz.
        Tv ekraninda elmalari gorup elmali pasta yapamamiz gibi....
         */

        //Diktortgenin alanini veren kodu yaziniz
        System.out.println("Dikdortgenin Alani: " + (dikdotgenAlani(10,20)) ); // 200
        int solution = dikdotgenAlani(10,20);
        System.out.println("solution = " + solution);
        /*
        return type i int oldugu icin bir deger dondurur ve bu degeri biz kullanabiliriz.
        Method kullanabilirz
        Ekleme cikarma carpma bolme istedgimiz gibi elde edilen datayi kullanabilirz
         */

    }

    private static int dikdotgenAlani(int a, int b) {
        return a*b; // carpmanin sonucuyu kullanicya verdik
    }

    private static void kareninAlani (int a) {
        System.out.println("Karenin alani:" + (a*a)); // karenin alani 49
    }
}
