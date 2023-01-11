package domaci_10_01_2023;

public class Proizvod {
    private String sifra, naziv;
    private double cenaPoKilogramu;

//    public Proizvod() {
//    }

    public Proizvod(String sifra, String naziv, double cenaPoKilogramu) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cenaPoKilogramu = cenaPoKilogramu;
    }

    public String getSifra() {
        return sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCenaPoKilogramu(double cenaPoKilogramu) {
        this.cenaPoKilogramu = cenaPoKilogramu;
    }

    public double getCenaKg() {
        return cenaPoKilogramu;
    }

    public double getCenaLb() {
        return cenaPoKilogramu / 2.2046;
    }

    public void print() {
        System.out.println(sifra + " - " + naziv);
    }
}
