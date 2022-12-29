package domaci_27_12_2022;

//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
//
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode
public class Zadatak1 {
    public static void main(String[] args) {
        Proizvod teg = new Proizvod("teg", 100, 1000);
        teg.stampaj();
        System.out.println(", " + teg.konvertuj("Kg") + " kilograma");

        Proizvod pero = new Proizvod("pero", 1, 1);
        pero.stampaj();
        System.out.println(", " + pero.konvertuj("t") + " tona");

    }
}
