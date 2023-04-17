package javaders.day17multidimensionalarraypassbyvalue;

public class PassByValue01 {
    /*
    method olusturmak icin asagidaki bes adimi takip ediniz.
    1-Acces modfier
    2-return type
    3-method name
    4-method parantezi
    5- { } parantezleri method body'si icin

    note : main methodun icindeki tum methodalar stacic olmalidir. Bir methodu static yapmak icin acces modifier ile
    return type'in arasina static yazmak yeterlidir.

    pas by Value : Java pas by valu kullanir
    yani java methodlarin orjinal degeri degistirmesine musade etmez.
    java method'lara deger yollarken orjinal degerin kopyasini olusturur ve o kopyayi methoda yollar.
    Method kopya deger uzerinde degisiklik yapar boylece orjinal deger korunmus olur.
    java esnek bir dil'dir. Istersek yazdigimiz kod ile orjinal degerin degismesinide temin edebiliriz.

    Pass by reference :
    1-pass by reference'de methoda reference yollanir.
    2-Reference adres demektir. Adres yollaninca method adresi kullanarak orjinal degere ulasir ve
    orjinal degeri degistirir. Bu yuzden C# gibi pass by reference kullanan dillerde
    method variablenin orjinal degerini degistirir.

     */
    public static void main(String[] args) {
        int shirtPrice = 200;

        System.out.println("Ogrenci indirimi :"+discount("student", shirtPrice));
        System.out.println("Gazi indirimi :"+discount("veteran", shirtPrice));
        System.out.println("Yasli indirimi :"+discount("senior", shirtPrice));

        System.out.println("orjinel deger : " + shirtPrice);

    }

    //Discount methodu olusturunz
    public static  int discount (String type, int price){
        switch (type){
            case "student":
                price = price-20;
                break;
            case "veteran":
                price = price-40;
                break;
            case "senior":
                price = price-30;
                break;
            default:
                price=price;
        }
        return price;

    }
}
