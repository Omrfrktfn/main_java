package javaders.day02printmethodcreation;

import java.util.Scanner;


public class PrintlnPrint {
    public static void main(String[] args) {

        // "TECHPRO EDUCATION" yazisini yukaridan asagiya her
        // bir harf  bir alt satirda olacak sekilde yazdiriniz

        System.out.println("********************1.yol**********************");
        System.out.println("T"); //ctl +D ile alt alta kopyala ve degistir
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

        // "TECHPRO EDUCATION" yazisini yukaridan asagiya her
        // bir harf  bir alt satira gelecek sekilde tek bir sout ile yazdiriniz
        System.out.println("********************2.yol**********************");
        System.out.println("T\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");

        // JAVA ILE GUZEL DUNYA ifadesinin her bir kelimesini alt satira
        // yazdiran kodu tek bir sout ile yazdiriniz
        System.out.println("JAVA\nILE\nGUZEL\nDUNYA");

        // JAVA ILE GUZEL DUNYA ifadesinin her bir kelime arasinda 1 tab bosluk birakan
        //  kodu yaziniz
        System.out.println("JAVA\tILE\tGUZEL\tDUNYA"); // bir tab bosluk birakir

        // "Techpro " ile java cok ' kolay '
        // tek bir sout ile yazdiran kodu yaziniz
        System.out.println("\"Techpro\" ile java cok ' kolay ' "); //cift tirnak kullanim sekli bu sekilde


        //" MAHARET" hic 'DUSMEMEK' degil;


        //  "Her dustugunde kalkabilmektir" ekranda bu sekilde olacak sekilde yazdiriniz
        System.out.println("\"Maharet\" hic ' DUSMEMEK ' degil" +
                "\n\n\n\t\"Her dustugunde kalkabilmektir\"");

        // Print ile Println arasindaki farklar
        // ln ==> line next ; bir sonraki satira gec demek
        System.out.println("************** 1 ****************");
        System.out.print("Ali ");
        System.out.println("Can");

        System.out.println("************** 2 ****************");
        System.out.println("Ali ");
        System.out.println("Can");

        System.out.println("************** 3 ****************");
        System.out.print("Ali ");
        System.out.println("Can");

        // Ex)  Kullanicidan aldiginiz
        // sekille asagidaki gibi bir gorunum olusturun
        /*
                  A
                 A A
                A A A
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter veriniz");

        char ch = input.next().charAt(0);//Ali HAKKI
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);



    }
}
