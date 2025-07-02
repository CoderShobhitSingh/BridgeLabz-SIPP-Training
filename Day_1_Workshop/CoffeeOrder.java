package Day_1_Workshop;

import java.util.*;
public class CoffeeOrder {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Coffee Name: ");
        String coffeeName = sc.nextLine().toLowerCase(); 
        
        
        
        int basePrice;

        switch (coffeeName) {
            case "espresso":
                basePrice = 180;
                System.out.println("You ordered an Espresso ☕");
                break;
            case "cappuccino":
                basePrice = 200;
                System.out.println("You ordered a Cappuccino ☕");
                break;
            case "latte":
                basePrice = 220;
                System.out.println("You ordered a Latte ☕");
                break;
            case "mocha":
                basePrice = 250;
                System.out.println("You ordered a Mocha ☕");
                break;
            default:
                System.out.println("Sorry, we don't have that coffee type.");
                sc.close();
                return;
        }
        
        System.out.println("Enter the quantity: ");
        int quantity = sc.nextInt();
        

        double gst = (basePrice*quantity) * 0.18;
        double totalPrice = basePrice * quantity;
        double finalPrice = totalPrice + gst;

        System.out.println("Base Price: ₹" + basePrice);
        System.out.println("Total Price: ₹" + (basePrice * quantity));
        System.out.println("GST (18%): ₹" + gst);
        System.out.println("Final Price: ₹" + finalPrice);
        
	}
}

