package domaci_13_01_2023;

import java.util.ArrayList;

public class Listic {
   private ArrayList<Kombinacija> kombinacije;

    public Listic() {
        kombinacije = new ArrayList<>();
    }

    public void dodajKombinaciju(Kombinacija k) {
        this.kombinacije.add(k);
    }

    public boolean dobitna(Kombinacija dobitnaKombinacija) {
        for (Kombinacija k :
                this.kombinacije) {
            if (k.daLiJeIstaKombinacija(dobitnaKombinacija)) {
                return true;
            }
        }
        return false;
    }

    public void stampaj() {
        for (Kombinacija k : kombinacije
        ) {
            k.stampaj();
            System.out.println();

        }
    }
}
