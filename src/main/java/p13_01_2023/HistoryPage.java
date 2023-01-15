package p13_01_2023;

import java.util.Random;

public class HistoryPage {
    private String naziv, link, username, password;

    private int sat, minut;

    private static int counter = 1;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getSat() {
        return sat;
    }

    public void setSat(int sat) {
        this.sat = sat;
    }

    public int getMinut() {
        return minut;
    }

    public void setMinut(int minut) {
        this.minut = minut;
    }

    public HistoryPage() {
    }

    public HistoryPage(String link) {
        this.link = link;
    }

    public HistoryPage(String naziv, String link, String username, String password, int sat, int minut) {
        this.naziv = naziv;
        this.link = link;
        this.username = username;
        this.password = password;
        this.sat = sat;
        this.minut = minut;
    }

    public void random() {
        Random random = new Random();
        this.naziv = "Stranica " + counter;
        this.link = "link " + counter;
        this.username = "username " + counter;
        this.password = "password " + counter;
        this.sat = random.nextInt(24);
        this.minut = random.nextInt(60);
        counter++;
    }

    public void sacuvajKredencijale(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void obrisiKolacice() {
        this.username = null;
        this.password = null;
    }

    public void stampaj() {
        String vreme = String.valueOf(this.sat / 10) + String.valueOf(this.sat % 10) + ":" + String.valueOf(this.minut / 10) + String.valueOf(this.minut % 10);
        System.out.print(vreme + " " + this.naziv + " ... " + this.link);
        if (username != null && password != null) {
            System.out.println("*");
        } else {
            System.out.println();
        }
    }
}
