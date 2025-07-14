package Day_1_LinkedList;

import java.util.Scanner;

public class InventoryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemLinkedList inventory = new ItemLinkedList();
        int choice;

        do {
            System.out.println("\n--- Inventory Management ---");
            System.out.println("1. Add Item at Beginning");
            System.out.println("2. Add Item at End");
            System.out.println("3. Add Item at Position");
            System.out.println("4. Remove Item by ID");
            System.out.println("5. Update Quantity by ID");
            System.out.println("6. Search by ID");
            System.out.println("7. Search by Name");
            System.out.println("8. Display All Items");
            System.out.println("9. Calculate Total Inventory Value");
            System.out.println("10. Sort Inventory");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            int id, qty, pos;
            String name;
            double price;

            switch (choice) {
                case 1:
                    System.out.print("Enter Name, ID, Quantity, Price: ");
                    name = sc.next();
                    id = sc.nextInt();
                    qty = sc.nextInt();
                    price = sc.nextDouble();
                    inventory.addAtBeginning(name, id, qty, price);
                    break;
                case 2:
                    System.out.print("Enter Name, ID, Quantity, Price: ");
                    name = sc.next();
                    id = sc.nextInt();
                    qty = sc.nextInt();
                    price = sc.nextDouble();
                    inventory.addAtEnd(name, id, qty, price);
                    break;
                case 3:
                    System.out.print("Enter Position: ");
                    pos = sc.nextInt();
                    System.out.print("Enter Name, ID, Quantity, Price: ");
                    name = sc.next();
                    id = sc.nextInt();
                    qty = sc.nextInt();
                    price = sc.nextDouble();
                    inventory.addAtPosition(pos, name, id, qty, price);
                    break;
                case 4:
                    System.out.print("Enter Item ID to Remove: ");
                    id = sc.nextInt();
                    inventory.removeById(id);
                    break;
                case 5:
                    System.out.print("Enter Item ID and New Quantity: ");
                    id = sc.nextInt();
                    qty = sc.nextInt();
                    inventory.updateQuantity(id, qty);
                    break;
                case 6:
                    System.out.print("Enter Item ID to Search: ");
                    id = sc.nextInt();
                    inventory.searchById(id);
                    break;
                case 7:
                    System.out.print("Enter Item Name to Search: ");
                    name = sc.next();
                    inventory.searchByName(name);
                    break;
                case 8:
                    inventory.displayAll();
                    break;
                case 9:
                    inventory.totalValue();
                    break;
                case 10:
                    System.out.print("Sort by (name/price): ");
                    String by = sc.next().toLowerCase();
                    System.out.print("Ascending? (true/false): ");
                    boolean asc = sc.nextBoolean();
                    inventory.sort(by, asc);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
    }
}

