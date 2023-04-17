package advancedpractice.day06;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen ogenci sayisini giriniz");
        int numStd = input.nextInt();

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < numStd; i++) {
            System.out.println("isim: ");
            String name = input.next();
            System.out.println("cinsiyet: ");
            String gender = input.next().toUpperCase().trim();
            System.out.println("boy: ");
            double height = input.nextDouble();
            System.out.println("kilo: ");
            double weight = input.nextDouble();

            Student student = new Student(name,gender,height,weight);
            students.add(student);
        }
        List<Student> selectedStudents = new ArrayList<>();
        for (Student student: students) {
            if (student.getGender().equals("K") && student.getHeight()>1.50 && student.getWeight()>50 && student.getWeight()<70){
                selectedStudents.add(student);
            }else if (student.getGender().equals("E") && student.getHeight()>1.60 && student.getWeight()>60 && student.getWeight()<70) {
                selectedStudents.add(student);
            }
        }
        System.out.println("==================== Kursa Secilen Ogrenciler =====================");

        if (selectedStudents.size()==0){
            System.out.println("Malesef kurs gerksinimlerini saglayan ogrenci bulunamadi...");
        }else {
            for (Student student:selectedStudents) {
                System.out.println(student.toString());
            }
        }
    }
}
