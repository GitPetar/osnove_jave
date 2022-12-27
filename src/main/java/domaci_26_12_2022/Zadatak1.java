package domaci_26_12_2022;

//Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
public class Zadatak1 {
    public static void main(String[] args) {
        stampajVrednostZa10Vecu(1);
        stampajVrednostZa10Vecu(2);
        stampajVrednostZa10Vecu(3);
    }

    public static void stampajVrednostZa10Vecu(int x) {
        x += 10;
        System.out.println(x);
    }
}
