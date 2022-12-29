package p29_12_2022;

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
    String registracija;
    boolean klimaJeUkljucena;
    int maxBrzina;
    int kapacitetRezervoara;
    int trenutnaKolicinaGoriva = 10;

    public Auto(String imeiPrezime, String marka, int brojVrata, int potrosnja, int brzina, int godinaProizvodnje, int mesecRegistracije, int kubikaza, String registracija, boolean klimaJeUkljucena, int maxBrzina) {
        this.imeiPrezime = imeiPrezime;
        this.marka = marka;
        this.brojVrata = brojVrata;
        this.potrosnja = potrosnja;
        this.brzina = brzina;
        this.godinaProizvodnje = godinaProizvodnje;
        this.mesecRegistracije = mesecRegistracije;
        this.kubikaza = kubikaza;
        this.registracija = registracija;
        this.klimaJeUkljucena = klimaJeUkljucena;
        this.maxBrzina = maxBrzina;
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

    public void dodajGas() {
        brzina += 10;
        if (brzina > maxBrzina) {
            brzina = maxBrzina;
        }
    }

    public void koci() {
        brzina -= 10;
        if (brzina < 0) {
            brzina = 0;
        }
    }

    public double trenutnaPotrosnja() {
        if (klimaJeUkljucena) {
            return (brzina / 100.0 * potrosnja) * 1.2;
        } else {
            return (brzina / 100.0 * potrosnja) * 1.0;
        }
    }

    public void stampajTablu() {
        for (int i = 1; i <= 100; i++) {
            if ((brzina * 100) / maxBrzina >= i) {
                System.out.print("|");

            } else {
                System.out.print(".");
            }
        }
        System.out.print(" " + brzina + "/" + maxBrzina + "km/h");
    }

    public int natociGorivo(int zaTocenje) {
        trenutnaKolicinaGoriva += Math.min(zaTocenje, kapacitetRezervoara - trenutnaKolicinaGoriva);
        return Math.min(zaTocenje, kapacitetRezervoara - trenutnaKolicinaGoriva) * 240;
    }
}

