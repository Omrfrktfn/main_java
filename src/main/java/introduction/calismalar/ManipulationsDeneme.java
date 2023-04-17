package introduction.calismalar;

import java.util.Scanner;

public class ManipulationsDeneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz : ");
        int sayi = input.nextInt();
       // Math.abs(sayi);
        if( sayi % 2 == 0){
            System.out.println("girilen sayi cift");
        }else {
            System.out.println("girilen sayi tek");
        }

        System.out.println("*******************************************");

        System.out.println("lutfen tam bir sayi giriniz...");
        int num = input.nextInt();



    }
}

