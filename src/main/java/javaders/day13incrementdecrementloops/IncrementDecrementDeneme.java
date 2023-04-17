package javaders.day13incrementdecrementloops;

public class IncrementDecrementDeneme {
    public static void main(String[] args) {
        //Increment
        int a = 5;
        System.out.println(a);
        a = a + 2;
        System.out.println(a);
        a += 2;
        System.out.println(a);
        //ex-1 bir tane integer variable olusturunuz ve onu iki sekilde bes artirin
        System.out.println("***************************************");
        int b = 5;
        System.out.println(a);
        b = b + 5;
        System.out.println(b);
        b += 5;
        System.out.println(b);

        System.out.println("*******************************************");
        //Decremet
        int c = 8;
        System.out.println(c);
        c = c - 3;
        System.out.println(c);
        c -= 3;
        System.out.println(c);

        System.out.println("***********************************************");
        //increment-2
        int d = 6;
        System.out.println(d);
        d = d * 2;
        System.out.println(d);
        d*=2;
        System.out.println(d);


        System.out.println("***********************************************");
        //decrement-2
        int e = 24;
        System.out.println(e);
        e = e / 2;
        System.out.println(e);
        e/=2;
        System.out.println(e);

        System.out.println("************************************************");
        //sadece bir ile increment
        int f = 12;
        f++;
        System.out.println(f);
        System.out.println("************************************************");
        //sadece bir ile decrement
        int h = 12;
        h--;
        System.out.println(h);

        System.out.println("***********************************************");
        //post-increment ve pre-decrement
        int i = 10;
        System.out.println(i);
        int k = i++;//post-increment cunku variable isminden sonra increment islemi yapildi
        System.out.println(k);//10==> i artirilmadan k sepetine konuldugu icin k nin degeri 10 olur.
        System.out.println(i);//11==> i satir sonunda aritirildigi icin i nin degeri 11 olur

        int m = 15;
        System.out.println(m);
        int n = ++m;//pre-indrement cunku variable isminden once increment islemi yapildi
        System.out.println(n);//m artidildiktan sonra n sepetine konuldugu icin n'nin degeri 16 olur
        System.out.println(m);//16==>m satir sonundaaritildigi icin m nin degeri 16 olur

        System.out.println("************************************");
        int p = 17 ;
        int r =p--;
        System.out.println(p);
        System.out.println(r);


    }
}
