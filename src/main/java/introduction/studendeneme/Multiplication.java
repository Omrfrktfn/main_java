package introduction.studendeneme;

public class Multiplication {
    public static void main(String[] args) {
        //iki degiskenin degerini degistirme

        int a = 10;
        int b = 20;
/*
        int c = 0;
        c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);

 */


        System.out.println("********************************************");
        //second way

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);


    }
}
