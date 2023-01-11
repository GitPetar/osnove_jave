package domaci_10_01_2023;

public class Zadatak3 {
    public static void main(String[] args) {

        Proizvod proizvod = new Proizvod("asdfg", "Bomba", 900);
        Vaga vaga = new Vaga();
        vaga.setProizvod(proizvod);
        vaga.setMernaJedinica("lb");
        vaga.stampajRacun(100);
        vaga.setMernaJedinica("kg");
        vaga.stampajRacun(100);
    }
}
