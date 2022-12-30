package PrviJavaTest;

import java.util.Scanner;
//Napisati program koji petljom iscrtava toplomer. Korisnik sa tastature unosi granice toplomera i iscrtava se slika kao u primeru
//Primer izvrsenja 1:
//Unesite donju granicu toplomera: 35
//Unesite gornju granicu toplomera: 42
//|-42  |
//|-41  |
//|-40  |
//|-39  |
//|-38  |
//|-37  |
//|-36  |
//|-35  |
//\      /
// |    |
//
//Primer izvrsenja 2:
//Unesite donju granicu toplomera: 34
//Unesite gornju granicu toplomera: 40
//|-40  |
//|-39  |
//|-38  |
//|-37  |
//|-36  |
//|-35  |
//|-34  |
//\      /
// |    |
public class Zadatak2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int donjaGranica;
        int gornjaGranica;

        System.out.print("Unesite donju granicu toplomera: ");
        donjaGranica = scanner.nextInt();
        System.out.print("Unesite gornju granicu toplomera: ");
        gornjaGranica = scanner.nextInt();

        for (int i = gornjaGranica; i >= donjaGranica; i--) {
            System.out.println("|" + -i + "|");
        }
        System.out.println("\\  /");
        System.out.println(" ||");
    }
}
