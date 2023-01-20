package p19_01_2023;

public class Lokal extends Objekat {
public Lokal(String adresa, double povrsina, int zona) {
    super(adresa, povrsina, zona);
}

@Override
public void stampaj() {
    System.out.println(adresa);
    System.out.println("Povrsina: " + povrsina + " kvadrata");
    System.out.println("Zona: " + zona);
    System.out.println("Porez: " + porez() + "RSD");
}

@Override
public double porez() {
    return koeficijent() * povrsina * 1.3;
}
}
