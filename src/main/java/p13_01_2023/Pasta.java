package p13_01_2023;

import java.util.ArrayList;

public class Pasta {
    private ArrayList<Sastojak> sastojci;

    public Pasta() {
        this.sastojci = new ArrayList<>();
    }

    public ArrayList<Sastojak> getSastojci() {
        return sastojci;
    }

    public void setSastojci(ArrayList<Sastojak> sastojci) {
        this.sastojci = sastojci;
    }

    public void dodajSastojak(Sastojak sastojak) {
        this.sastojci.add(sastojak);
    }

    public int racunajCenu() {
        int cena = 0;
        for (Sastojak sastojak : sastojci) {
            cena += sastojak.getCena();
        }
        return cena;
    }

    public void stampaj() {
        System.out.println("Pasta je sa sastojcima: ");
        for (Sastojak sastojak : this.sastojci) {
            sastojak.stampaj();
        }
    }

    public void brisiSastojak(String naziv) {
        for (int i = 0; i < this.sastojci.size(); i++) {
            if (this.sastojci.get(i).getNaziv().equals(naziv)) {
                this.sastojci.remove(i);
            }

        }
    }
}
