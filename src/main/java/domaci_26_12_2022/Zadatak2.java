package domaci_26_12_2022;

//Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost. Metoda od parametara prima ime i prezime (2 parametra) i vraca jedan string tako sto spoji ime i prezime. METODA NISTA NE STAMPA.
//Primer poziva: Ako se metoda pozvoe za ime=”Milan” i prezime=”Jovanovic”, metoda vraca “Milan Jovanovic”
public class Zadatak2 {
    public static void main(String[] args) {
        String ime = "Petar";
        String prezime = "Kotevski";

        System.out.println(polimerizacija(ime, prezime));
    }

    public static String polimerizacija(String ime, String prezime) {
        return ime +" "+ prezime;
    }
}
