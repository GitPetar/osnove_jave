package domaci_12_01_2023;

import java.util.ArrayList;
import java.util.Random;

//Zadatak
//Kreirati klasu ZeleniKarton koja ima:
//ime i prezime studenta
//broj indeksa
//naziv predmeta
//ime i prezime profesora
//ocenu - od 5 do 10
//gettere i settere
//konstruktore
//metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//	U glavnoj klasi:
//kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
public class Zadatak1 {
    public static void main(String[] args) {

        ArrayList<ZeleniKarton> kartoni = new ArrayList<>();
        Random random = new Random();
        int tempInt;
        int counter = 0;

        //pravi bazu podataka
        for (int i = 0; i < 10; i++) {
            kartoni.add(new ZeleniKarton());
            kartoni.get(i).setImeIPrezime("Student " + (i + 1));
            kartoni.get(i).setBrojIndeksa("" + random.nextInt(999999));
            kartoni.get(i).setOcena(random.nextInt(6) + 5);
            tempInt = random.nextInt(3) + 1;
            if ((int) tempInt == 1) {
                kartoni.get(i).setNazivPredmeta("Biologija");
                kartoni.get(i).setImeIPrezimeProfesora("Biolog");
            } else if ((int) tempInt == 2) {
                kartoni.get(i).setNazivPredmeta("Nuklearna Fizika");
                kartoni.get(i).setImeIPrezimeProfesora("Fizicar");
            } else if ((int) tempInt == 3) {
                kartoni.get(i).setNazivPredmeta("Nuklearna Biologija");
                kartoni.get(i).setImeIPrezimeProfesora("Profesor X");
            }
        }

        //ostatak je stampanje

        System.out.println("Podaci svih ispita: ");
        for (ZeleniKarton karton : kartoni) {
            karton.stampaj();
            System.out.println();
        }
        tempInt = 0;
        for (ZeleniKarton karton : kartoni) {
            tempInt += karton.getOcena();
        }
        tempInt /= kartoni.size();
        System.out.println("Prosecna Ocena je: " + tempInt);

        tempInt = 0;
        for (ZeleniKarton karton : kartoni) {
            if (karton.ispitPolizen()) {
                tempInt += karton.getOcena();
                counter++;
            }
        }
        tempInt /= counter;
        System.out.println("Prosecna Ocena polozenih ispita je: " + tempInt);
    }
}
