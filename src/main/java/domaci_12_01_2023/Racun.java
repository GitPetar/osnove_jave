package domaci_12_01_2023;

public class Racun {
    private String broj, imeIPrezime;
    private int stanje;

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getTrenutnoStanje() {
        return stanje;
    }

    public Racun(String broj, String imeIPrezime) {
        this.broj = broj;
        this.imeIPrezime = imeIPrezime;
    }

    public void promeniStanjeZa(int promena) {
        this.stanje += promena;

    }

    public void stampaj() {
        System.out.println(this.imeIPrezime + " " + broj);
        System.out.println("Stranje na tacunu je: " + this.stanje + "rsd");
    }
}
