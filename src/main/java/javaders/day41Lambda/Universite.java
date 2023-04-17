package javaders.day41Lambda;

public class Universite {

    private String name;
    private String bolumAdi;
    private int ogrenciSayisi;
    private int notOrt;


    public Universite() {
        //parametresiz constructor olusturduk.
    }

    public Universite(String name, String bolumAdi, int ogrenciSayisi, int notOrt) {
        this.name = name;
        this.bolumAdi = bolumAdi;
        this.ogrenciSayisi = ogrenciSayisi;
        this.notOrt = notOrt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBolumAdi() {
        return bolumAdi;
    }

    public void setBolumAdi(String bolumAdi) {
        this.bolumAdi = bolumAdi;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }

    public int getNotOrt() {
        return notOrt;
    }

    public void setNotOrt(int notOrt) {
        this.notOrt = notOrt;
    }

    @Override
    public String toString() {
        return "Universite{" +
                "name='" + name + '\'' +
                ", bolumAdi='" + bolumAdi + '\'' +
                ", ogrenciSayisi=" + ogrenciSayisi +
                ", notOrt=" + notOrt +
                '}';
    }
}
