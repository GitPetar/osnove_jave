package p10_01_2023;

public class YoutubePlayer {
    private Video video = new Video();
    private int kvalitet, jacinaZvuka, trenutnoVreme;
    private String rezim;

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public int getKvalitet() {
        return kvalitet;
    }

    public void setKvalitet(int kvalitet) {
        this.kvalitet = kvalitet;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(int trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public String getRezim() {
        return rezim;
    }

    public void setRezim(String rezim) {
        this.rezim = rezim;
    }

    YoutubePlayer() {
        jacinaZvuka = 75;
        kvalitet = 144;
        rezim = "mini player";
    }

    public void uciajVideo(Video video) {
        trenutnoVreme = 0;
        this.video = video;
        video.pogledaj();
    }

    public void pojacaj() {
        jacinaZvuka = Math.min(jacinaZvuka + 10, 100);

    }

    public void smanji() {
        jacinaZvuka = Math.max(jacinaZvuka - 10, 0);
    }

    public void postaviKvalitet(int brzinaInterneta) {
        if (brzinaInterneta < 2) {
            kvalitet = 144;
        } else if (brzinaInterneta <= 4) {
            kvalitet = 280;
        } else if (brzinaInterneta <= 6) {
            kvalitet = 360;
        } else if (brzinaInterneta <= 8) {
            kvalitet = 720;

        } else if (8 < brzinaInterneta) {
            kvalitet = 1080;
        }

    }

    public void aktivirajMiniPlayerMod() {
        rezim = "mini player";
    }

    public void aktivirajBioskopskiMod() {
        rezim = "bioskopski rezim";
    }

    public void aktivirajPrekoCelogEkranaMod() {
        rezim = "preko celog ekrana";
    }

    public void premotajUnapred() {
        trenutnoVreme = Math.min(trenutnoVreme + 10, video.getDuzinaUSekundama());
    }

    public void premotajUnazad() {
        trenutnoVreme = Math.max(trenutnoVreme - 10, 0);

    }

    public void iscrtajZvuk() {
        if (0 < jacinaZvuka) {
            System.out.print("<:");
            for (int i = 10; i <= jacinaZvuka; i += 10) {
                System.out.print("|");
            }
        }
        if (jacinaZvuka == 0) {
            System.out.println("</");
        } else {
            System.out.println();
        }
    }

    public void iscrtajRezim() {
        if (rezim.equals("mini player")) {
            System.out.println("[ ]");
        } else if (rezim.equals("bioskopski rezim")) {
            System.out.println("[ ..]");
        } else if (rezim.equals("preko celog ekrana")) {
            System.out.println("[||||]");
        }
    }

    public void iscrtajTrenutnoVreme() {
        System.out.println();
        System.out.print((trenutnoVreme / 60) + ":");
        System.out.print((trenutnoVreme % 60) / 10);
        System.out.print((trenutnoVreme % 60) % 10);
        System.out.print(" / ");
        System.out.print((video.getDuzinaUSekundama() / 60) + ":");
        System.out.print((video.getDuzinaUSekundama() % 60) / 10);
        System.out.print((video.getDuzinaUSekundama() % 60) % 10);

    }

    public void iscrtajTimeline() {
        for (int i = 1; i <= 100; i++) {
            if (i <= trenutnoVreme * 100 / video.getDuzinaUSekundama()) {
                System.out.print("*");
            } else {
                System.out.print(".");
            }
        }
        System.out.println();
    }

    public void iscrtaj() {
        iscrtajTrenutnoVreme();
        System.out.print(" ");
        iscrtajZvuk();
        System.out.print("Timeline: ");
        iscrtajTimeline();
        System.out.println("Kvalitet: " + kvalitet + "p");
        System.out.print("Rezim: ");
        iscrtajRezim();
        System.out.println(video.getNaziv());
        System.out.println("Likes: " + video.getBrojLajkova() + " | " + " Dislikes " + video.getBrojDislajkova());
        System.out.println(video.getBrojPregleda() + " Pregleda");
    }

    public String sheruj() {
        return "//https://youtu.be/" + video.getId();
    }
}


