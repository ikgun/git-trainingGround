package chapter10;

public class Apple extends Fruit {

    public Apple() {
        super(10);
    }

    public void removeSeeds() {
        System.out.println("Seeds removed!");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice!");
    }
}
