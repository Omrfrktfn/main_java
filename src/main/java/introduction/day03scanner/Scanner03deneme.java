package introduction.day03scanner;

import java.util.Scanner;

public class Scanner03deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lutfen isminizi girinzi : ");
        String name = input.nextLine();
        System.out.println("name = " + name);

        System.out.println("lutfen soyisminizi giriniz : ");
        String lastName = input.nextLine();
        System.out.println("lastName = " + lastName);

        System.out.println("lufen yasinizi giriniz : ");
        byte age = input.nextByte();
        System.out.println("age = " + age);

        System.out.println("lutfen baba adini giriniz : ");
        String fatherName = input.nextLine();
        System.out.println("fatherName = " + fatherName);

        System.out.println("lutfen adresinizi giriniz : ");
        String address = input.nextLine();
        System.out.println("address = " + address);

    }
}
