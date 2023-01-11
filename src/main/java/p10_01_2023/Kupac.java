package p10_01_2023;

public class Kupac {
    private String imeIPrezime;
    private Kartica kartica = new Kartica();

    public Kupac() {
    }

    public Kupac(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public Kartica getKartica() {
        return kartica;
    }

    public void setKartica(Kartica kartica) {
        this.kartica = kartica;
    }

    public void print() {
        System.out.println(imeIPrezime + " - " + kartica.getBrojKartice());
    }
}
