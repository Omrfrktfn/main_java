package javaders.day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

    /*
     1)Run Buton'una bastiktan sonra console'da alinan Exception'lara "Runtime Exception" denir.
         ArithmeticException, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException
         "Runtime Exception" a ornektir.
         "Runtime Exception"'lara Unchecked Exception'da denir.

     2)Code yazarken kirmizi alt cizgi seklinde alinan Exception'lar da vardir, bunlara "Compile Time Exception" denir.
         FileNotFoundException, IOException "Compile Time Exception" a ornektir.
          "Compile Time Exception"'lara Checked Exception'da denir.

      3)FileNotFoundException: Java'ya bir dosyayi bul dedigimizde java dosyanin adresi ve dosyanin varligi konusunda
         hata olusursa ne yapmasi gerektigini soylemenizi ister.

      4)IOException: IO Input Output demektir.
            Note: IOException, FileNotFoundException'in parent'idir.

      5)java'da hata'lar temelde 2'ye ayrilir.
        i-Exception'lar     ii-Error'lar: a)StackOverflow Error   b)out of memory error    c)Vitual machine error.
     */
    public static void main(String[] args) throws IOException {

        //first way : Exception'u method signature satirina ekledik
        FileInputStream fis = new FileInputStream("src/main/java/javaders/day36exceptions/TextFile");

        int i = 0;

        while ((i = fis.read())!=-1){//ASCII deger -1 olmadigi surece loop'u calistir.

            System.out.println((char) i);
        }
    }
}
