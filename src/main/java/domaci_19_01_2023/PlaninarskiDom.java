package domaci_19_01_2023;

import java.util.ArrayList;

public class PlaninarskiDom {
private String nazivDoma;
private int godinaOsnivanja;
private ArrayList<Planinar> clanovi = new ArrayList<>();

public PlaninarskiDom(String nazivDoma, int godinaOsnivanja, ArrayList<Planinar> clanovi) {
    this.nazivDoma = nazivDoma;
    this.godinaOsnivanja = godinaOsnivanja;
    this.clanovi = clanovi;
}

public ArrayList<Planinar> getClanovi() {
    return clanovi;
}

public PlaninarskiDom() {
}

public void uclani(Planinar planinar) {
    this.clanovi.add(planinar);
}

public int kolikoCeSeUspesnoPopeti(Planina planina) {
    int counter = 0;
    for (Planinar planinar : this.clanovi) {
        if (planinar.uspesanUspon(planina)) {counter++;}
    }
    return counter;
}

public void izbaci(String jmbg) {
    this.clanovi.removeIf(planinar -> planinar.getJmbg().equals(jmbg));
}

public void stampaj() {
    for (Planinar planinar : this.clanovi) {
        planinar.stampaj();
    }
}

public int mesecniPrihod() {
    int mesecniPrihod = 0;
    for (Planinar planinar : this.clanovi) {
        mesecniPrihod += planinar.clanarina();
    }
    return mesecniPrihod;
}
}
