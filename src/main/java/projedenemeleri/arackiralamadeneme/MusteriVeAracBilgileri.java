package projedenemeleri.arackiralamadeneme;

import advancedpractice.day04.Arac;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MusteriVeAracBilgileri extends AracTalebi {
    Scanner input = new Scanner(System.in);
    List<AracTalebi> aracList=new ArrayList<>();


    public void aracTalep(){

        AracTalebi araba=new AracTalebi();
        input=new Scanner(System.in);

        System.out.println("Arac alinacak sehir...");
        String alinacakSehir = input.nextLine();

        System.out.println("Arac teslim edilecek sehir...");
        String teslimSehir = input.nextLine();

        System.out.println("Arac alinacak gun...");
        String alinacakGun = input.nextLine();
        LocalDate alinanDate = LocalDate.now();

        System.out.println("Arac teslim edilecek gun...");
        String teslimGun = input.nextLine();

        System.out.println("Arac teslim edilecek saat...");
        String teslimSaat = input.nextLine();

    }


}
