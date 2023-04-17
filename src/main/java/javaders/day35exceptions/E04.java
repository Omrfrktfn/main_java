package javaders.day35exceptions;

public class E04 {
    /*

        - throw keyword bir method badysi icinde istedigimiz yerde, istedigimiz kosullar icin, istedigimiz kadar,
        Exception atmamizi saglar.
        - throw keyword'u yazildiktan sonra bir exception class objecti olusturulur.
        - Exception class constructor'inin parentez icine istedigimiz Exception mesajini yazabiliriz.

        *throw ile throws keywordlari arasindaki fark nedir?
        1)"throw" method body'si icinde , "throws" ise method parentezinden hemen sonra kullanilir.
        2)"throw" method body'si icinde istenilen yerde istenildigi kadar kullanilabilir.
        3)"throws" ise method parentezinden hemen sonra ve sadece 1 kere kullanilabilir.
        4)"throw" dan sornra new keyword ve constructor kullanilarak obje olusturulur.
        5)"thorws" dan sonra sadece exception class ismi yazilir.
        6)"throw" belli sartlar icin exception atmada kullanilir.
        7)"throws" ise application'u exception attiktan sonra durdurur.
     */
    public static void main(String[] args) {

        printAge(-3);//yas eksili bir deger yada cok buyuk bir sayi degeri olamaz kullanicinin girecegi degere gore
        //duzenlemeliyz. IllegalArgumentException hatasi verir.
    }
    public static void printAge(int age){
       // System.out.println(age);

        if (age < 0){
            throw new IllegalArgumentException("Age cannot be negative");
        }else if (age>150){
            throw new IllegalArgumentException("yas 150'den buyuk olamaz.");
        }else {
            System.out.println(age);
        }
    }
}
