package javaders.day35exceptions;

public class E01_Deneme {
    /*
       - try kisminda birden fazla exception olusturma ihtimali olan kod varsa coklu catch kullanilabilir.
       - coklu catch kullandiginiz'da Exception class'lar arasinda parent-child iliskisi yoksa catch'lerin
        sirasi onemli degildir. Ama kod'daki siralamaya uymak tavsiye edilir.
       - coklu catch kullandiginiz'da Exception class'lar arasinda parent-child iliskisi varsa ozaman catchlerin
        sirasina dikkat etmeliyiz. Child class ustte olmalidir.
       - Exception classlar arasinda parent child iliskisi varsa ;
            => ya cnild class'i ustte yazarak child ve parent icin ozellestirilmis code'ler yazilir
            => yada child'i hic kullanmaz sadece parent ile exception'lari handle etmeye calisirsiniz.

     */
    public static void main(String[] args) {

        int a = 12;
       // int b = 4;
        int b = 1; // iki farkli hata verir bu sonuc ve iki catch ile cozum yapariz.
        String s = "My Java";
        getCharFromString(s, a, b);
    }

    public static void getCharFromString(String s, int a, int b) {
       // int idx = a / b;
        //char ch = s.charAt(idx);
        //System.out.println(ch);

        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        }catch (ArithmeticException e){
            System.out.println("Do not divide by zero...");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandiniz...");
        }
    }
}
