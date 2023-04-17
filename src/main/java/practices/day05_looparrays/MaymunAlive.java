package practices.day05_looparrays;

public class MaymunAlive {
    /* INTERWIEW SORUSU


        Adada yalnız bir maymun var
        Her gün 4 muz yemesi gerekiyor
        o adada sadece 165 muz var
        Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

        */
    public static void main(String[] args) {
        int numberOfBananas = 165;
        int survilvalDays = 1;
        boolean monkeyAlive = true;

        do {
            numberOfBananas -=4;//toplam muz sayisindan hergun 4 muz eksilir
            System.out.println("Kalan muz sayisi : " +numberOfBananas);
            survilvalDays++;
            if (numberOfBananas < 4){
                monkeyAlive= false;
                System.out.println("Bugun " +survilvalDays+".gunde yeterli muz kalmadi maymun oldu...");
            }else {
                System.out.println("Bugun "+survilvalDays+".gun maymun halen hayatta");
            }
        }while (monkeyAlive);

    }

}
