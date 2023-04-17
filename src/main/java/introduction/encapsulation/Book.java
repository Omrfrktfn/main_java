package introduction.encapsulation;

public class Book {

    private String name,yazar,yayinci ;
    private int numberOfPage;

    //constranctari yazalim
    Book(String name, int numberOfPage, String yazar , String yayinci){
        this.name = name;

        this.yazar = yazar;
        this.yayinci = yayinci;

        if (numberOfPage < 1){
            this.numberOfPage = 10; //default deger atamasi yaptik
        }else {
            this.numberOfPage=numberOfPage;//degilse disardan atadigim degeri girsin
        }
    }

    public int getNumberOfPage(){
        return this.numberOfPage;
    }


    //void degisme islemi yapar
    public void setNumberOfPage (int size ){
        if (size < 1) {
            System.out.println("sayfa sayisi negatif olamaz...");
            this.numberOfPage = 10; // varsayilan bir sayfa degeri ataiyoruz
        }
        else {
            this.numberOfPage = size;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getYayinci() {
        return yayinci;
    }

    public void setYayinci(String yayinci) {
        this.yayinci = yayinci;
    }
}
