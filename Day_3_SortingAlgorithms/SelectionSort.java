package Day_3_SortingAlgorithms;

public class SelectionSort{
    public static void selectionSort(int[] scores) {
        int n = scores.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIdx]) minIdx = j;
            }
            int temp = scores[minIdx]; scores[minIdx] = scores[i]; scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {64, 25, 12, 22, 11};
        selectionSort(scores);
        System.out.print("Sorted array: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
}

