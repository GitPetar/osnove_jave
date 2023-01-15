package p13_01_2023;

public class Reakcija {
    private String tipReakcije, imeIPrezime;

    public String getTipReakcije() {
        return tipReakcije;
    }

    public void setTipReakcije(String tipReakcije) {
        this.tipReakcije = tipReakcije;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public Reakcija() {
    }

    public Reakcija(String tipReakcije, String imeIPrezime) {
        this.tipReakcije = tipReakcije;
        this.imeIPrezime = imeIPrezime;
    }


}
