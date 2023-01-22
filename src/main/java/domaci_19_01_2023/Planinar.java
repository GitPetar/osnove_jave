package domaci_19_01_2023;

public abstract class Planinar {
protected String jmbg, imeIPrezime;

public Planinar(String jmbg, String imeIPrezime) {
    this.jmbg = jmbg;
    this.imeIPrezime = imeIPrezime;
}

public String getJmbg() {
    return jmbg;
}

public String getImeIPrezime() {
    return imeIPrezime;
}
public abstract void stampaj();
public abstract double clanarina();

public abstract boolean uspesanUspon(Planina planina);

}
