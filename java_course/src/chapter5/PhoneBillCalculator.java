package chapter5;

/*
Calculate the final total of someone's cell phone bill.
Allow the operator to input the plan fee and the number of overage
minutes.
Charge the user 0.25 for every minute they were over their plan, and
15% tax on the subtotal.
Create separate methods to calculate the tax, overage fees, and final total.
Print the itemized bill, like this:
Enter base cost of the plan:
82.45
Enter overage minutes:
9
Phone Bill Statement
Plan: $82.45
Overage: $2.25
Tax: $12.71
Total: $97.41
 */

import java.util.Locale;
import java.util.Scanner;

public class PhoneBillCalculator {

    static double totalBill;
    static double overageCharge;
    static double taxCharge;

    public static double calculateTaxCharge(double subTotal) {
        double taxFee = 0.15;
        taxCharge = subTotal * taxFee;
        return taxCharge;

    }

    public static double calculateOverageCharge(double overageMinutes) {
        double overageFee = 0.25;
        overageCharge = overageMinutes * overageFee;
        return overageCharge;

    }

    public static double calculateTotalBill(double subTotal, double taxCharge) {

        totalBill = subTotal + taxCharge;
        return totalBill;

    }

    public static void printBill(double baseCost, double overageCharge, double taxCharge, double totalBill) {

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format(Locale.US, "%.2f", baseCost));
        System.out.println("Overage: $" + String.format(Locale.US, "%.2f", overageCharge));
        System.out.println("Tax: $" + String.format(Locale.US, "%.2f", taxCharge));
        System.out.println("Total: $" + String.format(Locale.US, "%.2f", totalBill));

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Enter base cost of the plan:");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        double overageMinutes = scanner.nextDouble();

        scanner.close();

        overageCharge = calculateOverageCharge(overageMinutes);

        double subTotal = baseCost + overageCharge;
        taxCharge = calculateTaxCharge(subTotal);

        totalBill = calculateTotalBill(subTotal, taxCharge);

        printBill(baseCost, overageCharge, taxCharge, totalBill);

    }


}
