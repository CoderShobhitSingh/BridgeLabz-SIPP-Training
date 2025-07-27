package Day_3_SortingAlgorithms;

public class HeapSort {
    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(salaries, n, i);

        for (int i = n - 1; i > 0; i--) {
            int temp = salaries[0]; salaries[0] = salaries[i]; salaries[i] = temp;
            heapify(salaries, i, 0);
        }
    }

    private static void heapify(int[] arr, int size, int i) {
        int largest = i;
        int left = 2 * i + 1, right = 2 * i + 2;

        if (left < size && arr[left] > arr[largest]) largest = left;
        if (right < size && arr[right] > arr[largest]) largest = right;

        if (largest != i) {
            int swap = arr[i]; arr[i] = arr[largest]; arr[largest] = swap;
            heapify(arr, size, largest);
        }
    }

    public static void main(String[] args) {
        int[] salaries = {3000, 2000, 4000, 1000, 5000};
        heapSort(salaries);
        System.out.print("Sorted array: ");
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }
        System.out.println();
    }
}

