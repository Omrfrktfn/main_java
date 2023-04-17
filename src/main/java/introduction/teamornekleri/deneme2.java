package introduction.teamornekleri;

import java.sql.SQLOutput;
import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {

        //Kullanicidan bir string isteyin ve string i tersten yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir string deger giriniz...");
        String name = input.nextLine();
        String newName = "";

        for (int i = name.length() - 1; i > -1; i--) {
            newName = newName + name.charAt(i);

        }
        System.out.print(newName + " ");

        System.out.println(" ");


        //
        System.out.println("Lutfen ilk tam sayiyi giriniz..");
        int s = input.nextInt();
        System.out.println("Lutfen ikinci tam sayiyi giriniz..");
        int s1 = input.nextInt();

        int s3 = 0;
        for (int i = s; i < s1; i++) {
            s3 = s3 + i;
        }
        System.out.println(s3);

        System.out.println(" ");

        System.out.println("lutfen 10'dan kucuk bir tam sayi giriniz....");
        int s4 = input.nextInt();
        int s5 = 1;
        for (int i = 1; i <= s4; i++) {
            s5 = s5 * i;
        }
        System.out.println(s4 + "!=" +s5);

        System.out.println(" ");

        System.out.println("lutfen pozitif bir tam sayi girinz...");
        int s6 = input.nextInt();

        for (int i =1; i<=s6;i++){
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();//bir alt satira gecmesi icin
        }


    }
}
