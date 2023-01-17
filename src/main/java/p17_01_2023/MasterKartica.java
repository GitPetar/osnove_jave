package p17_01_2023;

import p16_01_2023.PlatnaKartica;

public class MasterKartica extends PlatnaKartica {

    public MasterKartica(int suma, int mesec, int godina, String broj) {
        super(suma, mesec, godina, broj);
    }

    @Override
    public void izvrsiTransakciju(int broj) {
        double tempDouble = broj + broj * 0.015;
        broj = (int) tempDouble;
        super.izvrsiTransakciju(broj);
    }

    public void naplatiOdrzavanje() {
        this.suma -= 2;
    }

    @Override

    public void stampaj() {
        System.out.print("Master Card: ");
        super.stampaj();
    }
}
