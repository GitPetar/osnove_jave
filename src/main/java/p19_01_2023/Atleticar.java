package p19_01_2023;

public abstract class Atleticar {
protected double rezultat;
private String imeIPrezime;

public Atleticar(double rezultat, String imeIPrezime) {
    this.rezultat = rezultat;
    this.imeIPrezime = imeIPrezime;
}

public abstract boolean jeBolji(Atleticar drugi);

public String getImeIPrezime() {
    return imeIPrezime;
}

public void stampaj() {
    System.out.println(imeIPrezime + " rezultat: " + rezultat);
}
}
