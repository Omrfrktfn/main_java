package javaders.day44Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Lambda01 {

    public static void main(String[] args) throws IOException {

        //Example 1: Verilen myTextFile.txt icindeki text'i console'a yazdiran code'u yaziniz.
        Files.lines(Paths.get("src/main/java/javaders/day44Lambda/myTextFile.txt")).forEach(System.out::println);

        //Example 2: Verilen myTextFile.txt icindeki text'i buyuk harflerle console'a yazdiran code'u yaziniz.
        Files.lines(Paths.get("src/main/java/javaders/day44Lambda/myTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);

        //Example 3: Verilen myTextFile.txt icindeki text'lerde "Java" kelimesinin olup olmadigini kontrol eden kodu yaziniz.
        boolean r1 = Files.lines(Paths.get("src/main/java/javaders/day44Lambda/myTextFile.txt")).anyMatch(t->t.contains("Java"));
        System.out.println(r1);

        //Example 4: Verilen myTextFile.txt icindeki text'lerde kullanilan farkli kelimeleri bir list icinde return ediniz.
        List<String> words = Files.
                lines(Paths.get("src/main/java/javaders/day44Lambda/myTextFile.txt")).
                map(t->t.replaceAll("\\p{Punct}", "")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                distinct().
                collect(Collectors.toList());
        System.out.println(words);
        /*
        Example 4: Text icinde kullanilan farkli kelimeleri bir list icinde return edecegiz.

Oncelikle String bir List olusturduk. text'imiz files.lines ve devamini assign ettik. files.lines kismi ile biz
file'a ulasiriz. Bu satir yanina sirasiyla map methodunu yazdik. Map icinde once noktalama isaretlerini silmemiz ve
 sonrasinda split metodu ile kelimeleri almamiz lazim. Once replaceAll metodu icine {"\\p{Punct}" yazarak noktalama
 isaretlerini sildik ve yine map icinde split metodunu kullandik. split metodu
icine " " yazarak bosluklar cikarilinca bize kelimeler kaldi. Istersek map'i bir kerede istersek iki kez kullanabiliriz.
 split metodu bize array verir. Kelimelerimiz bir array icinde oldu. map metodu yaninda flatMap metodu kullandik.
 flatMap array icine girmemizi saglar, metni cevreleyen duvarlar flatMap ile kirildi. stream icindeki kelimeler ile
  calisacaksak icine girebilmek icin flatMap kullaniriz. Bu metod icine Arrays::stream yazarak ardindan distinct metodunu
  ekleyerek farkli kelimeleri aldik.

ve collect(Collector.toList) ile kalan tum farkli kelimeleri bir liste koyduk. En son sout icinde listimizin words olan
ismini yazarak kodumuzu calistirdik.
         */

        //Example 5: Verilen myTextFile.txt icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.
      Long NumOfLetter=  Files.
                lines(Paths.get("src/main/java/javaders/day44Lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^A-Za-z]","")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                count();
        System.out.println(NumOfLetter);

        //Example 6: Verilen text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin
//           icinde return eden kodu yaziniz.
        List<String> letters =   Files.
                lines(Paths.get("src/main/java/javaders/day44Lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^A-Za-z]","")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(letters);

        /*
        Example: Text file icinde kullanilan tum harfleri alfabetik olarak ters sirada bir list icinde return
edecegiz.
1. adim:List olustur
2.adim:text file'i dosyaya ulasacak sekilde al, Files.lines(Paths...
3.adim:map metodu ile harf disindaki karakterleri sil
4.adim:2.map ile split metodu ile hiclikten keserek harfleri al. Array olarak verir.
5.adim:flatMap ile duvari kir ve harflere ulas
6.adim:sorted(Comparator.reverseOrder() ile ters sirada harfler sirala
7.adim:collect(Collectors.toList() ile harfleri list icine yerlestir.
sout icine listin ismini yaz ve calistir
         */


    }
}