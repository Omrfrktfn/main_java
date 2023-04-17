package introduction.day01variables;

public class Variables01 {
    public static void main(String[] args) {
        System.out.println("Omer faruk");
        //java bu satiri okumaz, kendimize veya takim arkadaslarimiza bir aciklamadir.
        /*
        java bu satirlari da okumaz. Birden fazla aciklama yapilabilir.
         */

        //Variable olusturma.
        //Ilk olarak data type belirlenir + variable name (isim verme) + assignment (atama operatoru) + data + noktali virgul
        //    int                             age                     =                           13          ;
        //assigment operation; sag taraftaki degeri alip sol tarafin icine koyar
        //java cumlesi ==> Statement
        //Data type + variable name ==> Variable Declaration demektir
        //Assigment operation + variable degeri ==> Assigment demektir

        /*
        eger variable declaration yapar assigment yapilmazsa java kendi degerlerini (default ==>varsayilan)
        koyar.
        Default deger sayilar icin sifirdir.
        Dil bilgisindeki nokta ne ise javada ki noktali virgul ayni seydir ve Statement in bittigini gosterir.
        Java da esittir demek "==" bu sekilde oluyor.
         */

        /*
        Javada temel de iki tip data vardir.
        1)primitive data type;
         Char, boolean, byte, short, int, long, float, double,

        2)non-primitive datay type;
            String
         */

        //Ornek-1 ogrenci ismi icin variable olusturup Ali can atayiniz

        String studentName="Ali can";
        //Stringlere verilen degerler daima cift tirnak icinde olamlidir.
        /*
        String bir variable olusturup ona herhangi bir atama yapmazsak java o variable a default deger
        olarak null koyar.
        Null demek sifir demek degildir. Cunku sifir da bir degerdir.
        Null demek ici bos obje demektir. Yani icinde variable veya methot bulunmayan default objedir
         */
        System.out.println(studentName);

        //Char data type: Tek karekterler icin kullanilir. Ornegin ==> A, x,
        //Ornek-1 Char data type inda bir ismin ilk harfi olarak variable olusturunuz
        //char data type inda tek tirnak icine konulmalidir. Tek karekterler tek tirnak icine konur seklinde

        char inital='F';
        System.out.println(inital);

        //boolean data type: Iki farkli data type alir. True yada False
        //ornek-3 boolean data type emeklimisin diye olusturup false degerini atayin

        boolean retired = false;
        boolean worker =  true;
        System.out.println(retired);
        System.out.println(worker);

        //byte data type: -128 den +127 e kadar tum sayilari iceririr. Memory de 8 bitlik yer kaplar
        //Ornek-4 byte data type inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz

        byte studentAge=25;
        System.out.println(studentAge);

        //short data type: memory de 16 bitlik yer kaplar. -32768 den 32767 e kdar olan tam sayilari iceriri.
        //Ornek-5 Site nufusu icin bir variable olusturun

        short sitePopulation =2500;
        System.out.println(sitePopulation);

        //int data type: Memory de 32 bitlik yer kaplar.

        int countryPopulation=2120400200;
        System.out.println(countryPopulation);

        //long data type:memory de 64 bit yer kaplar. Bilimsel calismalarda kullanilir
        //Bir sayinin long oldugunu anlamak icin sonuna L yazilir. Yoksa int data type algilayabilir

        long cellNumberInHumanBody=87878787848481818L;
        System.out.println(cellNumberInHumanBody);

        //float data type: Ondalikli sayilar icin kullanilan data typedir.32 bit kullanir.
        //Bir sayinin float oldugunu anlamak icin sonuna F yada f eklenir. Yoksa double kabul eder.
        //Noktadan sonra en fazla 7 rakama kadar gider

        float priceofshirt=2.23F;
        float priceofshoes=2.25F;
        System.out.println(priceofshirt + priceofshoes);

        //Double data type: memory de 64 bit kullanir. Noktadan sonra en fazla 16 rakama gider.
        //virgullu sayilar icin kullanilir

        double weightCell=0.000000000012;
        double weightAmip=0.000000000023;
        System.out.println(weightCell - weightAmip);







    }
}
