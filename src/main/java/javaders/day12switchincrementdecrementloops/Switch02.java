package javaders.day12switchincrementdecrementloops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        /*
        Kullanicidan aldiginiz karekterin sesli harf olup olmadigini kontrol eden kodu yaziniz.
        sesli harfler : a e i o u
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter...");
        char letter = input.next().charAt(0); // kullanicidan ilk karekter alma islemi
        //charAt dan sonra lower case yapamayiz
        switch (letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(letter + " is a vowel...");
                break;
            default:
                System.out.println(letter + " not vowel");
        }

        System.out.println("********************************");
        System.out.println("Please enter a letter...");
        //second way
        String letter2 = input.next().substring(0,1).toLowerCase();
        switch (letter2){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("it is a vowel...");
                break;
            default:
                System.out.println("not vowel");
        }
        System.out.println("********************************");
        System.out.println("Please enter a letter...");
        //second way
        String letter3 = input.next().substring(0,1);
        switch (letter3){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println(letter3 + " is a vowel...");
                break;
            default:
                System.out.println(letter3 + " not vowel");
        }

    }
}
