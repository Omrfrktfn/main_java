package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {
    /*
    Kullanicidan bir sayi aliniz. O sayi pozitif ise ekrana pozitif yazdirin degilse
    ekrana pozitif degil yazdirin.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        int num = input.nextInt();

        String result = num > 0 ? "Pozitif" : "pozitif degil";
        System.out.println("result = " + result);
    }
}
