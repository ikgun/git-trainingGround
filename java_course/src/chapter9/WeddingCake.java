package chapter9;

public class WeddingCake extends Cake{

    protected int tiers;

    public WeddingCake() {
        super("Vanilla");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
