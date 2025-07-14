package Day_1_LinkedList;

import java.util.Scanner;

public class MovieManagementApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieLinkedList list = new MovieLinkedList();
        int choice;

        do {
            System.out.println("\n--- Movie Management System ---");
            System.out.println("1. Add Movie at Beginning");
            System.out.println("2. Add Movie at End");
            System.out.println("3. Add Movie at Position");
            System.out.println("4. Delete Movie by Title");
            System.out.println("5. Search by Director");
            System.out.println("6. Search by Rating");
            System.out.println("7. Display All (Forward)");
            System.out.println("8. Display All (Reverse)");
            System.out.println("9. Update Rating by Title");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            String title, director;
            int year, pos;
            double rating;

            switch (choice) {
                case 1:
                    System.out.print("Enter Title, Director, Year, Rating: ");
                    title = sc.nextLine();
                    director = sc.nextLine();
                    year = sc.nextInt();
                    rating = sc.nextDouble();
                    list.addAtBeginning(title, director, year, rating);
                    break;
                case 2:
                    System.out.print("Enter Title, Director, Year, Rating: ");
                    title = sc.nextLine();
                    director = sc.nextLine();
                    year = sc.nextInt();
                    rating = sc.nextDouble();
                    list.addAtEnd(title, director, year, rating);
                    break;
                case 3:
                    System.out.print("Enter Position: ");
                    pos = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title, Director, Year, Rating: ");
                    title = sc.nextLine();
                    director = sc.nextLine();
                    year = sc.nextInt();
                    rating = sc.nextDouble();
                    list.addAtPosition(pos, title, director, year, rating);
                    break;
                case 4:
                    System.out.print("Enter Movie Title to Delete: ");
                    title = sc.nextLine();
                    list.deleteByTitle(title);
                    break;
                case 5:
                    System.out.print("Enter Director Name to Search: ");
                    director = sc.nextLine();
                    list.searchByDirector(director);
                    break;
                case 6:
                    System.out.print("Enter Rating to Search: ");
                    rating = sc.nextDouble();
                    list.searchByRating(rating);
                    break;
                case 7:
                    list.displayForward();
                    break;
                case 8:
                    list.displayReverse();
                    break;
                case 9:
                    System.out.print("Enter Movie Title and New Rating: ");
                    title = sc.nextLine();
                    rating = sc.nextDouble();
                    list.updateRating(title, rating);
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

