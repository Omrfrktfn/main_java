package javaders.day34exceptions;

public class E01 {

    /*
        1)"Exception" beklenmedik problem demektir.
        2)"Exception" i halledebilmek icin iki temel yol vardir;
            i)"Exception" a uygun cozumler uretebilirsiniz. Buna "Exception Handling" denir.
            ii)"Exception" olustugunda bunu ilan eder ve geri cekilirisniz. Buna da "Throw Exception" denir.
        3)"Exception"'na uygun cozumler uretmede try-catch kullanilir.
            try block'ta yapilmasi gereken islemi java'dan yapmasi istenir.
            java islemi problemsiz bir sekile yaparsa catch block java tarafinda okunmaz.
            try block'ta islem yapilirken exception olusursa catch block devreye girer ve catch block icindeki
            kodlar calisir.
        4)try block'ta islem yapilirken exception olusursa try block icindeki exception'dan sonraki kodlar calistirilmaz.

     */

    public static void main(String[] args) {

        System.out.println(divide1(12, 3));
        System.out.println(divide1(6, 0));

        System.out.println(divide2(12, 3));
        System.out.println(divide2(6, 0));


    }

    //1.Way: Exception'i handle etmede ilk yol
    public static int divide1(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }

    //2.Way: Exception'i handle etmede harika yol
    public static int divide2(int a, int b) {
       /*
        if(b==0){
            return 0;
        }else{
            return a/b;
        }

        */
        int result = 0;
        try {
            result =a / b;

            System.out.println("I am here...");

        } catch (ArithmeticException e) {//ArithmeticException matematik ile ilgili her hangi bir kural ihlali yapildiginda atilir.
            System.out.println("Do not divide any number by zero...");
        }
        return result;
    }

}
