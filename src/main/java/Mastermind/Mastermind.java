package Mastermind;

import java.util.*;


public class Mastermind {
    public static void main(String[] args) {

        //Sve varijable

        Random random = new Random();
        Scanner s = new Scanner(System.in);
        int brojPokusaja;
        int brojSimbola;
        int velicinaKombinacije;
        int pogodjeno;
        int naMestu;
        ArrayList<Character> kombinacija = new ArrayList<Character>();
        ArrayList<Character> placeholder = new ArrayList<>();
        ArrayList<Character> simboli = new ArrayList<Character>(Arrays.asList('~', '!', '@', '#', '$', '%', '^', '&', '*', '/'));
        String input;

        //Definisanje tezine

        System.out.println("Dobrodošli u Mastermind!");
        System.out.println();
        System.out.println("Ova verzija igrice vam omogucava da podesite tezinu tako sto sami birate parametre");
        System.out.println();
        while (true) {
            System.out.print("Izaberite broj pokusaja (preporuceno 12): ");
            brojPokusaja = s.nextInt();
            System.out.print("Koliko razlicitih simbola zelite? (preporuceno 6, maksimalno 10): ");
            brojSimbola = s.nextInt();
            System.out.print("Unesite brojcanu velicinu kombinacije (preporuceno 4): ");
            velicinaKombinacije = s.nextInt();

            //Pravljenje kombinacije

            kombinacija.add(simboli.get(random.nextInt(brojSimbola)));
            for (int i = 1; i < velicinaKombinacije; i++) {
                kombinacija.add(simboli.get(random.nextInt(brojSimbola)));

                //Igracu se prikazuju moguci simboli
            }
            System.out.print("Moguci simboli su: ~");
            for (int i = 1; i < brojSimbola; i++) {
                System.out.print(", " + simboli.get(i));
            }
            System.out.println();
            //  System.out.println(kombinacija);

            //for petlja u kojoj se igrica odvija

            for (int i = 0; i < brojPokusaja; i++) {
                System.out.print("Pokusaj " + (i + 1) + ": ");
                input = s.next();
                placeholder = new ArrayList<>(kombinacija);
                pogodjeno = 0;
                naMestu = 0;
                for (int j = 0; j < velicinaKombinacije; j++) {
                    if (input.charAt(j) == placeholder.get(j)) {
                        naMestu++;
                    }
                    if (input.contains(placeholder.get(j).toString())) {
                        pogodjeno++;
                    }
                    placeholder.set(j, '0');

                }
                System.out.println(pogodjeno + " pogodjenih, " + naMestu + " na mestu.");
                if (naMestu == velicinaKombinacije) {
                    System.out.println("Bravo!");
                    break;
                }
                System.out.println("Vise srece sledeci put!");

            }


        }
    }
}
