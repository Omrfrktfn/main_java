package javaders.day42Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");
        names.add("Brad");

        System.out.println(sortWithLastCharDistinctUpperIntList(names));
        System.out.println(" ");

        System.out.println(sortWithLenghtReverSedLowerInList(names));
        System.out.println(" ");

        System.out.println(isLengthMoreThanTwo(names));
        System.out.println(" ");

        System.out.println(noLengthLessThanThree(names));
        System.out.println(" ");

        System.out.println(atleastOneLenghtLessThanFour(names));
        System.out.println(" ");


    }

    //Ex-1 list elemanlarini son harflerine gore natural order'da tekrarsiz olarak buyuk harfle bir list'in icinde return ediniz.

    public static List<String> sortWithLastCharDistinctUpperIntList(List<String> names) {
        return names.stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                collect(Collectors.toList());
        //Normalde distinct elemanlari depolamak icin Set kullanilir. Ama lambda'da ki toSet methodu elemanlari rastgele
        //siralar halbuki bu soruda rastgele siralama kabul edilmiyor. Bu yuzden mecburen toList kullandik.
    }

    //Ex-2 list elemanlarini karakter sayilarina gore ters sirada kucuk harfle bir listin icinde return ediniz.
    //ayni character sayisina ait elemanlar kendi icinde alfabetik sirada olsun.

    public static List<String> sortWithLenghtReverSedLowerInList(List<String> names) {
        return names.stream().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length).reversed().thenComparing(t -> t.charAt(0))).
                collect(Collectors.toList());

        //thenComparing() siralama icinde siralama yaptigimizda kullaniriz.
    }

    //ex-3 list elemanlarinin tamaminin character sayisinin 2'den buyuk olup olmadigini kontrol eden methodu olusturunuz.

    public static boolean isLengthMoreThanTwo(List<String> names) {
        return names.stream().
                allMatch(t -> t.length() > 2);
        /*
        Bu soruda yeni olan seyler: allMatch methodu, elemanlarin karakter sayilarina bakip 2'den buyuk mu diye kontrol edecegiz.
Bunu normalde for each loop ile yapabiliriz. Ancak simdi Lambda ile cozecegiz.
Methodun return type'nin boolean olmasi mantikli. Parnatezi icine listimizi koyduk.
Sirasiyla names.stream().allMatch(t->t.length()>2)
Sorumuzda elemanlarin tamami dendiginden allMatch methodunu sectik. Herbir elaman alinacak ve karakter sayilarina
bakacak, 2'den buyukse true verecek aksi halde false verecek.
         */
    }

    //ex-4 list elemanlarinin hicbirinin character sayisinin 3'den kucuk olmadigini kontrol eden method'u olustrunuz
    public static boolean noLengthLessThanThree(List<String> names) {
        return names.stream().
                noneMatch(t -> t.length() < 3);
    }

    //ex-5 list elemanlarinin en az birinin character sayisinin dort'ten kucuk olup olmadigini kontrol eden methodu olusturunuz.
    public static boolean atleastOneLenghtLessThanFour(List<String> names) {
        return names.stream().
                anyMatch(t -> t.length() < 4);
        /*
        Example 5:
Bu soruda yeni olan seyler: elemanlarin en az biri dendigi icin burada anyMatch methdounu kullanacagiz.
Bu method kurala uyan birini bulunca digerlerine bakmaz.
Method boolean bir method ve parametresi listimiz.
method body'si icine sirasiyla return names.stream()anyMatch(t->t.length()<4);
Kodumuzu calistirdigimizda ekranda true gorduk, cunku Jim ve Tom vardi. Bu isimleri cikarinca false verdi.
         */
    }


    /* Match
allMatch() ==> tum elemanlar sarti saglarsa true dondurur
anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur
 */

}
