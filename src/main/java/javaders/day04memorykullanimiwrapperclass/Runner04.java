package javaders.day04memorykullanimiwrapperclass;

public class Runner04 {
    public static void main(String[] args) {

        OgrenciEmrah ogrenci = new OgrenciEmrah();
        System.out.println("name = " + ogrenci.name);
        System.out.println("room = " + ogrenci.room);
        System.out.println("age = " + ogrenci.age);

        ogrenci.study();
        ogrenci.derseDevam();
    }
}
