package XOTabla;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Varijable

        Scanner scanner = new Scanner(System.in);
        XOTabla tabla = new XOTabla();
        tabla.setPolje(new ArrayList<Character>());
        int tempInt;

        //Krecemo lagano sa imenima

        System.out.print("Unesite ime igraca X: ");
        tabla.setImeXIgraca(scanner.next());
        System.out.print("Unesite ime igraca O: ");
        tabla.setImeOIgraca(scanner.next());

        //Tabela se pravi i stampa

        tabla.pokreniIgru();

        //while petlja u kojoj se igra

        while (!tabla.popunjenaTabla() && !tabla.pobednikX() && !tabla.pobednikO()) {
            tabla.stampaj();
            System.out.print("Na potezu je igrac " + tabla.getNaPotezu() + ": ");
            tempInt = scanner.nextInt();
            if (tabla.poljePrazno(tempInt - 1)) {
                tabla.odigrajPotez(tempInt - 1);
                tabla.zameniIgraca();
            } else {
                System.out.println("Potez nije validan!");
            }
        }
        tabla.stampaj();
        if (tabla.pobednikX()) {
            System.out.println("Pobednik je " + tabla.getImeXIgraca());
        }
        if (tabla.pobednikO()) {
            System.out.println("Pobednik je" + tabla.getImeOIgraca());
        }
        if (tabla.popunjenaTabla()) {
            System.out.println("Nereseno");
        }
    }
}
