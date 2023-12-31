package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Switch01 {
    /*
    kullanicidan gun isimlerini aliniz o gunun kacinci gun oldugunu ekrana yazdiriniz.
    sunday==>1  monday==>2...... saturday==>7
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day name...");
        String dayName = input.next();

        //first way
        if (dayName.equalsIgnoreCase("Sunday")) {
            System.out.println("Sunday is the first day...");
        } else if (dayName.equalsIgnoreCase("Monday")) {
            System.out.println("Monday is the second day...");
        } else if (dayName.equalsIgnoreCase("Thuesday")) {
            System.out.println("Tuesday is the third day...");
        } else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println("Wednesday is the fourth day...");
        } else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println("Thursday is the fifth day...");
        } else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println("Friday is the sixth day...");
        } else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println("Saturday is the seventh day...");
        } else {
            System.out.println("invalid day name...");
        }
        System.out.println("*******************************************");
        //second way
        switch (dayName.toLowerCase()) {
            case "sunday":
                System.out.println("Sunday is the first day...");
                break;
            case "monday":
                System.out.println("Monday is the second day...");
                break;
            case "thuesday":
                System.out.println("Tuesday is the third day..");
                break;
            case "wednesday":
                System.out.println("Wednesday is the fourth day...");
                break;
            case "thursday":
                System.out.println("Thursday is the fifth day...");
                break;
            case "frıday":
                System.out.println("Friday is the sixth day...");
                break;
            case "saturday":
                System.out.println("Saturday is the seventh day...");
                break;
            default:
                System.out.println("invalid day name");

        }

    }
}
