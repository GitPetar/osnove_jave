package p12_01_2023;

public class ViberReakcija {
    private String emoji = "like";
    private ViberKorisnik reaktor;

    public ViberReakcija() {
    }

    public ViberReakcija(String emoji, ViberKorisnik reaktor) {
        this.emoji = emoji;
        this.reaktor = reaktor;
        reaktor.setReakcija(this);
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public ViberKorisnik getReaktor() {
        return reaktor;
    }

    public void setReaktor(ViberKorisnik reaktor) {
        this.reaktor = reaktor;
    }
}
