package XOTabla3; //ver 3.0

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Varijable

        Scanner scanner = new Scanner(System.in); //skener
        XOTabla tabla = new XOTabla(); //ovde se skoro sve odvija
        tabla.setPolje(new ArrayList<String>()); //lista polja
        int tempInt; //temporary integer, koristi se za sve i svasta
        boolean igraTraje = true; //sluzi da bi igraci mogli da ponavljaju igru bez da ponovo pokrecu program

        //Krecemo lagano sa imenima

        System.out.print("Unesite ime igraca X: ");
        tabla.setImeXIgraca(scanner.next());
        System.out.print("Unesite ime igraca O: ");
        tabla.setImeOIgraca(scanner.next());

        //Tabela se pravi

        while (igraTraje) {
            System.out.print("Unesite broj redova: ");
            tempInt = GameLogic.isInteger(scanner.next());
            if (tempInt > 2) {
                tabla.setBrojRedova(tempInt);
            } else {
                continue;
            }
            System.out.println("Unesite velicinu kombinacije: ");
            tempInt = GameLogic.isInteger(scanner.next());
            if (tempInt <= tabla.getBrojRedova()) {
                tabla.winningLine(tempInt);
            } else {
                continue;
            }
            tabla.pokreniIgru(); //cisti prethodnu tablu i popunjava novu praznim poljima

            //while petlja u kojoj se igra

            while (!tabla.popunjenaTabla() && tabla.checkWinner() == '0') {

                tabla.stampaj();
                System.out.print("Na potezu je igrac " + tabla.getNaPotezu() + ": ");
                tempInt = GameLogic.isInteger(scanner.next());
                if (GameLogic.isBetweenOrEqual(1, tempInt, tabla.getPolje().size())) {
                    if (tabla.poljePrazno(tempInt - 1)) { //brojevi 1 do 9 postaju 0 do 8
                        tabla.odigrajPotez(tempInt - 1);
                        tabla.zameniIgraca();
                    } else {
                        System.out.println("Potez nije validan!");
                    }
                } else {
                    System.out.println("Potez nije validan!");
                }
        }


        tabla.stampaj();
        System.out.println();
        if (tabla.checkWinner() == 'X') {
            System.out.println("Pobednik je " + tabla.getImeXIgraca() + "!");
        }
        if (tabla.checkWinner() == 'O') {
            System.out.println("Pobednik je " + tabla.getImeOIgraca() + "!");
        }
        if (tabla.popunjenaTabla()) {
            System.out.println("Nereseno");
        }
        System.out.println();
        System.out.print("Jos jedna igra? y/n: ");
        if (!scanner.next().equals("y")) {
            igraTraje = false;
        }
    }

}
}


