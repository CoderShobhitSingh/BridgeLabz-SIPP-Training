package Day_1_LinkedList;

import java.util.Scanner;

public class TaskSchedulerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskCircularLinkedList scheduler = new TaskCircularLinkedList();
        int choice;

        do {
            System.out.println("\n--- Task Scheduler ---");
            System.out.println("1. Add Task at Beginning");
            System.out.println("2. Add Task at End");
            System.out.println("3. Add Task at Position");
            System.out.println("4. Remove Task by ID");
            System.out.println("5. View Current Task & Move to Next");
            System.out.println("6. Display All Tasks");
            System.out.println("7. Search Task by Priority");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            int id, pos, priority;
            String name, due;

            switch (choice) {
                case 1:
                    System.out.print("Enter ID, Name, Priority, DueDate: ");
                    id = sc.nextInt();
                    name = sc.next();
                    priority = sc.nextInt();
                    due = sc.next();
                    scheduler.addAtBeginning(id, name, priority, due);
                    break;
                case 2:
                    System.out.print("Enter ID, Name, Priority, DueDate: ");
                    id = sc.nextInt();
                    name = sc.next();
                    priority = sc.nextInt();
                    due = sc.next();
                    scheduler.addAtEnd(id, name, priority, due);
                    break;
                case 3:
                    System.out.print("Enter Position: ");
                    pos = sc.nextInt();
                    System.out.print("Enter ID, Name, Priority, DueDate: ");
                    id = sc.nextInt();
                    name = sc.next();
                    priority = sc.nextInt();
                    due = sc.next();
                    scheduler.addAtPosition(pos, id, name, priority, due);
                    break;
                case 4:
                    System.out.print("Enter Task ID to Remove: ");
                    id = sc.nextInt();
                    scheduler.removeById(id);
                    break;
                case 5:
                    scheduler.viewCurrentAndMoveNext();
                    break;
                case 6:
                    scheduler.displayAll();
                    break;
                case 7:
                    System.out.print("Enter Priority to Search: ");
                    priority = sc.nextInt();
                    scheduler.searchByPriority(priority);
                    break;
                case 0:
                    System.out.println("Exiting Task Scheduler...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
    }
}

