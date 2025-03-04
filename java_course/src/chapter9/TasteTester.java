package chapter9;

public class TasteTester {

    public static void main(String[] args) {

        Cake cake = new Cake("Almond");
        cake.setPrice(30);

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(45);

        WeddingCake weddingCake = new WeddingCake();

        System.out.println("Cakes flavor is " + cake.getFlavor() + " and its price is " + cake.getPrice());
        System.out.println("Birthday cakes flavor is " + birthdayCake.getFlavor() + " and its price is " + birthdayCake.getPrice());
        System.out.println("Wedding cakes flavor is " + weddingCake.getFlavor() + " and its price is " + weddingCake.getPrice());
    }
}
