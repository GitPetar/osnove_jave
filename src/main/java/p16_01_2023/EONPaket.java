package p16_01_2023;

public class EONPaket extends Paket {
    public EONPaket(String imeIprezimeKorisnika, int mesecnaCena, int ugovornaObaveza) {
        super(imeIprezimeKorisnika, mesecnaCena, ugovornaObaveza);
        this.naziv = "EON LIGHT DUO";
        this.download = 150;
        this.upload = 75;
    }
@Override
    public int kolikoMeseciBesplatno() {
        return 3;
    }
@Override
    public void stampaj() {
        super.stampaj();
        System.out.println(" broj meseci za dinar: " + kolikoMeseciBesplatno());
    }

}
