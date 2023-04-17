package javaders.day18constructorsstatickeyword;

public class Student {

    /*
    1-static class member'lar (variable + method + constructor + code blocks) tum objeler tarafindan paylasilir.
    2-static class member'lardaki tum objectler tarafindan otomotik olarak gorulur.
    3-static class member'lar gokteki ayin dunya'ya bagli oldugu gibi, class'a baglidirlar. Bu yuzden static
    variable'lara class variale'de denir.
    4-static class member'larin nasil calistigini anlamak icin cizim yapip static olanlari class'a olmayanlari
    objeye bagliyarak dusunmek bu konuyu kolaylastirir.
    5-static class member'lari cagirmak icin object olusturmak gerekmez  e tavsiye edilmez.
    6-non-static class memberleri cagirmak icin obje olusturmak sarttir.
     */

    public static int numOfRegisteredStd = 0;
    public int num = 0;

    public Student() {
        numOfRegisteredStd++;
        num++;
    }

    public static void main(String[] args) {

        System.out.println(numOfRegisteredStd);//0
        Student s1 = new Student();
        System.out.println(numOfRegisteredStd);//1
        Student s2 = new Student();
        System.out.println(numOfRegisteredStd);//2
        Student s3 = new Student();

        System.out.println(numOfRegisteredStd);// 3 //bu bir tane oldugu icin belli etmeye gerek yok
        System.out.println(s1.num);//s1 s2 s3 e ait num oldugu icin sadece num dersek kabul etmez.Hangisi oldugnu belli etmeliyiz
    }
}
