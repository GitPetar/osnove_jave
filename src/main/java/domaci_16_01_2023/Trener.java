package domaci_16_01_2023;

public class Trener extends Osoba {
    private int godineIskustva;
    private String tip;

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println(this.imeIPrezime + " je " + this.tip + " trener vec " + this.godineIskustva + " godina");
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
////U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
}
