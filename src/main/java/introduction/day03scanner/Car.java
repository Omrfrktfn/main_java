package introduction.day03scanner;

public class Car {
    //variable'lar olusturma
    public String model = "Corolla";
    public int price = 20000;

    //Method'lar olusturma
    //note: return type void oldugunuda method icinde return keyword kullanilmaz
    //eger bir method yeni bir data uretmiyorsa sadece belli bir islem yapiyorsa  return type i void olur.

    public void movement() {
        System.out.println("Corolla hizli hareket eder....");
    }

    public void stop() {
        System.out.println("Corolla guvenli bir sekilde durur...");
    }
}
