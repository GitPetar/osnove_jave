package p27_12_2022;

//me i prezime vozaca
//marku automobila
//broj vrata
//potrosnju na 100km (npr: 10)
//trenutnu brzinu kojom se auto krece
//metodu za stampu koja stampa podatke u formatu:
//[Vozac]
//	[Marka] - [br vrata]-ro vrata
//	Sa potrosnjom od [potrosnja] l na 100km
//	[Trenutna brzina auta] km/h je trenutna brzina.
public class Auto {
    String imeiPrezime;
    String marka;
    int brojVrata;
    int potrosnja;
    int brzina;
    int godinaProizvodnje;
    int mesecRegistracije;
    int kubikaza;

    public Auto(String imeiPrezime, String marka, int brojVrata, int potrosnja, int brzina, int godinaProizvodnje, int mesecRegistracije, int kubikaza) {
        this.imeiPrezime = imeiPrezime;
        this.marka = marka;
        this.brojVrata = brojVrata;
        this.potrosnja = potrosnja;
        this.brzina = brzina;
        this.godinaProizvodnje = godinaProizvodnje;
        this.mesecRegistracije = mesecRegistracije;
        this.kubikaza = kubikaza;
    }

    public void print() {
        System.out.println(imeiPrezime);
        System.out.println(marka + " " + brojVrata + " vrata");
        System.out.println("Sa potrosnjom od " + potrosnja + "l na 100km");
        System.out.println(brzina + " km/h je trenutna brzina");
    }

    public boolean prekoracenje(int dozvoljenaBrzina) {
        if (brzina > dozvoljenaBrzina) {
            return true;
        } else {
            return false;
        }
    }

    public int kazna(int dozvoljenaBrzina) {
        return (brzina - dozvoljenaBrzina) * 1000;
    }

    public boolean isOldtimer() {
        if (godinaProizvodnje < 1950) {
            return true;
        } else {
            return false;
        }
    }

    public boolean registracijaJeIstekla(int trenutniMesec) {
        if (mesecRegistracije > trenutniMesec) {
            return true;
        } else {
            return false;
        }
    }

    public int cenaRegistracije() {
        if (kubikaza <= 2000) {
            return kubikaza * 100;
        } else {
            return kubikaza * 130;
        }
    }
}
