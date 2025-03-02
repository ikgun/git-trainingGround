package chapter3;

/*
So, you're going to create a program that asks the user to enter the quantities for the following coins.

You'll ask them how many pennies would you like?
How many nickels would you like?
How many dimes?
And then, how many quarters?
What your program is going to do is count up the value of all of the change that they answered.

If it's exactly one dollar then they win the game.
If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
If it's less than one dollar, tell them how much they went under.
 */

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String[] args) {

        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        int dollar = 1;

        System.out.println("How many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        int pennyAmount = scanner.nextInt();

        System.out.println("How many nickels would you like?");
        int nickelAmount = scanner.nextInt();

        System.out.println("How many dimes?");
        int dimeAmount = scanner.nextInt();

        System.out.println("How many quarters?");
        int quarterAmount = scanner.nextInt();

        scanner.close();

        double totalAmount = penny * pennyAmount + nickel * nickelAmount + dime * dimeAmount + quarter * quarterAmount;

        if (totalAmount == dollar) {
            System.out.println("Congrats! You won the game.");

        } else if (totalAmount > dollar) {

            double extra = totalAmount - dollar;
            System.out.println("You lose. The total amount you entered is $" + totalAmount + " and it's more than a dollar by " + String.format("%.2f", extra) + " cents.");


        } else {

            double missing = dollar - totalAmount;
            System.out.println("The total amount you entered is $" + totalAmount + " and it's less than a dollar by " + String.format("%.2f", missing) + " cents.");

        }
    }
}
