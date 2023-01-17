package p17_01_2023;

public abstract class Student {
    protected String imeIPrezime, jmbg;

    protected String brojIndeksa;
    protected int dug;
    protected int godinaStudija;

    public abstract int cenaSkolarine();

    public abstract boolean naBudzetu();

    public Student(String imeIPrezime, String brojIndeksa, int godinaStudija) {
        this.imeIPrezime = imeIPrezime;
        this.brojIndeksa = brojIndeksa;
        this.godinaStudija = godinaStudija;
    }

    public void uplatiSkolarinu(int uplata) {
        this.dug -= uplata;
    }

    public void stampaj() {
        System.out.println(this.imeIPrezime + ", broj indeksa: " + this.brojIndeksa + ", " + godinaStudija + ". godina");
        String text;
        if (naBudzetu()) {
            text = "budzet";
        } else {
            text = "samofinansirajuci";
        }
        System.out.println("Finansiranje: " + text);
        System.out.println("Cena skolarine: " + cenaSkolarine());
    }
}
