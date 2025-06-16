package Day_1_Level_2_practice;

import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter unit price (INR): ");
        double unitPrice = in.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = in.nextInt();

        double total = unitPrice * quantity;
        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f%n",
                          total, quantity, unitPrice);
    }
}
