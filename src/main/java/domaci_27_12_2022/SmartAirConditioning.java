package domaci_27_12_2022;

public class SmartAirConditioning {
    String marka;
    double temperatura;
    String haldiGreje;

    public SmartAirConditioning(String marka, double temperatura, String haldiGreje) {
        this.marka = marka;
        this.temperatura = temperatura;
        this.haldiGreje = haldiGreje;
    }

    public void stampaj() {
        System.out.println(marka + ", " + temperatura + "°C, " + haldiGreje);
    }

    public boolean uporediTemperaturu(double temperaturaNapolju) {
        if (temperaturaNapolju > temperatura) {
            return true;
        } else {
            return false;
        }
    }
}
