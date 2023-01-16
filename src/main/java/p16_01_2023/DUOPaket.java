package p16_01_2023;

public class DUOPaket extends Paket {
    private String bonusUredjaj;

    public DUOPaket(String imeIprezimeKorisnika, int mesecnaCena, int ugovornaObaveza) {
        super(imeIprezimeKorisnika, mesecnaCena, ugovornaObaveza);
        this.naziv = "EON FULL DUO";
        this.download = 250;
        this.upload = 100;
    }

    @Override
    public int kolikoMeseciBesplatno() {
        return 6;
    }

    public void povecajBrzinu(int povecanje) {
        this.download += povecanje;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println(" broj meseci za dinar: " + kolikoMeseciBesplatno());
    }
}
