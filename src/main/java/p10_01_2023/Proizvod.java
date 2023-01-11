package p10_01_2023;

public class Proizvod {
    private String naziv;
    private int cenaIzrade;
    private Kupac kupac = new Kupac();

    public Proizvod() {

    }

    public Proizvod(String naziv, int cenaIzrade) {
        this.naziv = naziv;
        this.cenaIzrade = cenaIzrade;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(int cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public double cenaProizvoda() {
        return cenaIzrade * 1.9 * (100 - kupac.getKartica().getPopust()) / 100;
    }

    public void print() {
        System.out.println(naziv + " - " + cenaProizvoda());
        System.out.println(kupac.getImeIPrezime() + " - " + kupac.getKartica().getBrojKartice());
    }
}
