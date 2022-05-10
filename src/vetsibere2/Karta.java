package vetsibere2;

public class Karta {
    public int hodnota;
    public String nazev;
    public String barva;
    
    public Karta(int hodnota, String nazev,String barva){
        this.hodnota = hodnota;
        this.nazev = nazev;
        this.barva = barva;
    }

    public String getBarva() {
        return barva;
    }

    public void setBarva(String barva) {
        this.barva = barva;
    }

    public int getHodnota() {
        return hodnota;
    }

    public void setHodnota(int hodnota) {
        this.hodnota = hodnota;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }
    
    
    
}
