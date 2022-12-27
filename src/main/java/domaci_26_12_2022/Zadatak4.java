package domaci_26_12_2022;

//Zadatak
//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.
public class Zadatak4 {
    public static void main(String[] args) {
        napredNazadNemamGde("0102994730034", "Petar", "Kotevski", 1994, true);
    }

    public static void napredNazadNemamGde(String jmbg, String ime, String prezime, int godRodjenja, boolean aktivan) {
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God. rodjenja: " + godRodjenja);
        System.out.println("Aktivan: " + aktivan);

    }
}
