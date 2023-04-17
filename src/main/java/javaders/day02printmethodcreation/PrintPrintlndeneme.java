package javaders.day02printmethodcreation;

import java.util.Scanner;

public class PrintPrintlndeneme {

    public static void main(String[] args) {

        /*
        \n ==> alt satira gecirir
        \t ==> bir tab bosluk birakir
        \" ==> ekrana " yazdirir
        ctrl + alt + l ==> sayfayi duzenler

         */

        // "TECHPRO EDUCATION" yazisini yukaridan asagiya harf harf yazdiriniz
        // 1.yol
        System.out.println("*************************1.yol************************");
        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println(" ");
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");

        //"TECHPRO EDUCATION" yazisini tek bir sout ile yukaridan asagiya harf harf yazdiriniz
        System.out.println("*************************2.yol************************");
        System.out.println("T\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");

        // JAVA ILE GUZEL DUNYA ifadesinin her bir kelimesini alt satira
        //yazdiran kodu tek bir sout ile yazdiirniz
        System.out.println("JAVA\nILE\nGUZEL\nDUNYA");

        // JAVA ILE GUZEL DUNYA ifadesini bir tab bosluk birakan kodu yaziniz
        System.out.println("JAVA\tILE\tGUZEL\tDUNYA");

        // "Techpro" ile java cok ' kolay ' tek bir sout ile yazdiran kodu yaziniz
        System.out.println("\"Techpro\" ile java cok ' kolay '");

        //"Maharet" hic 'DUSMEMEK' degil;


        // "Her dustugunde kalkabilmektir"

        //Seklinde noktali virgulden sonra 3 satir alltan paragraf basi yaparak yazdiran kodu yaziniz
        System.out.println("\"Maharet\" hic 'DUSMEMEK' degil" +
                " \n\n\n\t\"Her dustugunde kalkabilmektir\"");//Enter ile asagiya indigimzide + yi kendi birakiyro

        // Print ile Println arasindaki fark

        System.out.println("Hayat Techpro ile cok guzel");
        System.out.println("Ama nasil baktiginiza bagli");
        System.out.print("Yeterki siz isteyin");
        System.out.println(" OMER BEY ");

        // Ex)  Kullanicidan aldiginiz
        // sekille asagidaki gibi bir gorunum olusturun
        /*
                  A
                 A A
                A A A
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir deger giriniz ...");
        char ch = input.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+ " "+ch+" "+ch+" ");

    }
}
