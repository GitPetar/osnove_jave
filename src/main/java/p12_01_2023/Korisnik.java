package p12_01_2023;

public class Korisnik {
    private String imeIPrezime, tipLicence = "basic";

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipLicence() {
        return tipLicence;
    }

    public Korisnik() {
    }

    public Korisnik(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
        this.tipLicence = tipLicence;
    }

    public void pretplatiSe(int uplata) {
        if (uplata == 100) {
            tipLicence = "pro";
        }
        if (uplata == 150) {
            tipLicence = "premium";
        }
    }

    public void ponistiPretplatu() {
        tipLicence = "basic";
    }

    public int maksimalnoTrajanjePoziva(String licenca) {
        if (licenca.equals("basic")) {
            return 40;
        } else if (licenca.equals("pro")) {
            return 240;
        } else if (licenca.equals("premium")) {
            return 1440;
        }
        return 0;
    }

    public void print() {
        System.out.println(imeIPrezime);
    }
}
