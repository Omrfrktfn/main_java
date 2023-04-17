package practices.day_01_practice;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz...");
        String name = input.nextLine();
        System.out.println("lutfen soyadinizi giriniz...");
        String lastName = input.nextLine();
        System.out.println("lutfen yasinizi giriniz...");
        byte age = input.nextByte();
        System.out.println("Lutfen boyunuzu giriniz....");
        double length = input.nextDouble();
        System.out.println("lutfen kilonuzu giriniz...");
        int weight = input.nextInt();

        System.out.println("Adi : " + name +"\n"+"soyad : " + lastName+"\n"+"yas :"
                +age + "\n"+"boy : " + length + "\n"+"kilo : " + weight );
    }
}
