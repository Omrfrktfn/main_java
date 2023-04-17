package javaders.day35exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E06 {
    /*
    1-FileNotFoundException ve IOException compile time exceptionlardir, yani code'u yazarken hata aliriz.
    2-FileNotFoundException path'in dogrulugu ve dosyanin varligi ile ilgilidir.
    3-IOException tum input ve output islemleri ile ilgilidir.
    4-IOException class, FileNotFoundException class'in parentidir.
    istenirse FileNotFoundException yerine IOException'da kullanilabilir.
    5-IOException class ve FileNotFoundException beraber kullanilacaksa FileNotFoundException ustte
        IOException altta kullanilmalidir.
     */
    public static void main(String[] args) {

       // FileInputStream fis = null;
        try {
            FileInputStream fis = new FileInputStream("src/main/java/javaders/day35exceptions/file");
            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("Path is wrong or the file does not exist");
        } catch (IOException e) {
           // throw new RuntimeException(e);
            e.printStackTrace();
        }

    }
}
