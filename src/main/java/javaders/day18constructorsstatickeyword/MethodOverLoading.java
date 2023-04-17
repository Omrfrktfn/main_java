package javaders.day18constructorsstatickeyword;

public class MethodOverLoading {
    public static void main(String[] args) {

        /*
        1-Bir method ayni isim ve farkli parametrelerle olusturulursa buna method overloading denir.
        2-Method overloading java da iyi organizasyon icin onemlidir.
        3-Method overloading yaparken parametre uc sekilde degistirilebilir.
            i-parametrelerin sayilari degistirilebilir.
            ii-parametrelerin data type'lari degistirilebilir
            iii-parametrelerin data typle'lari farkli ise yerleri degistirilebilir.
        4-Method everloading bir class'in icinde olusur."private" method'lard d overload edilebilir.
        5-Method overloading butun acces modifier'larda kullanilabilir.
        **static methoda'lar overload edilebilirler.

         */

        System.out.println(add(3,5));

    }

    public static int add(int a , int b){
        return a+b;
    }

    public static int add(int a , int b,int c){
        return a+b+c;
    }

    public static double add(double a , int b){
        return a+b;
    }

    public static double add(int a , double b){
        return a+b;
    }
}
