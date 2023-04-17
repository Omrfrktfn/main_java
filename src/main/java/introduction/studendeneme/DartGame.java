package introduction.studendeneme;

import java.util.Scanner;

public class DartGame {
    public static void main(String[] args) {
        System.out.println("Welcom to Dart Game : ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of darts to be throan : ");
        int num = input.nextInt();

        int Region_A = 0;
        int Region_B = 0;
        int Region_C = 0;
        int Region_D = 0;
        int Region_E = 0;
        int Region_F = 0;
        int Region_G = 0;
        int Undecided = 0;
        int totalDart = 0;

        while (num != 0) {

            int k = totalDart + 1;
            System.out.println("\n" + "Dart" + k + ":");

            double a = (Math.random() * 10 - 5);
            double x = (int) (a * 10) / 10.0;//double da bolme islemi yapaken double cinsinden yazmaliyiz
            System.out.println(x);

            double b = (Math.random() * 10 - 5);
            double y = (int) (b * 10) / 10.0;//double da bolme islemi yapaken double cinsinden yazmaliyiz
            System.out.println(y);

            if (x == -5.0 || x == 0.0 || x == 5.0 || y == -5.0 || y == 0.0 || y == 5.0) {
                System.out.println("Coardinates: {" + x + "," + y + "}");
                System.out.println("Undecided");
                Undecided = Undecided + 1;
                totalDart += 1;
            } else if (x > 0 && y > 0) {
                if (x + y > 5) {
                    System.out.println("Coardinates: {" + x + "," + y + "}");
                    System.out.println("Region is B");
                    Region_B = Region_B + 1;
                    totalDart += 1;
                } else if (x + y < 5) {
                    System.out.println("Coardinates: {" + x + "," + y + "}");
                    System.out.println("Region is A");
                    Region_A = Region_A+ 1;
                    totalDart += 1;
                } else {
                    System.out.println("Coardinates: {" + x + "," + y + "}");
                    System.out.println("Undecided");
                    Undecided = Undecided + 1;
                    totalDart += 1;
                }
            }


            num--;
        }
    }
}
