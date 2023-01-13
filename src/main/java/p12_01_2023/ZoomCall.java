package p12_01_2023;

import java.io.FilterOutputStream;

public class ZoomCall {
    private String linkZaPoziv, password;
    private Korisnik host = new Korisnik(), guest = new Korisnik();

    public ZoomCall() {
    }

    public ZoomCall(String linkZaPoziv, String password, Korisnik host, Korisnik guest) {
        this.linkZaPoziv = linkZaPoziv;
        this.password = password;
        this.host = host;
        this.guest = guest;
    }

    public String getLinkZaPoziv() {
        return linkZaPoziv;
    }

    public String getPassword() {
        return password;
    }

    public Korisnik getHost() {
        return host;
    }

    public Korisnik getGuest() {
        return guest;
    }

    public void setGuest(Korisnik guest) {
        this.guest = guest;
    }

    public void pokreniPoziv() {
        System.out.println("Zoom Call: " + linkZaPoziv);
        System.out.println("Password: " + password);
        System.out.println("Host: " + host.getImeIPrezime());
        System.out.println("Guest: " + guest.getImeIPrezime());
        System.out.println("Maksimalno trajanje poziva je " + host.maksimalnoTrajanjePoziva(guest.getTipLicence()));
        System.out.println();
    }
}
