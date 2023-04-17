package javaders.day12switchincrementdecrementloops;

public class Loops01 {
    public static void main(String[] args) {
        /*
        Code yazarken
        1-Tekrarli kod yazmamaya dikkat ediniz...
        2-Yazilan kodun gerektiginde tamir edilebilmesinin kolay olmasina
        3-Yazdiginiz kodun gerktiginde gelistirilebilmesinin kolay olmasina
        4-Yazdiginiz kodun farkli senaryalor icinde calisabilmesine dikkat ediniz.
         */
        //Ekrana 5 kere Hi yazdiriniz...
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("*************");
        //Yukaridaki gibi tekrar gerektiren isleri yapmak icin loop yapilarini kullaniriz.
        //4 tane loop yapisi vardir. 1-for loop 2- while loop 3-do while loop 4-for each loop

        //for-loop
        // starting value   loop conditon  increment/decrement
        for (int i = 1; i < 6; i++) {
            System.out.println("Hi");
        }

        System.out.println("*******************************");
        //dortgen yirmidorte kadar tum tam sayilari ayni satirda aralarina bosluk birakara konsola yazdiriniz.
        for (int i = 4; i < 25; i++) {
            System.out.print(i + " ");  //println yapmadik cunku ayni satira yazdirmak icin
            //aralarinda bosluk birakabilmek icinde " " islemini kullandik
        }

        System.out.println();
        //33'den 11'e kadar tum cift tam sayilari ekrana yazdiriniz.
        for (int i = 33; i > 10; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
        //Yazdiginiz kod baska sahada uzmanlik icermemeli
        System.out.println("*******************");
        for (int i = 32; i > 10; i = i - 2) {
            System.out.print(i + " ");
        }
        System.out.println("******************");
        //20'den 74'e kadar tum tek tamsayilari ayni satirda, aralarina bosluk birakarak console'a yazdiriniz
        for (int i2 = 20; i2 < 75; i2++) {
            if (i2 % 2 != 0) {
                System.out.print(i2 + " ");
            }
        }
        System.out.println("****************");
        //"Massachusetts" kelimesindeki tum sesli harfleri konsola yazdiriniz.
        System.out.println("***********************");
        String a="Massachusetts";
        for (int i=0;i<a.length() ; i++){
            char c = a.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                System.out.print(c);
            }
        }
    }
}
