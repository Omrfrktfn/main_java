package javaders.day12switchincrementdecrementloops;

public class IncrementDecrement {
    /*
    1-Increment artirmak demektir. Decrement azaltmak demektir.
    2-Increment toplama ve carpma ile, Decrement cikarma ve bolme ile yapilibilir.
    3-Inceremnt ve decrement uc yolla yapilabilir.
        i-int a = 12; ==> a = a +5;
        ii= int a = 12; ==> a +=5;
        iii=int a = 12; ==> a++;
        not:ucun yol sadece bir artirmak icin kullanilabilir.

         i-int a = 12; ==> a = a -5;
        ii= int a = 12; ==> a -=5;
        iii=int a = 12; ==> a--;
        not:ucun yol sadece bir azaltmak icin kullanilabilir.
     */
    public static void main(String[] args) {

        int age = 12;
        System.out.println(age);

        //age = age++; // post increment denir.
        age = ++age; //pre increment denir.
        System.out.println(age);

        int salary = 40;

        salary= salary--; // post decrement
        System.out.println(salary); //40

        salary= --salary; //pre decrement
        System.out.println(salary); //39


    }
}
