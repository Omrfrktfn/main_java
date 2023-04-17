package introduction.teamornekleri;

import java.util.Scanner;

public class deneme4 {
    public static void main(String[] args) {

        int i = 9;
        do {

            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i < 191);
        System.out.println(" ");
        System.out.println("*********************************");

        String s="";
        int i1 =9;
        do {
            if( i1%7==0){
                s=s+i1+" ";
            }
            i1++;

        }while(i1<191 );
        System.out.println(s);

        System.out.println("");
        System.out.println("*************************************");
        char m = 'm';
        char c = 'c';
        char letter = m;

        do {
            System.out.println(letter);
            letter++;
        } while (letter <= c);


        System.out.println(" ");
        System.out.println("***************");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
       int number;

        do {
            System.out.print("Lütfen pozitif bir sayı girin (Çıkmak için 0'a basın): ");
            number = scanner.nextInt();

            if(number > 0) {
                sum += number;
                count++;
            }
        } while (number != 0);

        System.out.println("Girdiğiniz " + count + " adet pozitif sayının toplamı: " + sum);

    }
}

