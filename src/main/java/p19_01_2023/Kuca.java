package p19_01_2023;

public class Kuca extends Objekat {
private int brojStanovnika;

public Kuca(String adresa, double povrsina, int zona, int brojStanovnika) {
    super(adresa, povrsina, zona);
    this.brojStanovnika = brojStanovnika;
}

public Kuca() {
}

@Override
public void stampaj() {
    System.out.println(adresa);
    System.out.println("Povrsina: " + povrsina + " kvadrata");
    System.out.println("Zona: " + zona);
    System.out.println("Broj stanovnika: " + brojStanovnika);
    System.out.println("Porez: " + porez() + "RSD");
}

@Override
public double porez() {
    return povrsina * koeficijent();
}
}
