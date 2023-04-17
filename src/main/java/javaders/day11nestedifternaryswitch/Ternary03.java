package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary03 {
    /*
    Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
    1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
    2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year...");
        int year = input.nextInt();
        //first way: nested ternary
        String result = year % 100 == 0 ? (year % 400 == 0 ? "Leap" : "not leap") : (year % 4 == 0 ? "leap" : "not leap");
        System.out.println(result);

        System.out.println("********************************");
        //second way: nested if
        if (year % 100 == 0){
            if (year % 400 == 0){
                System.out.println("leap");
            }else {
                System.out.println("not leap");
            }
        }else {
            if (year % 4 == 0){
                System.out.println("leap");
            }else {
                System.out.println("not leap");
            }
        }

    }
}
