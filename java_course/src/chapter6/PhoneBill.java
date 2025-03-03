package chapter6;

import java.util.Locale;

public class PhoneBill {

    private double baseCost;
    private int id;
    private int allottedMins;
    private int usedMins;

    public PhoneBill() {
        this.id = 0;
        this.baseCost = 50;
        this.allottedMins = 60;
        this.usedMins = 30;

    }

    public PhoneBill(int id) {
        this.id = id;
        this.baseCost = 50;
        this.allottedMins = 60;
        this.usedMins = 30;
    }

    public PhoneBill(double baseCost, int id, int allottedMins, int usedMins) {
        this.baseCost = baseCost;
        this.id = id;
        this.allottedMins = allottedMins;
        this.usedMins = usedMins;
    }

    public double calculateOverageCharge() {
        if (usedMins <= allottedMins) {
            return 0;
        }
        double overageFee = 0.25;
        return (usedMins - allottedMins) * overageFee;
    }

    public double calculateTaxCharge() {
        double taxFee = 0.15;
        return (calculateOverageCharge() + baseCost) * taxFee;
    }

    public double calculateTotalBill() {
        return calculateOverageCharge() + baseCost + calculateTaxCharge();
    }

    public void printBill() {

        System.out.println("Phone Bill Statement " + id);
        System.out.println("Allotted minutes: " + allottedMins);
        System.out.println("Used minutes: " + usedMins);
        System.out.println("Plan cost: $" + String.format(Locale.US, "%.2f", baseCost));
        System.out.println("Overage charge: $" + String.format(Locale.US, "%.2f", calculateOverageCharge()));
        System.out.println("Tax charge: $" + String.format(Locale.US, "%.2f", calculateTaxCharge()));
        System.out.println("Total bill: $" + String.format(Locale.US, "%.2f", calculateTotalBill()) + "\n");

    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAllottedMins() {
        return allottedMins;
    }

    public void setAllottedMins(int allottedMins) {
        this.allottedMins = allottedMins;
    }

    public int getUsedMins() {
        return usedMins;
    }

    public void setUsedMins(int usedMins) {
        this.usedMins = usedMins;
    }
}
