package p12_01_2023;

public class ViberKorisnik {
    private String imeIPrezime, brojTelefona;
    private boolean trenutnoAkativan;
    private ViberReakcija reakcija;

    public ViberKorisnik(String imeIPrezime, String brojTelefona, boolean trenutnoKativan, ViberReakcija reakcija) {
        this.imeIPrezime = imeIPrezime;
        this.brojTelefona = brojTelefona;
        this.trenutnoAkativan = trenutnoKativan;
        this.reakcija = reakcija;
        reakcija.setReaktor(this);
    }

    public ViberKorisnik() {
    }

    public void setTrenutnoAkativan(boolean trenutnoAkativan) {
        this.trenutnoAkativan = trenutnoAkativan;
    }

    public ViberReakcija getReakcija() {
        return reakcija;
    }

    public void setReakcija(ViberReakcija reakcija) {
        this.reakcija = reakcija;
        reakcija.setReaktor(this);
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public boolean isTrenutnoAkativan() {
        return trenutnoAkativan;
    }

    public String isTrenutnoAktivanText() {
        if (trenutnoAkativan == true) {
            return "Active Now";
        } else {
            return "Not Active";
        }
    }

    public void setTrenutnoKativan(boolean trenutnoKativan) {
        this.trenutnoAkativan = trenutnoKativan;
    }

}
