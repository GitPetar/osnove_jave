package p10_01_2023;

public class Video {
    private String id="adv57272bg5", naziv = "Ariana Grande - positions (official video)";
    private int duzinaUSekundama= 120, brojLajkova, brojDislajkova, brojPregleda;

    public void lajkuj() {
        brojLajkova++;
    }

    public void dislajkuj() {
        brojDislajkova++;
    }

    public void pogledaj(){
        brojPregleda++;
    }

    public String getId() {
        return id;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getDuzinaUSekundama() {
        return duzinaUSekundama;
    }

    public int getBrojLajkova() {
        return brojLajkova;
    }

    public int getBrojDislajkova() {
        return brojDislajkova;
    }

    public int getBrojPregleda() {
        return brojPregleda;
    }
}
