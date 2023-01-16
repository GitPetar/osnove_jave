package p16_01_2023;

public class PlatnaKartica {
    protected int suma, mesec, godina;
    protected String broj;

    public PlatnaKartica(int suma, int mesec, int godina, String broj) {
        this.suma = suma;
        this.mesec = mesec;
        this.godina = godina;
        this.broj = broj;
    }

    public void dodajSredstva(int povecanje) {
        this.suma += povecanje;
    }

    public int getSuma() {
        return suma;
    }

    public int getMesec() {
        return mesec;
    }

    public int getGodina() {
        return godina;
    }

    public String getBroj() {
        return broj;
    }

    public void izvrsiTransakciju(int broj) {
        this.suma -= broj;
    }

    public void stampaj() {
        System.out.println(this.broj + ", " + this.mesec + "/" + this.godina + ", $" + this.suma);
    }




}
