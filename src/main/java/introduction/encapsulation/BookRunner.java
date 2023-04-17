package introduction.encapsulation;

public class BookRunner {
    public static void main(String[] args) {
        //obje olusturma yeni kitap olusuturma
        Book b1 = new Book("Harry Potter",400,"Rowling","Kodlama");
       // b1.numberOfPage = -400;//disardan erisim olamamasi icin public degil private olmli
        //System.out.println(b1.numberOfPage);//bu sefer de buna erisemiyoruz.

        b1.setNumberOfPage(-400);

        System.out.println(b1.getNumberOfPage()); //ekran yazdirma islemi yapariz.
        //fakat sayfa sayisi guncelenirse baskasi eklemek isterse ise set yapmaliyz
        //get methodu ile private bir degiskeni baska bir class'ta kullanabiliyoruz.


        Book b2 = new Book("Lord Of The",500,"Peter Jackson","Kodlama");

       // b2.name // bu sekilde ulasamayiz
        b2.setName("Lord of the rings");
        System.out.println(b2.getName());
    }
}
