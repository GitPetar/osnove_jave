package p19_01_2023;

import java.util.ArrayList;

public class Disciplina {
private String ime, tip;
private ArrayList<Atleticar> atleticari = new ArrayList<>();

public Disciplina() {
}

public Disciplina(String ime, String tip) {
    this.ime = ime;
    this.tip = tip;
}

public String getIme() {
    return ime;
}

public void setIme(String ime) {
    this.ime = ime;
}

public String getTip() {
    return tip;
}

public void setTip(String tip) {
    this.tip = tip;
}

public ArrayList<Atleticar> getAtleticari() {
    return atleticari;
}

public void setAtleticari(ArrayList<Atleticar> atleticari) {
    this.atleticari = atleticari;
}

public void dodajAtleticara(Atleticar atleticar) {
    this.atleticari.add(atleticar);
}

public void diskvalifikuj(String imeIPrezime) {
    this.atleticari.removeIf(atleticar -> atleticar.getImeIPrezime().equals(imeIPrezime));
}

public void stampajPobednika() {
    System.out.println("Pobednik je: ");
    najbolji().stampaj();
}

public Atleticar najbolji() {
    Atleticar atleticar = this.atleticari.get(0);
    for (Atleticar a : atleticari) {
        if (a.jeBolji(atleticar)) {atleticar = a;}
    }
    return atleticar;
}
}
