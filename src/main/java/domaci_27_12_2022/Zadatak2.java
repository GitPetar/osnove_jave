package domaci_27_12_2022;

//Kreirati klasu SmartAirConditioning koja ima:
//atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//atribut za izabranu temperaturu
//atribut za mod (hladi/greje) - string
//metodu za stampu (proizvoljno)
//metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena. Metoda kao parametar prima temperaturu koja je napolju.
//
//
//U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode
public class Zadatak2 {
    public static void main(String[] args) {
        SmartAirConditioning klima1 = new SmartAirConditioning("Samsung", 40.0, "Greje");
        SmartAirConditioning klima2 = new SmartAirConditioning("Galanz", 20, "Hladi");

        klima1.stampaj();
        if (klima1.uporediTemperaturu(35)) {
            System.out.println("Temperatura je veca napolju.");
        } else {
            System.out.println("Tempreatura je veca unutra.");
        }
        klima2.stampaj();
        if (klima2.uporediTemperaturu(35)) {
            System.out.println("Temperatura je veca napolju.");
        } else {
            System.out.println("Tempreatura je veca unutra.");


        }

    }
}

