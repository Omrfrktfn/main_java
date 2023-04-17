package javaders.day22stringbuilder;

public class Sbf01 {
    public static void main(String[] args) {
        /*
        1-StringBuffer java'da string ureten bir class'tir
        2-StringBuffer StringBuilder'a cok benzer. Yani ikisde mutable string uretir.
        StringBuffer multi thread'dr ama stringBuilder mult-thread degildir.
        4-Java StrinbBuffer'i StringBuilder'den once olusturdu.
        5-StringBuilder multi-thread olmadigi icin StringBuffer'dan daha hizli calisir.
        6- "multi-thread" yapilirken yapilan islemlerin siralamsi onem arz eder.
          -yapilan islemleri mantikli bir siraya koymak "synchranization" olarak adlandirilir.
          - Stringbuffer multu-thread oldugu icin ayni zamanda "synchranized" dir

        3 tane string olusturan class ogrendik
          1-Immutable string lazimsa String class
          2-mutable string lazimsa StringBuilder yada StrinbBuffer kullanilir
            i-StringBuilder'i multi-thread gerekmezse kullaniriz
            ii-StrinbBuufer'i multi-thread gerekirse kulaniriz.


         */

        StringBuffer sbf1 = new StringBuffer("Java");




    }

}
