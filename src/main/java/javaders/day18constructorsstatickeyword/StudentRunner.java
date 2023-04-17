package javaders.day18constructorsstatickeyword;

import java.util.Arrays;

public class StudentRunner {

    public static void main(String[] args) {

        //Static olan numOfRegistredStd variable'ini cagirmak icin sadece class ismini kullandik, obje olusturmadik
        System.out.println(Student.numOfRegisteredStd); //0

        //Static olmayan num varable'ini cagirmak icin object olusturduk
        Student s1 = new Student();
        System.out.println(s1.num);

        String s2= "Ali";
    }
}
