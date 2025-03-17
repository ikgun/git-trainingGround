package chapter7;

/*
Make an array that holds the textual values of the days of the week.
Have the user input a number corresponding to the day of the week.
Assume the week starts on Monday.
Your program should output the String that represents the day of the week
Example: User inputs the number 1, your program should print "Monday"
 */

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Enter a number between 1-7 to print a day of the week:");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Day : " + daysOfWeek[number - 1]);


    }
}
