package FinalProject;

import java.util.Random;

public class Coin {

    private String side;
    public static final String HEADS = "Heads";
    public static final String TAILS = "Tails";

    public void flip() {
        Random number = new Random();
        if (number.nextInt() % 2 == 0) setSide(HEADS);
        else setSide(TAILS);
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getSide() {
        return side;
    }
}
