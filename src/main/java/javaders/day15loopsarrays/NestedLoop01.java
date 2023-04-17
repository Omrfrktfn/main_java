package javaders.day15loopsarrays;

import java.util.Scanner;

public class NestedLoop01 {
    public static void main(String[] args) {
        /*
         1.Example:Type code to get the output like
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */

        //nested for loop
        for (int i = 1; i < 5; i++) {
            System.out.println("Week: " + i);
            for (int k = 1; k < 8; k++) {
                System.out.println("   Day: " + k);
            }
        }
        System.out.println("*********************");
        //nested while loop

        int m=1;
        while (m<5){
            System.out.println("Week: " + m);

            int n =1;
            while (n < 8){
                System.out.println("   Day: " + n);
                n++;
            }
            m++;
        }

        System.out.println("****************************");
        /*
          2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                        ****
                        ****
                        ****
            Note: Get the number of the rows and the columns from user
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen satir sayisini giriniz...");
        int rows=input.nextInt();
        System.out.println("lutfen sutun sayisini giriniz...");
        int colums=input.nextInt();

        for (int r =1 ;r<rows;r++){

            for (int j = 1;j<=colums;j++){
                System.out.print("* ");
            }
            System.out.println();//alt tarafa gec demesi icin

        }
        System.out.println("********************************");
        /*
          3.Example: Type code to get the output like
                        1
                        1 2
                        1 2 3
                        1 2 3 4
                        1 2 3 4 5
         */

        System.out.println("please enter row number...");
        int row= input.nextInt();

        for (int p =1;p<=row;p++){

            for (int t=1;t<=p;t++){
                System.out.print(t+" ");
            }
            System.out.println();
        }
    }
}
