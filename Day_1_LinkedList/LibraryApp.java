package Day_1_LinkedList;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int choice;

        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book at Beginning");
            System.out.println("2. Add Book at End");
            System.out.println("3. Add Book at Position");
            System.out.println("4. Remove Book by ID");
            System.out.println("5. Search Book by Title");
            System.out.println("6. Search Book by Author");
            System.out.println("7. Update Availability Status");
            System.out.println("8. Display Books (Forward)");
            System.out.println("9. Display Books (Reverse)");
            System.out.println("10. Count Total Books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            int id, pos;
            String title, author, genre;
            boolean available;

            switch (choice) {
                case 1:
                    System.out.print("Enter Title, Author, Genre, ID, Availability(true/false): ");
                    title = sc.next();
                    author = sc.next();
                    genre = sc.next();
                    id = sc.nextInt();
                    available = sc.nextBoolean();
                    library.addAtBeginning(title, author, genre, id, available);
                    break;
                case 2:
                    System.out.print("Enter Title, Author, Genre, ID, Availability(true/false): ");
                    title = sc.next();
                    author = sc.next();
                    genre = sc.next();
                    id = sc.nextInt();
                    available = sc.nextBoolean();
                    library.addAtEnd(title, author, genre, id, available);
                    break;
                case 3:
                    System.out.print("Enter Position: ");
                    pos = sc.nextInt();
                    System.out.print("Enter Title, Author, Genre, ID, Availability(true/false): ");
                    title = sc.next();
                    author = sc.next();
                    genre = sc.next();
                    id = sc.nextInt();
                    available = sc.nextBoolean();
                    library.addAtPosition(pos, title, author, genre, id, available);
                    break;
                case 4:
                    System.out.print("Enter Book ID to remove: ");
                    id = sc.nextInt();
                    library.removeById(id);
                    break;
                case 5:
                    System.out.print("Enter Title to search: ");
                    title = sc.next();
                    library.searchByTitle(title);
                    break;
                case 6:
                    System.out.print("Enter Author to search: ");
                    author = sc.next();
                    library.searchByAuthor(author);
                    break;
                case 7:
                    System.out.print("Enter Book ID and new availability (true/false): ");
                    id = sc.nextInt();
                    available = sc.nextBoolean();
                    library.updateAvailability(id, available);
                    break;
                case 8:
                    library.displayForward();
                    break;
                case 9:
                    library.displayReverse();
                    break;
                case 10:
                    library.countBooks();
                    break;
                case 0:
                    System.out.println("Exiting Library System...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 0);
    }
}

