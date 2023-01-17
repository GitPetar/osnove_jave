package p17_01_2023;

public class Pravougaonik extends Figura {
    private double a, b;

    public Pravougaonik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double povrsina() {
        return this.a * this.b;
    }

    @Override
    public double obim() {
        return this.a * 2 + this.b * 2;
    }
}
