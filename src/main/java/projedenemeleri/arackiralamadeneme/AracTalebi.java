package projedenemeleri.arackiralamadeneme;

public class AracTalebi {
    /*
     Java'da "POJO" (Plain Old Java Object) sınıfı, temel bir Java sınıfıdır ve genellikle sadece nesne özelliklerini ve
     bunların getter/setter metodlarını içerir. "Arac Talebi" ise sınıfın adıdır ve muhtemelen bir araç talebi oluşturma
     işlevselliğine sahip bir sınıf oluşturulması gerektiği anlamına gelir.
     */

    private String alinacakSehir;
    private String alinacakGun;
    private String alinacakSaat;
    private String teslimGunu;
    private String teslimSaati;
    private String marka;
    private String model;
    private String yakitTipi;
    private String vites;
    private double gunlukUcret;

    public AracTalebi(){

    }

    public AracTalebi(String alinacakSehir, String alinacakGun, String alinacakSaat,
                      String teslimGunu, String teslimSaati) {
        this.alinacakSehir=alinacakSehir;
        this.alinacakGun=alinacakGun;
        this.alinacakSaat = alinacakSaat;
        this.teslimGunu= teslimGunu;
        this.teslimSaati=teslimSaati;
    }

    public AracTalebi(String marka, String model, String yakitTipi,String vites,double gunlukUcret){
        this.marka=marka;
        this.model=model;
        this.yakitTipi=yakitTipi;
        this.vites=vites;
        this.gunlukUcret=gunlukUcret;
    }

    public String getAlinacakSehir() {
        return alinacakSehir;
    }

    public void setAlinacakSehir(String alinacakSehir) {
        this.alinacakSehir = alinacakSehir;
    }

    public String getAlinacakGun() {
        return alinacakGun;
    }

    public void setAlinacakGun(String alinacakGun) {
        this.alinacakGun = alinacakGun;
    }

    public String getAlinacakSaat() {
        return alinacakSaat;
    }

    public void setAlinacakSaat(String alinacakSaat) {
        this.alinacakSaat = alinacakSaat;
    }

    public String getTeslimGunu() {
        return teslimGunu;
    }

    public void setTeslimGunu(String teslimGunu) {
        this.teslimGunu = teslimGunu;
    }

    public String getTeslimSaati() {
        return teslimSaati;
    }

    public void setTeslimSaati(String teslimSaati) {
        this.teslimSaati = teslimSaati;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakitTipi() {
        return yakitTipi;
    }

    public void setYakitTipi(String yakitTipi) {
        this.yakitTipi = yakitTipi;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public double getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(double gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }
}
