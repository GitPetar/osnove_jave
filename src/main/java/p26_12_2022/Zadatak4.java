package p26_12_2022;

//Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja. Brojevi su ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima.
public class Zadatak4 {
    public static void main(String[] args) {
        metoda(3, 5);
        metoda(4, 1);
        metoda(75, 25);


    }

    public static void metoda(int x, int y) {
        System.out.println("Zbir: " + (x + y));
        System.out.println("Razlika: " + (x - y));
        System.out.println("Proizvod: " + (x * y));
        System.out.println("Kolicnik: " + (x / y));

    }
}
