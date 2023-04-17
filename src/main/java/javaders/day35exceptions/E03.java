package javaders.day35exceptions;

public class E03 {

    /*
        1)try block'dan sonra coklu catch block kullanilabilir.
          catch block'lar arasinda parent-child iliskisi yoksa catch block'lar istenildigi gibi siralanabilir.
          catch block'lar arasinda parent-child iliskisi varsa child ustte olmalidir
        2)"Exception Class"tum Exception'larin parent'idir.
           Coklu catch block kullanmak yerine sizden istenen fonksiyonu karsiladigi surece
           tek catch block'i "Exception Class" ile kullanabilirsiniz
        3)"try + 1 catch" olur - "try + cok catch" olur - "try" tek basina kullanilamaz
          "try" catch block olmadan kullanilabilir mi?
          "try + finally" olabilir.

 */
    public static void main(String[] args) {

        System.out.println(convertStringToIntDivideByLength("6"));
        System.out.println(convertStringToIntDivideByLength1("6"));
        System.out.println(convertStringToIntDivideByLength2("6"));

    }
    //ex-1 Bir stringi Integer'a ceviren ve bu integer'i String'in length'in 1 eksigine bolen method olusturunuz.
    public static int convertStringToIntDivideByLength(String str){

        //Bir method'dan 2 farkli exception alma ihtimalimiz var

        int result =0;

        try {
            int a =  Integer.valueOf(str);

            result = a/(str.length()-1);

        }catch (NumberFormatException e){
            System.out.println("Non digit character cannot be used in valueOf()");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    /*
//valueOf() bos String'de de NumberFormatException hatasi verir
//Bir method'dan 2 farkli exception alma ihtimalimiz var. Ikisini birden handle etmemiz gerekir.

 */
    public static int convertStringToIntDivideByLength1(String str){

        //Bir method'dan 2 farkli exception alma ihtimalimiz var

        int result =0;

        try {
            int a =  Integer.valueOf(str);

            result = a/(str.length()-1);

        }catch (NumberFormatException e){
            System.out.println("Non digit character cannot be used in valueOf()");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    /*
//valueOf() bos String'de de NumberFormatException hatasi verir
//Bir method'dan 2 farkli exception alma ihtimalimiz var. Ikisini birden handle etmemiz gerekir.
//valueOf() method'una sayi olmayan bir deger atanirsa "NumberFormatException" hatasi alinir.
//"Exception" tum exception'lari kapsayan genel bir exception turudur. 911 gibi...


 */

    public static int convertStringToIntDivideByLength2(String str){

        //Bir method'dan 2 farkli exception alma ihtimalimiz var

        int result =0;

        try {
            int a =  Integer.valueOf(str);

            result = a/(str.length()-1);

        }catch (ArithmeticException e){
            System.out.println("Jump");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

}
