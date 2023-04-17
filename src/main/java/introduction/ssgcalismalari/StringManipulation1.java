package introduction.ssgcalismalari;

import java.util.Scanner;

public class StringManipulation1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen email adresi giriniz.");
        String email = input.nextLine();

        if(!email.contains("@gmail.com")){
            System.out.println("Lutfen email adresi giriniz.");
        }else if (email.contains(" ")) {
            System.out.println("Lutfen bosluksuz bir deger giriniz.");
        }else if (email.endsWith("@gmail.com")){
            System.out.println("Email adresniniz kaydedildi");
        }  else System.out.println("lutfen yazimi kontrol ediniz");
    }
}
