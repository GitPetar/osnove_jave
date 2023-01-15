package p13_01_2023;

import java.util.Random;

public class InstagramTag {
   private int xKoordinata, yKoordinata;
    private InstagramUser tagovan;

    InstagramTag(){
        Random random = new Random();
        this.tagovan = new InstagramUser();
    }
}
