package introduction.encapsulation;

public class Pen {

    // String color;//renk ve uzunluk bilgileri sadece bu class icerisinde kalsin ve
    //baska class'lardan bizim iznimiz dahilinde erisim olmasin
    // int height;

    //bir alanin bize ait ozel oldugnu belirtmek icin private yapilir.
    private String color;
    private int height;

    Pen(String color , int height){

        this.color = color;
        this.height = height;
    }

/*
    void writeMessage(String message) {
        System.out.println("Mesajini : " + message);
    }

 */



    // public //alanim kilitli ancak alanima yazacagim erisim herkese acik olmali ve biizm iznimiz dahilinde degisiilkler oslun

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {//uc renk disi hata versin
        if ("red".equals(color) || "blue".equals(color) || "black".equals(color)) {
            this.color = color; // ilk once bu yapilir.
        } else {
            // throw new IllegalArgumentException();//farkli renk girildiginde verilen hata mesaji7
            System.out.println("Girilen renk hatali...");
        }

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {//uzunlukla ilgili kisitlama bize kalmis
        this.height = height;
    }

}
