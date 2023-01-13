package p12_01_2023;

public class FizickoLice {
    private String imeIPrezime, brojLicneKarte, jmbg;
    private boolean ranijeKupovao;

    public FizickoLice() {
    }

    public FizickoLice(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public FizickoLice(String imeIPrezime, String brojLicneKarte, String jmbg, boolean ranijeKupovao) {
        this.imeIPrezime = imeIPrezime;
        this.brojLicneKarte = brojLicneKarte;
        this.jmbg = jmbg;
        this.ranijeKupovao = ranijeKupovao;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public void setBrojLicneKarte(String brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean isRanijeKupovao() {
        return ranijeKupovao;
    }

    public void setRanijeKupovao(boolean ranijeKupovao) {
        this.ranijeKupovao = ranijeKupovao;
    }

    public void stampaj() {
        System.out.println(imeIPrezime + " " + brojLicneKarte);
    }
}
