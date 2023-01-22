package domaci_19_01_2023;

public class Alpinista extends Planinar {
private int poeni;

public Alpinista(String jmbg, String imeIPrezime) {
    super(jmbg, imeIPrezime);
}

public int getPoeni() {
    return poeni;
}

public void setPoeni(int poeni) {
    this.poeni = poeni;
}

@Override
public void stampaj() {
    System.out.println("Alpinista, id: " + this.jmbg + ", ime: " + this.imeIPrezime + ", Broj poena: " + this.poeni);
}

@Override
public double clanarina() {
    return Math.max(1500 - this.poeni * 50, 0);
}

@Override
public boolean uspesanUspon(Planina planina) {
    return planina.getVisina() <= 4000;
}
}
