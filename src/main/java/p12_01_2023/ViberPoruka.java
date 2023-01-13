package p12_01_2023;

public class ViberPoruka {
    private String tekstPoruke, vremeSlanja;
    private ViberKorisnik posiljalac, primalac;
    private ViberReakcija reakcija;

    public ViberPoruka(String tekstPoruke, String vremeSlanja, ViberKorisnik posiljalac, ViberKorisnik primalac) {
        this.tekstPoruke = tekstPoruke;
        this.vremeSlanja = vremeSlanja;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
    }

    public ViberPoruka() {
    }

    public ViberReakcija getReakcija() {
        return reakcija;
    }

    public void setReakcija(ViberReakcija reakcija) {
        this.reakcija = reakcija;
    }

    public String getTekstPoruke() {
        return tekstPoruke;
    }

    public void setTekstPoruke(String tekstPoruke) {
        this.tekstPoruke = tekstPoruke;
    }

    public String getVremeSlanja() {
        return vremeSlanja;
    }

    public void setVremeSlanja(String vremeSlanja) {
        this.vremeSlanja = vremeSlanja;
    }

    public ViberKorisnik getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(ViberKorisnik posiljalac) {
        this.posiljalac = posiljalac;
    }

    public ViberKorisnik getPrimalac() {
        return primalac;
    }

    public void setPrimalac(ViberKorisnik primalac) {
        this.primalac = primalac;
    }

    public void prikazi() {
        if (reakcija != null) {
            System.out.println("From: " + posiljalac.getImeIPrezime() + " * " + posiljalac.isTrenutnoAktivanText() + " - at " + vremeSlanja);
            System.out.println("To: " + primalac.getImeIPrezime());
            System.out.println(tekstPoruke + " : " + reakcija.getEmoji() + " from " + reakcija.getReaktor().getImeIPrezime());
        } else {
            System.out.println("From: " + posiljalac.getImeIPrezime() + " * " + posiljalac.isTrenutnoAktivanText() + " - at " + vremeSlanja);
            System.out.println("To: " + primalac.getImeIPrezime());
            System.out.println(tekstPoruke);

        }
    }
}
