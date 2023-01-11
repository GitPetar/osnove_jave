package p10_01_2023;

public class Radnik {

    private String jmbg, imeIPrezime;
    private int brojDece, stepenStrucneSpreme, godineRadnogStaza;

    public Radnik(String jmbg) {
        this.jmbg = jmbg;
    }

    public Radnik(String jmbg, String imeIPrezime, int brojDece, int stepenStrucneSpreme, int godineRadnogStaza) {
        this.jmbg = jmbg;
        this.imeIPrezime = imeIPrezime;
        this.brojDece = brojDece;
        this.stepenStrucneSpreme = stepenStrucneSpreme;
        this.godineRadnogStaza = godineRadnogStaza;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojDece() {
        return brojDece;
    }

    public void setBrojDece(int brojDece) {
        this.brojDece = brojDece;
    }

    public int getStepenStrucneSpreme() {
        return stepenStrucneSpreme;
    }

    public void setStepenStrucneSpreme(int stepenStrucneSpreme) {
        this.stepenStrucneSpreme = stepenStrucneSpreme;
    }

    public int getGodineRadnogStaza() {
        return godineRadnogStaza;
    }

    public void setGodineRadnogStaza(int godineRadnogStaza) {
        this.godineRadnogStaza = godineRadnogStaza;
    }

    public double minuliRad() {
        if (godineRadnogStaza <= 10) {
            return 0.05;
        }
        if (10 < godineRadnogStaza && godineRadnogStaza <= 20) {
            return 0.075;
        }
        if (20 < godineRadnogStaza) {
            return 0.1;
        }
        return 0;
    }

    public int koeficijentSlozenosti() {
        return stepenStrucneSpreme * brojDece;
    }

    public int racunajPlatu() {
        return (int)(25000 + koeficijentSlozenosti() + minuliRad()) * 10000;
    }

    public boolean kreditnoSposoban() {
        if (racunajPlatu() > 50000) {
            return true;
        }
        return false;
    }
}
