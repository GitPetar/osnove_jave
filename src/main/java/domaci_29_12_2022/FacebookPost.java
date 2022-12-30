package domaci_29_12_2022;

public class FacebookPost {
    String imeIPrezimeObjavitelja;
    String imeIPrezimeObjavoprimaoca;
    String tekstObjave;
    int brojLajkova;
    int brojDeljenja;

    public String getImeIPrezimeObjavitelja() {
        return imeIPrezimeObjavitelja;
    }

    public String getImeIPrezimeObjavoprimaoca() {
        return imeIPrezimeObjavoprimaoca;
    }

    public String getTekstObjave() {
        return tekstObjave;
    }

    public int getBrojLajkova() {
        return brojLajkova;
    }

    public int getBrojDeljenja() {
        return brojDeljenja;
    }

    public void setImeIPrezimeObjavitelja(String imeIPrezimeObjavitelja) {
        this.imeIPrezimeObjavitelja = imeIPrezimeObjavitelja;
    }

    public void setImeIPrezimeObjavoprimaoca(String imeIPrezimeObjavoprimaoca) {
        this.imeIPrezimeObjavoprimaoca = imeIPrezimeObjavoprimaoca;
    }

    public void setTekstObjave(String tekstObjave) {
        this.tekstObjave = tekstObjave;
    }

    public void like() {
        brojLajkova++;
    }

    public void dislike() {
        if (brojLajkova > 0) {
            brojLajkova--;
        }
    }

    public void share() {
        brojDeljenja++;
    }

    public void print(){
        System.out.println(imeIPrezimeObjavitelja+" >>> "+imeIPrezimeObjavoprimaoca);
        System.out.println(tekstObjave);
        System.out.println("Likes "+brojLajkova+" | Shares "+brojDeljenja);
    }
}
