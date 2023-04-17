package javaders.day30collections;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Sets02 {

    public static void main(String[] args) {

        //ex: Ogrenici email adreslerini Natural Order'da siralanmis olarak depolayiniz.

        //fist way

        Long t1 = System.nanoTime();
        TreeSet<String> emails = new TreeSet<>();

        emails.add("abc@gmail.com");
        emails.add("abd@gmail.com");
        emails.add("abe@gmail.com");
        emails.add("abf@gmail.com");
        emails.add("abg@gmail.com");
        emails.add("abh@gmail.com");
        emails.add("abi@gmail.com");
        emails.add("abj@gmail.com");
        emails.add("abk@gmail.com");
        emails.add("abl@gmail.com");

        System.out.println(emails);

        //second way

        Long t2 = System.nanoTime();
        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("abc@gmail.com");
        emailsHs.add("abd@gmail.com");
        emailsHs.add("abe@gmail.com");
        emailsHs.add("abf@gmail.com");
        emailsHs.add("abg@gmail.com");
        emailsHs.add("abh@gmail.com");
        emailsHs.add("abi@gmail.com");
        emailsHs.add("abj@gmail.com");
        emailsHs.add("abk@gmail.com");
        emailsHs.add("abl@gmail.com");

        TreeSet<String > emailHsTs = new TreeSet<>(emailsHs);//rastgele dizilmis olan elemanlar bu sekilde siralanir

        System.out.println(emailHsTs);
        Long t3 = System.nanoTime();

        System.out.println("TreeSet" + (t2-t1));
        System.out.println("HashSet" +(t3-t2));
    }
}
