package javaders.day20arraylistsdatetime;

import java.rmi.server.RemoteObjectInvocationHandler;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        //icinde bulundugumuz zaman dilimindeki tarini nasil aliriz
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);

        //Tarihten istedigimiz bileseni nasil aliriz
        int monthValue = myCurrentDate.getMonthValue();
        System.out.println("Month : " + monthValue);

        int yearValue = myCurrentDate.getYear();
        System.out.println("Year : " + yearValue);

        int dayValue = myCurrentDate.getDayOfMonth();
        System.out.println("Day : " + dayValue);

        //String montName = String.valueOf(myCurrentDate.getMonth());
        //enum java'da sabit degerleri deolamak icin kullanilir
        Month montName = myCurrentDate.getMonth();
        System.out.println(montName);

        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println(dayName);

        //sindiki tarihten kac gun sonra olmasini istesek
        //ilerike tarihe nasil gidilir.
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(4));


        System.out.println(myCurrentDate.minusYears(30).minusMonths(2).minusDays(18));


        //spscific bir tarih objesi nasil olusturulur.
        LocalDate gokhanDob = LocalDate.of(1986, 6, 10);
        LocalDate fatihDob = LocalDate.of(1986, 2, 25);

        //bir tarihin bir tarihten sonra olup olmadigi nasil kontrol edilir
        boolean r1 = gokhanDob.isAfter(fatihDob);
        System.out.println("r1 = " + r1);

        //bir tarihin bir tarih'ten once olup olmadigini nasil kontrol edilir
        boolean r2 = fatihDob.isBefore(gokhanDob);
        System.out.println("r2 = " + r2);

        //bir tarihin bir tari'e esit olup olmadigini nasil kontrol edilir
        boolean r3 = gokhanDob.isEqual(fatihDob);
        System.out.println("r3 = " + r3);

        //ex1 kullanicidan aldiginiz tarih gecmise ait ise gecerseiz tarih girdiniz mesaji veriniz.
        //kullanicidan aldiginiz tarih gelecege ait ise zamani girebilirsiniz deyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("please enter year month and day numbers in order...");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year, month, day);

        if (givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate + " iNVALID DATE");
        }else {
            System.out.println("Enter time for the ticket...");
        }

        int lengthOfMoneth = myCurrentDate.lengthOfMonth();
        System.out.println(lengthOfMoneth);

        //Example 2: Kullanicinin girdigi tarihin gun ismini bulan kodu yaziniz

        System.out.println("please enter year month and day numbers in order...");
        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate date = LocalDate.of(y, m, d);
        System.out.println(date.getDayOfWeek());

    }
}
