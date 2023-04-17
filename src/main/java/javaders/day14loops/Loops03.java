package javaders.day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {

        //while loop
        int i = 1;
        while (i < 1) {//while loop'da loop bodysi'nin hic calismamasi mumkundur(zero execution is possible)
            System.out.println("while loop");
            i++;
        }

        //do-while loop
        int k = 1;//do while da loop body si en az bir kere calisir
        do {
            System.out.println("do while loop");
            k++;
        } while (k < 1);

        //Kullanici bir sayi girsin sayi 100'den kucuk ise kullanici kazandiniz mesaji alsin
        //Diger durumlarda kaybettiniz mesaji alsin

        Scanner input = new Scanner(System.in);


        do {
            System.out.println("please enter an integer");
            int n = input.nextInt();

            if (n < 100) {
                System.out.println("won");
            } else {
                System.out.println("lost");
                break;
            }
        } while (true);

        System.out.println(" ");
        System.out.println("***********************");
        //Kullanicidan alinan bir cumlenin buyuk harfle baslayip nokta ile bittigini

        do{

            System.out.println("Please enter a word");
            String s = input.next();

            if(s.endsWith(".") && (s.charAt(0)>='A' && s.charAt(0)<='Z')){
                System.out.println("Your sentence is correct grammatically");
            }else{
                System.out.println("Your sentence has grammatical mistake");
                break;
            }

        }while(true);
    }
}
