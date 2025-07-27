package Day_4_SearchingAlgorithms;

public class PerformanceComparison {
    public static void main(String[] args) {
        int n = 1000000;

        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("hello");
        long end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start) + " ns");

        start = System.nanoTime();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < n; i++) sf.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuffer time: " + (end - start) + " ns");
    }
}

