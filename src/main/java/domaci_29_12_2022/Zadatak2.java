package domaci_29_12_2022;

//Kreirati klasu FacebookPost koja ima:
//   Od atributa:
//ime i prezime korisnika koji je objavio post
//ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//tekst objave
//broj lajkova
//broj deljenja
//gettere za sve atribute
//settere za sve atribute osim broja lajkova i broja deljenja
//  Od metoda:
//like(), koja povecava broj lajkova za 1.
//dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//share(), koja povecava broj deljenja za 1
//print(), koja stampa objavu u formatu:
//(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//(tekst objave)
//Likes (broj lajkova) | Shares (broj deljenja)
//
//U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//Primer stampanja:
//Milan Jovanovic >>> Pera Peric
//Ovo je tekst objave
//Likes 3 | Shares 1
public class Zadatak2 {
    public static void main(String[] args) {
        FacebookPost post1 = new FacebookPost();
        post1.setImeIPrezimeObjavitelja("Petar Kotevski");
        post1.setImeIPrezimeObjavoprimaoca("Dimitrije Mandić");
        post1.setTekstObjave("Brate moj lepi jel da da kida IT Bootcamp?");

        FacebookPost post2 = new FacebookPost();
        post2.setImeIPrezimeObjavitelja("Dimitrije Mandić");
        post2.setImeIPrezimeObjavoprimaoca("Petar Kotevski");
        post2.setTekstObjave("Kralju moj tako je a i tebi ovo super ide baš!");

        for (int i = 0; i < 1000000; i++) {
            post1.like();
            if (i % 10 == 0) {
                post1.share();
            }
        }
        post1.print();
        System.out.println();
        post2.print();
    }
}
