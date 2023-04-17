package introduction.day03scanner;

import introduction.day04scannerwrappercreate.Student;

public class Runner {
    public static void main(String[] args) {

        // Object nasil olusturulur
        //class name + object name + atama operatoru + "New" keyword + constructor
        Car myCar = new Car();

        //new keyword u sifirdan yeni bir obje olusturmak icin kullanilir.
        //Consructor java da nesneler iolusturmak icin kullnilan ozel bir methoddur. constructor class ismidir

        System.out.println(myCar.price);
        System.out.println("Model = " + myCar.model);

        myCar.movement();
        myCar.stop();

        Student tomHanks = new Student();
        System.out.println("name =" + tomHanks.name);
        System.out.println("grade =" + tomHanks.grade);
        System.out.println("addres =" + tomHanks.addres);

        tomHanks.feed();
        tomHanks.study();

        byte grade = tomHanks.grade; // bu sekilde de calistirilabilir
        System.out.println("grade = " + grade);


    }

}
