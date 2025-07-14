package Day_5_Encapsulation_Polymorphism_Abstract.E_CommercePlatform;

import java.util.*;

public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 50000));
        products.add(new Clothing(102, "T-Shirt", 1000));
        products.add(new Groceries(103, "Rice Bag", 2000));

        printFinalPrices(products);
    }

    public static void printFinalPrices(List<Product> products) {
        for (Product p : products) {
            double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Product: " + p.getName());
            System.out.println("Original Price: ₹" + p.getPrice());
            if (p instanceof Taxable) {
                System.out.println(((Taxable) p).getTaxDetails());
            } else {
                System.out.println("No tax on this item.");
            }
            System.out.println("Discount: ₹" + discount);
            System.out.println("Final Price: ₹" + finalPrice);
        }
    }
}

