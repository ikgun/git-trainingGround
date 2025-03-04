package chapter10;

public class Banana extends Fruit {

    public Banana() {
        super(40);
    }

    public void peel() {
        System.out.println("Banana peeled!");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana juice!");
    }


}
