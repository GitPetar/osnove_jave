package domaci_29_12_2022;

public class SmartAirConditioning {
    String marka;
    int potrosnjaDokHladi; //kW/h
    int potrosnjaDokGreje;
    int izabranaTemperatura; //min 16 max 35
    String mod;

    public SmartAirConditioning(String marka, int potrosnjaDokHladi, int potrosnjaDokGreje, int izabranaTemperatura, String mod) {
        this.marka = marka;
        this.potrosnjaDokHladi = potrosnjaDokHladi;
        this.potrosnjaDokGreje = potrosnjaDokGreje;
        this.izabranaTemperatura = izabranaTemperatura;
        this.mod = mod;
    }

    public void print() {
        System.out.println(marka + ", " + mod + ", " + izabranaTemperatura);
    }

    public int mesecnaPotrosnja() {
        if (mod.equals("greje")) {
            return 30 * 15 * potrosnjaDokGreje;
        }
        if (mod.equals("hladi")) {
            return 30 * 15 * potrosnjaDokHladi;
        } else {
            return 0;
        }
    }

    public int mesecnaCena() {
        if (mesecnaPotrosnja() <= 350) {
            return mesecnaPotrosnja() * 6;
        } else return mesecnaPotrosnja() * 9;
    }
}
