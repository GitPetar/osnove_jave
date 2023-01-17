package p17_01_2023;

public class VisaKartica extends PlatnaKartica {
    private String ovlascenoLice;

    public VisaKartica(int suma, int mesec, int godina, String broj, String ovlascenoLice) {
        super(suma, mesec, godina, broj);
        this.ovlascenoLice = ovlascenoLice;
    }

    @Override
    public void izvrsiTransakciju(int broj) {
        double tempDouble = broj + Math.max(broj * 0.018, 4);
        broj = (int) tempDouble;
        this.suma -= broj;
    }

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    @Override
    public void stampaj() {
        System.out.print("Visa Card: ");
        System.out.println(this.broj + ", " + this.mesec + "/" + this.godina + ", $" + this.suma);
    }
}
