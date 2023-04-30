package javaders.day34exceptions;

import javax.management.MBeanAttributeInfo;
import java.security.PublicKey;

public class E04 {

    public static void main(String[] args) {

        String arr[] = {"A", "G", "M", "L"};
        getElementFromArray(arr, 1);//G
        getElementFromArray(arr, 5);
    }

    public static void getElementFromArray(String[] s, int idx) {

      //  String el = s[idx];
      //  System.out.println(el);
        try {
            String el = s[idx];
            System.out.println(el);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getCause());
            System.out.println(" sonuc " + e.getMessage());
        }
    }
}
