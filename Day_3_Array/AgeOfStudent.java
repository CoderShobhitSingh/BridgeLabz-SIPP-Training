package Day_3_Array;

import java.util.*;
public class AgeOfStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]<0){
                System.out.println("invalid age");
            }
            else if(arr[i] >= 18){
                System.out.println("The student with age "+arr[i]+" can vote");
            }
            else{
                System.out.println("The student with age "+arr[i]+" cannot vote");
            }
        }
    }
}
