package javaders.day36exceptions;

public class E03 {

    /*
    throws ile throw arasindaki farklar nelerdir.
    i)throws method signature satirinda kullanilir. throw ise method body icinde kullanilir.
    ii)throws method signature satirinda bir veya birden fazla exception ile kullanilir.
    throw ise method body icinde bir tane excaption ile tekrar tekrar kullanilabilir.
    iii)throws'dan sonra sadece excaption class isimleri yazilir. throw'dan sonra ise
    Exception class'dan object olusturulur.
     */

    public static void main(String[] args) {

        printAge(23);
        try {
            printAge(-12);
        }catch (IllegalArgumentException e){
            System.out.println("Negative ages are not valid");
        }

    }
    //example 1: Kullanicidan alinan yasi consol'a yazdiran method'u olusturunuz.
    public static void printAge(int age){

        if (age<0){
            throw new IllegalArgumentException();
        }
        System.out.println(age);
    }
}
