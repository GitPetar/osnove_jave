package p16_01_2023;

//Zadatak
//		Kreirati klasu Osoba koja od atributa ima:
// ime i prezime
// jmbg
//konstuktor sa parametrima
//metodu stampaj koja stampa podatke u formatu
//			ime prezime, jmbg
//
//
//		Kreirati klasu Student koja nasledjuje klasu Osoba,
//			koja od dodatnih atributa ima:
//broj indeksa
//dug za skolarinu
//konstuktor sa parametrima
//metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
//Napisati metod stampajStudenta da stampa sve podatke o studentu
//
//
//Kreirati klasu Profesor koja nasledjuje klasu Osoba,
//			koja od dodatnih atributa ima:
//naziv predmeta koji predaje
//iznos plate
//konstuktor sa parametrima
//metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//Napisati metodu stampajProfu da stampa sve podatke o profesoru
//
//
//			U glavnom programu kreirati 2 studenta i 2 profesora.
public class Zadatak1 {
    public static void main(String[] args) {
        Student student1 = new Student("1234", 1000, "Petar Kotevski", "0102994730034");
        Student student2 = new Student("4321", 999999, "Iksvetok Ratep", "4300374992010");
        Profesor profesor1 = new Profesor("Fizicar", "6425325", "fizika", 70000);
        Profesor profesor2 = new Profesor("Matematicar", "53245325", "matematika", 70000);
        student1.stampaj();
        student2.stampaj();
        profesor1.stampaj();
        profesor2.stampaj();


    }
}
