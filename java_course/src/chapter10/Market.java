package chapter10;

public class Market {

    public static void main(String[] args) {

        Fruit fruit = new Fruit(50);
        fruit.makeJuice();
        System.out.println(fruit.getCalories());

        Fruit fruit1 = new Apple();
        fruit1.makeJuice();
        System.out.println(fruit1.getCalories());
        ((Apple) fruit1).removeSeeds();
        System.out.println(fruit1.getCalories());

        fruit1 = new Banana();
        fruit1.makeJuice();
        ((Banana) fruit1).peel();
        System.out.println(fruit1.getCalories());


    }
}
