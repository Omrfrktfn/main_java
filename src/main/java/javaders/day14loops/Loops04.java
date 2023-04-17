package javaders.day14loops;

import java.util.Scanner;

public class Loops04 {
    public static void main(String[] args) {
        //Kullanici user name ve pasword u girsin
        //3 kereden fazla yanlis girerse your account was blocked olmustur mesaji alsin
        //3 kereye kadar yanlis girerse invalid user name or pasword try again tekrar deneyinz mesaji alsin
        //Dogru girerse hesabiniza welcome to your account mesaji alsin

        Scanner input = new Scanner(System.in);
        int counter = 0;
        String validUserName="techpro123";
        String validPassword="Education12?";

        do {
            if (counter == 3){
                System.out.println("your account was blocked");
                break;
            }
            System.out.println("please enter your user name");
            String userName = input.next();
            System.out.println("please enter your password");
            String password = input.next();

            counter++;

            if (userName.equals(validUserName) && password.equals(validPassword)){
                System.out.println("welcome to your account");
                break;
            }else {
                System.out.println("invalid user name or pasword try again");
                System.out.println((3-counter) + "right left");
            }
        } while (true);
    }
}
