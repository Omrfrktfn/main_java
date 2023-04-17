package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C01_KullanicidanDataAlmaDeneme {
    public static void main(String[] args) {

        //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz
        /*
                  A
                 A A
                A A A
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir karekter giriniz ... ");
        char ch = input.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch+" ");

        // Aralarinda bir tab bosluk birakarak tek sout ile ayni sekli olusturalim
        System.out.println("*****************************");
        System.out.println("\t\t"+ch+"\t\t\n\t"+ch+"\t" +
                "\t"+ch+"\t\n"+ch+"\t\t"+ch+"\t\t"+ch);

        /*
        Sadece char data type icin nextChar() diye bir method olmadigi icin kullanicidan
        data alip ch konteyner'ina yerlestirmek icin next().charAt(0);
        methodu kullaniriz
         */



    }
}
