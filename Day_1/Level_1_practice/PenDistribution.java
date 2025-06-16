package Day_1_Level_1_practice;

public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;

        int pensPerStd = totalPens / students;
        int remaining = totalPens % students;

        System.out.println("The pen per student is "+pensPerStd+" and the remaining pens are not distributed is "+remaining);
    }
}
