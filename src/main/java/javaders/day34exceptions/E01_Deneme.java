package javaders.day34exceptions;

public class E01_Deneme {

    /*
    1)"Exception" beklenmedik problem demektir. java cozemedigi bir sorunla karsilastiginda "Exception" class'i devreye girer
    2)Exception class'i bize karsilasilan sorunun cinsini , bu sorunun nereden kaynaklandigini ve sebebini verir
    3)Java "exception" firlattiginda kodun calismasini durdurur. Java "exception" olusturan kod icin bizden bir karar vermemizi ister

    Eger hicbirsey yapmazsak beklendigi gibi kodumuzun calismasini durdurur.
    Kodumuzun calismaya devam etmesini istiyorsak try-catch ile exception olusturmasi muhtemel kodlarimizi catch blogu icinde yazmaliyiz.

    Exception'i halledebilmek icin iki temel yol vardir
        i-Exception a uygun cozumler uretebilirsiniz. Buna exception handling denir.
        ii-Exception olustugunda bunu ilan eder ve geri cekilirsiniz. Bunada "Throw Exception" denir.

    Exception'a uygun cozumler uretmede "try-catch" kullanilir. try-block icinde yapilmasi gereken islemi java'dan isteriz.
    Eger java bu islemi sorunsuz bir sekilde yaparsa catch block devreye girmez.
    try block icerisinde eger bir exception olusursa catch block o zaman devreye girer, ve catch block icindeki kodlar calisir.

    try block icinde islem yapilirken Exception olusursa try block icindeki exception'dan sonraki kodlar calistirilmaz.
    catch satirinda'ki parantez icine karsilasilmasi muhtemel olan exception class ismini ve bir obje ismi (e) yazariz.

    if-else kullanilirsa olusabilecek her problemi specific olarak if parentezi icine yazmamiz gerekir. Bu da ciddi bir matematik
    bilgisi gerektirir ve yazacagimiz kodu cok uzatir.
    Ama try catch'te java ilgili Exception ile alakali olusabilecek tum problemleri yakalar.
    */
    public static void main(String[] args) {
        divide(12,6);
        divide(12,0);

       // divide2(12,6);
        divide2(3,0);
    }

    /*
     NOT: ArithmeticException: Olusan exception cinsi
     NOT: by zero: Hatayi anlatan teknik mesaj
     */
    public static void divide(int a, int b){
        //tavsiye edilen bir yontem degildir.
        if (b==0){
            System.out.println("sayi sifira bolunemez...");
        }else {
            System.out.println(a/b);
            System.out.println("divide methodu ici...");
        }
       // System.out.println(a/b);
       // System.out.println("divide methodu ici...");
    }

    //
    public static void divide2(int a, int b){
        try {
            //(ArithmeticException yazdiginiz kod'da matematiksel islem kullaniyor iseniz alinabilecek bir exception'dur.
            System.out.println(a/b);
            System.out.println("try catch block ici");//ArithmeticException hatasini yakaladi ve bu kismi yazdirmadi devam etti.
        }catch (ArithmeticException e) {//hata alanin yer condoldan kopyalanip buraya yapistirilir.
            System.out.println("sayi sifira bolunemez...");
        }
        System.out.println("try catch ile handle edildi...");
        //System.out.println(a/b);
    }
}
