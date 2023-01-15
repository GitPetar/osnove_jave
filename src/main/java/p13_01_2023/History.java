package p13_01_2023;

import java.util.ArrayList;

public class History {
    private ArrayList<HistoryPage> poseceneStranice;

    public History() {
        this.poseceneStranice = new ArrayList<>();
    }

    public void otvoriStranicu(HistoryPage stranica) {
        this.poseceneStranice.add(stranica);
    }

    public void obrisi(String link) {
        for (int i = 0; i < this.poseceneStranice.size(); i++) {
            if (this.poseceneStranice.get(i).getLink().equals(link)) {
                this.poseceneStranice.remove(i);
            }
        }
    }

    public void obrisiKolace(String link) {
        for (int i = 0; i < this.poseceneStranice.size(); i++) {
            if (this.poseceneStranice.get(i).getLink().equals(link)) {
                this.poseceneStranice.get(i).obrisiKolacice();
            }
        }
    }

    public void obrisiIstoriju() {
        this.poseceneStranice.clear();
    }

    public void sacivajKredencijal(String naziv, String username, String password) {
        for (int i = 0; i < this.poseceneStranice.size(); i++) {
            if (this.poseceneStranice.get(i).getLink().equals(naziv)) {
                this.poseceneStranice.get(i).sacuvajKredencijale(username, password);
            }
        }
    }

    public void pogledajIstoriju() {
        for (HistoryPage a : this.poseceneStranice
        ) {
            a.stampaj();

        }
    }

    public void obrisiSveKolace() {
        for (HistoryPage a : this.poseceneStranice
        ) {
            a.obrisiKolacice();

        }
    }

    public void obrisiSveKolaciceZaZadnjihSatVremena(int sat, int minut) {
        int vreme1 = sat * 60 + minut;
        int vreme2;
        for (HistoryPage a : poseceneStranice
        ) {
            vreme2 = a.getSat() * 60 + a.getMinut();
            if (vreme1-60<=vreme2&&vreme2<=vreme1) {
                a.obrisiKolacice();
            }
        }
    }
}
