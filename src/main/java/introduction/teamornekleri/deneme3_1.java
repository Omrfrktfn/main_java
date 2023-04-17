package introduction.teamornekleri;

import java.util.Scanner;

public class deneme3_1 {
    public static void main(String[] args) {
        int i = 3;
        while (i < 14) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println(" ");

        int a = 100;
        while (a < 1000) {
            if (a % 15 == 0 && a % 20 == 0 && a % 90 == 0) {
                System.out.print(a + " ");
            }
            a++;
        }
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen baslangic degerini giriniz...");
        int baslangic = input.nextInt();
        System.out.println("lutfen bitis degerini giriniz...");
        int bitis = input.nextInt();

       // int b = baslangic;
        while (baslangic <= bitis){

            if (baslangic % 2 == 0) {
                System.out.print(baslangic + " ");
            }

        baslangic++;

        }

        System.out.println(" ");

        System.out.println("lutfen ilk harfi giriniz...");
        char ch = input.next().toUpperCase().charAt(0);
        System.out.println("lutfen ikinci harfi giriniz...");
        char ch1 = input.next().toUpperCase().charAt(0);

      //  int d = ch;
        while (ch <= ch1){
            System.out.print(ch+ " ");
            ch++;
        }

        System.out.println( " " );
        System.out.println( " lutfen bir rakam giriniz...");
        int e = input.nextInt();

        int f = 1;
        while (f <11){
            System.out.println(e + "*" + f + "=" + (e*f));
            f++;
        }

        System.out.println( " ");

        System.out.println("lutfen bir sayi giriniz...");
        int g = input.nextInt();
        int h = 1;
        int counter =0 ;
        while (h <=g){
            if (g % h ==0){
                System.out.print(h +" ");
                counter++;
            }
            h++;
        }
        System.out.println(" ");
        System.out.println("toplam adet :  " + counter);

        System.out.println(" ");

        System.out.println("lutfen bir sayi degeri giriniz...");
        int k = input.nextInt();
       // int l = 0;
        int sum = 0;
        while (k>0){
            sum = sum + (k%10);
            k/=10;
        }
        System.out.println(sum);











    }
}
