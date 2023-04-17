package javaders.day39Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        printElements(myList);
        System.out.println();
        printEl(myList);

        System.out.println();
        printElExceptStartsWithT(myList);//Jim Clara

        System.out.println();
        printElLenghtLessThanThree(myList);//Tom Jim

        System.out.println();
        printElLengthMoreThanFourWithUpper(myList);//CLARA

        System.out.println();
        printElementLengthMoreThanFourUniqueLowerCase(myList); //clara angelina

        System.out.println();
        pritnElUniqueToUpperCaseSorted(myList);

        System.out.println();
        printElUniqueLowerCaseSortWithLength(myList);//tom jim clara angelina
    }
    //ex-1 : Bir list'teki elemanlari consol'a yazdiran methodu olusturunuz?

    //first way :
    public static void printElements(List<String> myList) {

        for (String w : myList){
            System.out.print(w + " ");
        }
    }

    //second way :
    public static void printEl(List<String> myList){
        myList.stream().forEach(t-> System.out.print(t + " "));
        //stream yapisi yukaridan asagiya dogru bir yapidir.
        //lambda functional programing'dir.
    }

    //ex-2  : Bir list'teki T ile baslayanlar haric tum elemanlari consola yazdiran methodu olusturunuz.
    public static void printElExceptStartsWithT (List<String> myList){
        myList.stream().filter(t->!t.startsWith("T")).forEach(t-> System.out.print(t + " "));
    }


    //ex-3: Bir list'te character sayisi 4'den az olan tum elemanlari consola yazdiriniz.
    public static void printElLenghtLessThanThree (List<String> myList){
        myList.stream().filter(t->t.length()<4).forEach(t-> System.out.print(t + " "));
    }

    //ex-4: Bir list'teki character sayisi 4'den cok olan tum elemanlari buyuk harflerle consola yazdiran method
    public static void printElLengthMoreThanFourWithUpper (List<String> myList){
        myList.stream().filter(t-> t.length()>4).map(t->t.toUpperCase()).forEach(t-> System.out.print(t +" "));
    }

    //ex-5 :Bir listte'ki character sayisi 4 cok olan tum elemanlari tekrarsiz olarak kucuk harflerle consola yazdiran method.
    public static void printElementLengthMoreThanFourUniqueLowerCase(List<String> myList){
        myList.stream().
                filter(t->t.length()>4).
                distinct().
                map(t->t.toLowerCase()).
                forEach(t-> System.out.print(t + ' '));
        //distinct() ://tekrarsiz elemanlar icin kullanilir
        //map() : var olan elemani degistirmek icin
    }

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz
    public static void pritnElUniqueToUpperCaseSorted (List<String> myList){
        myList.stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted().
                forEach(t-> System.out.print(t + " "));

        //sorted methodu natural order olarak calisir .String datalra icin A-Z integer 1 ...
    }

    //ex-7 Bir list'teki elemanlari tekrarsiz olarak kucuk harflerler uzuluklarina gore kucukten buyuge siralyarak yazdiran kodu
    public static void printElUniqueLowerCaseSortWithLength (List<String> myList){
        myList.stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t-> t.length())).
                forEach(t-> System.out.print(t + " "));
        //Comparator.comparing : siralamanini kontrolu bize ait ise

    }
}
