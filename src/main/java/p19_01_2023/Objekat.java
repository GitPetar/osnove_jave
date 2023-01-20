package p19_01_2023;

public abstract class Objekat {
protected String adresa;
protected double povrsina;
protected int zona;

public Objekat() {
}

public Objekat(String adresa, double povrsina, int zona) {
    this.adresa = adresa;
    this.povrsina = povrsina;
    this.zona = zona;
}

public abstract void stampaj();

public double koeficijent() {
    switch (this.zona) {
        case 1:
            return 1.4;
            
        case 2:
            return 1.1;
            
        case 3:
            return 1.05;
            
        default:
            return 0;
    }
}

public abstract double porez();
////abstraktnu metodu stampaj
}
