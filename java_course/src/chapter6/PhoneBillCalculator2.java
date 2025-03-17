package chapter6;

/*
Enhance the Phone Bill exercise by redoing it in an object-oriented style.

A phone bill should have an id, base cost, number of allotted minutes,
and number of minutes used. One should also be able to calculate the overage,
tax, and total on a phone bill, and also be able to print an itemized bill.
Include the following constructors: default, id-only, all fields. No matter
which constructor is used, all fields should be set.
Create a class that instantiates a phone bill and prints the itemized bill.

So, a phone bill should have an ID, a base class, a number of allotted
minutes and a number of minutes used. And then, it should also be able to
calculate the overage, calculate the tax, and calculate the total.

And then, it should also be able to print an itemized bill.

You should also include three constructors

a default one
one that accepts the ID only
one that accepts all fields
Now no matter which of these constructors you use, all fields should be set eventually.

Then you can also create a different class that instantiates the PhoneBill
and prints out an itemized bill.
 */

public class PhoneBillCalculator2 {

    public static void main(String[] args) {

        PhoneBill phoneBill = new PhoneBill();

        phoneBill.printBill();

        PhoneBill phoneBill1 = new PhoneBill(5);

        phoneBill1.printBill();

        PhoneBill phoneBill2 = new PhoneBill(45, 6, 78, 40);

        phoneBill2.printBill();
    }
}
