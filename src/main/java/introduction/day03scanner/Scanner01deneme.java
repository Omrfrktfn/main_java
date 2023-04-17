package introduction.day03scanner;

import java.util.Scanner;

public class Scanner01deneme {

    public static void main(String[] args) {
        //kullanıcı yası gırme
        Scanner input = new Scanner(System.in);
        System.out.println("yasinizi girniz...");
        double age = input.nextDouble();
        System.out.println("age = " + age);
    }


}
