package Day_2;

public class DayOfWeek {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            System.out.println("Example: java DayOfWeek 6 17 2025");
            return;
        }

        try {
            int m = Integer.parseInt(args[0]); 
            int d = Integer.parseInt(args[1]);
            int y = Integer.parseInt(args[2]); 

            if (m == 1 || m == 2) {
                m += 12;
                y--;
            }

            int q = d;
            int K = y % 100;
            int J = y / 100;

            int h = (q + (13 * (m + 1)) / 5 + K + K / 4 + J / 4 - 2 * J) % 7;

            h = (h + 7) % 7;

            String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

            System.out.println("Day of the week for " + args[0] + "/" + args[1] + "/" + args[2] + " is: " + days[h] + " (" + h + ")");

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide integer values for month, day, and year.");
        }
    }
    
}
