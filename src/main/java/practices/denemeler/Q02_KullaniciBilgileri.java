package practices.denemeler;

public class Q02_KullaniciBilgileri {
    /*
	 first name, last name, age, height ve weight değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
	 		First Name: ...
	 		Last Name : ...
	 		Age: ...
	 		Height: ...
	 		Weight: ...
	 Not: Sadece bir adet "System.out.println(); kullanınız.
	 */
    public static void main(String[] args) {
        String name = "omer";
        String lastName = "tufan";
        int age = 25;
        double height = 1.80;
        double weight = 80.50;
        System.out.println("name:" + name + "\nlastName :" + lastName + "\nage :" + age + "\nheight :" + height + "\nweight :" + weight);
        //alt alta bu sekilde de yazdirabiliriz ln koymadan da yazdirabiliriz


    }

}
