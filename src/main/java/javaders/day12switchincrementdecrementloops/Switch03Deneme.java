package javaders.day12switchincrementdecrementloops;

import java.util.Scanner;

public class Switch03Deneme {
    public static void main(String[] args) {
         /*
            Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"
            kullanicidan bir ulke ismi aliniz. Alinan ulke adina gore kisaltmalari yaziniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen ulke adini giriniz...");
        String coutry = input.nextLine();

        switch (coutry.toLowerCase()){
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("ABD");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("Girilen ulke tanimli degildir....");

        }
    }
}
