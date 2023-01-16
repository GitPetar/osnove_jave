package p16_01_2023;

public class Paket {
    protected String naziv, imeIprezimeKorisnika;
    protected int download, upload, mesecnaCena, ugovornaObaveza;

    public Paket(String naziv, String imeIprezimeKorisnika, int download, int upload, int mesecnaCena, int ugovornaObaveza) {
        this.naziv = naziv;
        this.imeIprezimeKorisnika = imeIprezimeKorisnika;
        this.download = download;
        this.upload = upload;
        this.mesecnaCena = mesecnaCena;
        this.ugovornaObaveza = ugovornaObaveza;
    }

    public Paket(String imeIprezimeKorisnika, int mesecnaCena, int ugovornaObaveza) {
        this.imeIprezimeKorisnika = imeIprezimeKorisnika;
        this.mesecnaCena = mesecnaCena;
        this.ugovornaObaveza = ugovornaObaveza;
    }

    public void produziUgovor() {
        this.ugovornaObaveza += 12;
    }

    public int kolikoMeseciBesplatno() {
        return 0;
    }

    public void stampaj() {
        System.out.println(imeIprezimeKorisnika);
        System.out.println(naziv + " - " + download + " download/" + upload + " upload - " + ugovornaObaveza + " meseci");
        System.out.print("Cena: "+mesecnaCena);
    }
}
