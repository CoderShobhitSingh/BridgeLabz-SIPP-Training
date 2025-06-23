package Day_5_String;

import java.util.Random;

public class VotingEligibility {

    static int[] randomAges(int n) {
        Random rnd = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = rnd.nextInt(90) + 1;  
        return arr;
    }

    static String[][] ageWithEligibility(int[] ages) {
        String[][] tbl = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            tbl[i][0] = String.valueOf(ages[i]);
            tbl[i][1] = ages[i] >= 18 ? "true" : "false";
        }
        return tbl;
    }

    static void printTable(String[][] tbl) {
        System.out.printf("%-5s %-10s%n","Age","CanVote");
        for (String[] row : tbl)
            System.out.printf("%-5s %-10s%n", row[0], row[1]);
    }

    public static void main(String[] args) {
        int[] ages = randomAges(10);
        printTable(ageWithEligibility(ages));
    }
}

