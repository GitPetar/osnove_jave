package XOTabla; //ver 1.1.3 stable

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //Metod koji sluzi da spreci crash usled pogresnog unosa
    //Vraca true ako je moguce pretvoriti string u integer, false ako ne
    public static boolean isInteger(String input) {
        try {
            int tempInt = Integer.parseInt(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isBetweenOrEqual(int min, int inputInt, int max) {
        if (inputInt <= max && min <= inputInt) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        //Varijable

        Scanner scanner = new Scanner(System.in); //skener
        String input; //temporary string za skener, sluzi da se promeni u int ako je to moguce
        XOTabla tabla = new XOTabla(); //ovde se skoro sve odvija
        tabla.setPolje(new ArrayList<Character>()); //lista polja od 0 do 8
        int tempInt; //temporary integer, koristi se za sve i svasta
        boolean igraTraje = true; //sluzi da bi igraci mogli da ponavljaju igru bez da ponovo pokrecu program

        //Krecemo lagano sa imenima

        System.out.print("Unesite ime igraca X: ");
        tabla.setImeXIgraca(scanner.next());
        System.out.print("Unesite ime igraca O: ");
        tabla.setImeOIgraca(scanner.next());

        //Tabela se pravi
        while (igraTraje) {
            tabla.pokreniIgru(); //cisti prethodnu tablu i popunjava novu praznim poljima '_'

            //while petlja u kojoj se igra

            while (!tabla.popunjenaTabla() && !tabla.pobednikX() && !tabla.pobednikO()) {

                tabla.stampaj();
                System.out.print("Na potezu je igrac " + tabla.getNaPotezu() + ": ");
                input = scanner.next();
                if (isInteger(input)) {
                    tempInt = Integer.parseInt(input);
                    if (isBetweenOrEqual(1, tempInt, tabla.getPolje().size())) {
                        if (tabla.poljePrazno(tempInt - 1)) { //brojevi 1 do 9 postaju 0 do 8
                            tabla.odigrajPotez(tempInt - 1);
                            tabla.zameniIgraca();
                        } else {
                            System.out.println("Potez nije validan!");
                        }
                    } else {
                        System.out.println("Potez nije validan!");
                    }
                } else {
                    System.out.println("Potez nije validan!");
                }
            }


        tabla.stampaj();
        System.out.println();
        if (tabla.pobednikX()) {
            System.out.println("Pobednik je " + tabla.getImeXIgraca() + "!");
        }
        if (tabla.pobednikO()) {
            System.out.println("Pobednik je " + tabla.getImeOIgraca() + "!");
        }
        if (tabla.popunjenaTabla()) {
            System.out.println("Nereseno");
        }
        System.out.println();
        System.out.print("Jos jedna igra? y/n: ");
        if (!scanner.next().equals("y")) {
            igraTraje = false;
        }}

    }
}


