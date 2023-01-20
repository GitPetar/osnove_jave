package p19_01_2023;

public class Skakac extends Atleticar {
public Skakac(double rezultat, String imeIPrezime) {
    super(rezultat, imeIPrezime);
}

@Override
public boolean jeBolji(Atleticar drugi) {
    return this.rezultat > drugi.rezultat;
}
}
