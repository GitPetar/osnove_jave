package p16_01_2023;

public class Osoba {
    protected String imeIPrezime, jmbg;

    public Osoba(String imeIPrezime, String jmbg) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
    }

    public void stampaj() {
        System.out.println("Ime: " + this.imeIPrezime + " jmbg: " + this.jmbg);

    }


}
