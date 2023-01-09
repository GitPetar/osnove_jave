package XOTabla4; //ver 4.0.0

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //skener
        XOTabla tabla = new XOTabla(); //ovde se skoro sve odvija
        boolean igraTraje = true; //sluzi da bi igraci mogli da ponavljaju igru bez da ponovo pokrecu program
        boolean protivKompjutera = false;
        int tempInt = 0;

        //Krecemo lagano sa imenima

        System.out.print("Unesite ime igraca X: ");
        tabla.setImeXIgraca(scanner.next());
        System.out.print("Unesite ime igraca O: ");
        tabla.setImeOIgraca(scanner.next());

        //AI

        System.out.println("Da li želite da se odmerite protiv kompjutera? y/n: ");
        if (scanner.next().equals("y")) {
            protivKompjutera = true;
        }
        //Tabela se pravi

        while (igraTraje) {
            System.out.print("Unesite broj redova: ");
            tabla.setBrojRedova(Math.max(GameLogic.isInteger(scanner.next()), 3));
            System.out.print("Unesite velicinu kombinacije: ");
            tabla.winningLine(Math.min(Math.max(GameLogic.isInteger(scanner.next()), 3), tabla.getBrojRedova()));
            tabla.pokreniIgru(); //cisti prethodnu tablu i popunjava novu praznim poljima

            //while petlja u kojoj se igra

            while (!tabla.popunjenaTabla() && tabla.checkWinner() == '0') {
                tabla.stampaj();
                if (tabla.getNaPotezu() == 'O' && protivKompjutera) {
                    tabla.odigrajPotez(tabla.aiLogika()+1);
                } else {
                    System.out.print("Na potezu je igrac " + tabla.getNaPotezu() + ": ");
                    tabla.odigrajPotez(GameLogic.isInteger(scanner.next()));
                }
            }

            tabla.stampaj();
            System.out.println();
            tabla.proglasiPobednika();
            if (!scanner.next().equals("y")) {
                igraTraje = false;
            }
        }
    }

}


