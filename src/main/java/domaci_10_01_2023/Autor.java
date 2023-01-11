package domaci_10_01_2023;

public class Autor {
    String imeIPrezime;

    public Autor() {
    }

    public Autor(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }


    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void print() {
        System.out.print(imeIPrezime);
    }
}
