package javaders.day25polymorphism;

public class StudentRunner {
    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println("s1.getStdId() = " + s1.getStdId());

        System.out.println("s1.getGpa() = " + s1.getGpa());

        System.out.println("s1.isSuccessful() = " + s1.isSuccessful());

        s1.setGpa(3.91);//bu kodu yazinca 3.99 olur ama classta 3.87 kalir
        //cunku obje icinde degistirdi
        System.out.println(s1.getGpa());
    }
}
