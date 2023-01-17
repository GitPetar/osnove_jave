package domaci_17_01_2023;

public class QualityOptimizerControl extends Control {

    private double brzinaInterneta; // u megabajtima

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (this.brzinaInterneta * 10.1 < 144) {
            videoPlayer.setKavlitet(144);
        } else if (this.brzinaInterneta * 10.1 < 240) {
            videoPlayer.setKavlitet(240);

        } else if (this.brzinaInterneta * 10.1 < 360) {
            videoPlayer.setKavlitet(360);

        } else if (this.brzinaInterneta * 10.1 < 480) {
            videoPlayer.setKavlitet(480);
        } else if (this.brzinaInterneta * 10.1 < 720) {
            videoPlayer.setKavlitet(720);
        } else {
            videoPlayer.setKavlitet(1080);
        }
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public QualityOptimizerControl() {
    }

    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }
}
