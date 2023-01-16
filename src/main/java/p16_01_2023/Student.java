package p16_01_2023;

public class Student extends Osoba {
    private String brojIndeksa;
    private int dug;

    public Student(String brojIndeksa, int dug, String imeIPrezime, String jmbg) {
        super(imeIPrezime, jmbg);
        this.brojIndeksa = brojIndeksa;
        this.dug = dug;
    }

    public void uplatiSkolarinu(int uplata) {
        this.dug -= uplata;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Broj indeksa: " + brojIndeksa + " dug: " + dug);
    }
}
