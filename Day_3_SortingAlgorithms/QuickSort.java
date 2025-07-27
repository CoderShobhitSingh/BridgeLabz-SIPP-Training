package Day_3_SortingAlgorithms;

public class QuickSort {
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pi = partition(prices, low, high);
            quickSort(prices, low, pi - 1);
            quickSort(prices, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // can also use low or random
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }

        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] prices = {100, 50, 150, 30, 200};
        int n = prices.length;
        quickSort(prices, 0, n - 1);
        System.out.print("Sorted array: ");
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}

