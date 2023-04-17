package introduction.studendeneme;

public class Loop1 {
    public static void main(String[] args) {
        /*
        amstrong sayilari bulan bir program yazalim
        153 = (1*1*1) +(5*5*5)+(3*3*3)
        153 bir amstrong sayidir.
        370 bir amstrong sayidir
        371 bir amstrong sayidir
        407 bir amstrong sayidir
        */

        for (int i = 100; i <= 999; i++) {

            int template = i;
            int birler, onlar, yuzler;
            //basamaklara ayirma islemi
            birler = template % 10;
            template /= 10;
            onlar = template % 10;
            template /= 10;
            yuzler = template % 10;
            template /= 10;

            int toplam = (birler*birler*birler)+(onlar*onlar*onlar)+(yuzler*yuzler*yuzler);

            if (toplam ==i){
                System.out.println(i + " bir Amstron sayidir");
            }

        }

    }
}
