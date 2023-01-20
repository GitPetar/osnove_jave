package p19_01_2023;

public class Zgrada extends Objekat {
private int brojStanova;

public Zgrada(String adresa, double povrsina, int zona, int brojStanova) {
    super(adresa, povrsina, zona);
    this.brojStanova = brojStanova;
}

@Override
public void stampaj() {
    System.out.println(adresa);
    System.out.println("Povrsina: " + povrsina + " kvadrata");
    System.out.println("Zona: " + zona);
    System.out.println("Broj stanova: " + brojStanova);
    System.out.println("Porez: " + porez() + "RSD");
}

@Override
public double porez() {
    return koeficijent() * povrsina * brojStanova;
}
}
