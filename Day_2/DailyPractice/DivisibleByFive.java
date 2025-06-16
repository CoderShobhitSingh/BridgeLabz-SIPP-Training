package Day_2_DailyPractice;
import java.util.*;
public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        String result;
        if(n%5==0){
            result = "yes";
        }
        else{
            result = "no";
        }
        System.out.println(result);
    }
}
