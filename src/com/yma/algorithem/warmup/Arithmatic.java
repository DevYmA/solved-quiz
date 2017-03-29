package com.yma.algorithem.warmup;

import java.util.Scanner;

/**
 * Created by Yoshan Amarathunga on 3/10/2017.
 */
public class Arithmatic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double tipCost = tipPercent*mealCost/100;
        double taxCost = mealCost*taxPercent/100;

        double total = mealCost + tipCost + taxCost;
        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(total);

        // Print your result
        System.out.println("The total meal cost is "+totalCost+" dollars.");
    }

}
