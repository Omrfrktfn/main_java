package javaders.day25polymorphism;

public class Student {


    public String stdName = "Tom Hankas";
    public int age =23;

    /*
    Encapsulation nedir : Data saklamaktir. (Data Hiding)
    Data'yi nasil saklarsin : Acces Modifier'ini private yaparak

    Encapsulation yaptigimiz data'yi istersek okuyabiliriz.
    Nasil okuruz : get method olustururak encapsulation edilmis data'nin degerini okuyabiliriz.
     */

    private String stdId = "AC20231021T";

    private double gpa = 3.87;

    private boolean successful = false;

    public String getStdId() {//sag tik get yaparak kilitli olan secilir ve  method kullanilir
        return stdId;
        //stdId'ni baska classtan okunmasi icin bu islem yapilir
        //ve run classinda calistirilir.
    }

    public double getGpa() {
        return gpa;
    }

    //Encapsulation yapilan variablenin Data type'i boolean ise
    //get method ismi is ile baslar.
     /*
    1-get methodlari hep public olur
    2-get hothod'un return type'i okudugu variable'in return type'i ile ayni olur.
    3-get method bir boolean variable icin olusturulduysa ismi is ile baslar.
    */
    public boolean isSuccessful() {
        return successful;
    }

    //Encapsulation yaptigimiz datayi istersek diger class'lardan nasil degistirebiliriz.
    //nasil degistirebiliriz. set method olusturarak encapsulate edilmis data'nin degerini degistirebiliriz.
   /*
   1-set methodlar hep public olur
   2-set methodun return type'i hep void olur
   3-set method parametre kullanir. parameter'ni data type'i variable ile ayni olur.

   set method kullanarak var olan object uzerinde degisiklikler yaparak o objeyi sanki yeni bir objeymis gibi kullanabiliri
    */

    public void setGpa(double gpa) {

        this.gpa = gpa;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
