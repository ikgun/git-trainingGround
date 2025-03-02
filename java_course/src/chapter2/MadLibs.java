package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {
//        Create a program that asks a user for a season of the year,
//        then a whole number, then an adjective. And use the input to
//        complete the sentence below. Output the result.

        System.out.println("Please enter a season of the year. ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        System.out.println("Please enter a whole number. ");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter an adjective. ");
        String adj = scanner.nextLine();
        scanner.close();

        System.out.println("On a " + adj + " " + season + " day, I drink a minimum of "
                + number + " cups of coffee.");
    }

}
