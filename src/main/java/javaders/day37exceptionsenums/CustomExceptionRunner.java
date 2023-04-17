package javaders.day37exceptionsenums;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomExceptionRunner {
    /*
       - try kullandiginizda her senaryo icin calismasini istedigimiz kodlari "finallly " block icine koyariz.
       - final, finally, finalize aciklarmisiniz ? (interview sorusu)
       final ve finally aciklandi.
       finalize : Garbage Collector memory'i temiz tutmak icin surekli memory'i tarar ve silinmesi gerekenleri
       siler. Garbage collector silmeden once silecegi data'lari finalize eder sonra siler.
     */
    public static void main(String[] args) throws IllegalGradeException {
        //System.out.println(getGrades());
        try {
            printAge(-45);
        }catch (IllegalAgeException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I always work...");
        }

    }

    //Example-1 : Ogrenci notlarini bir list'e ekleyen method'u olusturunuz.
    public static List<String> getGrades() throws IllegalGradeException {

        List<String> grades = new ArrayList<>();
        //char ch = 'a';
        String grade = "";

        Scanner input = new Scanner(System.in);
        //System.out.println("To stop entering press 0(zero) ...");
        //   System.out.println("To stop entering press q");
        // char ch = input.next().charAt(0);

        do {
            System.out.println("please enter the grade. To stop entering press q.");
            grade = input.next();
            int intGrade = 0;
            if (!grade.equals("q")) {
                intGrade = Integer.valueOf(grade);
            }

            if (grade.equals("q")) {
                break;
            } else if (intGrade >= 0 && intGrade <= 100) {
                grades.add(grade);
            } else {
                throw new IllegalGradeException("Grades less than zero anda greater than 100 are not valid.");
            }

        } while (!grade.equals("q"));
        return grades;
    }

    //example2 : Kullanicinin yasini consol'a yazdiran methodu olusturunuz
    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalAgeException("Ages can not be negative ...");
        }
        System.out.println(age);
    }
}
