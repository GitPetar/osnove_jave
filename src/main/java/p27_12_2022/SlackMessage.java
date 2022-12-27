package p27_12_2022;

public class SlackMessage {
    String tekst;
    String imeIPrezime;
    String datumIvreme;

    SlackMessage(String tekst, String imeIPrezime, String datumIvreme) {
        this.tekst = tekst;
        this.imeIPrezime = imeIPrezime;
        this.datumIvreme = datumIvreme;
    }

    public void stampaj() {
        System.out.println(imeIPrezime + " - " + datumIvreme);
        System.out.println(tekst);

    }
}
