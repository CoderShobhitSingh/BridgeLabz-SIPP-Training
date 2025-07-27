package Day_4_SearchingAlgorithms;

import java.io.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
        String line;
        int count = 0;
        String word = "hello";
        while ((line = reader.readLine()) != null) {
            for (String w : line.split("\\s+")) {
                if (w.equals(word)) count++;
            }
        }
        reader.close();
        System.out.println("Occurrences of '" + word + "': " + count);
    }
}

