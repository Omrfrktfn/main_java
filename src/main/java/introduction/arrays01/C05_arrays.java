package introduction.arrays01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C05_arrays {

    public static void main(String[] args) {

        String isimler[]={"veli","ali","furkan","hasan","huseyin"};
        enUzunVeEnKisa(isimler);

        String isimler1[]={"ankara","adiyaman","rize","izmir"};
        enUzunVeEnKisa(isimler1);
    }
    public static void enUzunVeEnKisa(String [] isimler){

        String enUzunKelime = isimler[0]; String enKisaKeilime=isimler[0];
        for (int i = 1; i <isimler.length ; i++) {
            if (enUzunKelime.length()<isimler[i].length()){
                enUzunKelime=isimler[i];
            }
            if (enKisaKeilime.length()>isimler[i].length()){
                enKisaKeilime=isimler[i];
            }
        }
        System.out.println("Arraydeki en uzun kelime : " +enUzunKelime);
        System.out.println("Arraydeki en kisa kelime : " +enKisaKeilime);
    }
}
