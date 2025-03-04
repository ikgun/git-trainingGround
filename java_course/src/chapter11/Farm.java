package chapter11;

public class Farm {

    public static void main(String[] args) {
        Animal animal = new Duck();
        animal.eat();
        animal.makeSound();

        Animal animal1 = new Pig();
        animal1.makeSound();

        Pig pig = new Pig();
        pig.makeSound();
        pig.eat();
    }
}
