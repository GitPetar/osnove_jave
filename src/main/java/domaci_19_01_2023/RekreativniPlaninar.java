package domaci_19_01_2023;

public class RekreativniPlaninar extends Planinar {
private int tezinaOpreme, maxUsponBezOpreme;
private String nazivOkruga;

public RekreativniPlaninar(String jmbg, String imeIPrezime, int tezinaOpreme, int maxUsponBezOpreme,
                           String nazivOkruga) {
    super(jmbg, imeIPrezime);
    this.tezinaOpreme = tezinaOpreme;
    this.maxUsponBezOpreme = maxUsponBezOpreme;
    this.nazivOkruga = nazivOkruga;
}

public int getTezinaOpreme() {
    return tezinaOpreme;
}

public int getMaxUsponBezOpreme() {
    return maxUsponBezOpreme;
}

public String getNazivOkruga() {
    return nazivOkruga;
}

@Override
public void stampaj() {
    System.out.println("Rekreativac, id: " + this.jmbg + ", ime: " + this.imeIPrezime + ", Okrug: " + this.nazivOkruga);
}

@Override
public double clanarina() {
    return 1000;
}

@Override
public boolean uspesanUspon(Planina planina) {
    int moguciUspon = this.maxUsponBezOpreme - (this.tezinaOpreme * 50);
    return planina.getVisina() <= moguciUspon;
}

}
