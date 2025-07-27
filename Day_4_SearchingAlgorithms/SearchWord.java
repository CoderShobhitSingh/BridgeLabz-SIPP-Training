package Day_4_SearchingAlgorithms;

public class SearchWord {
    public static String findSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "Java is a popular programming language.",
            "Searching algorithms are important in computer science.",
            "This is a sample sentence."
        };
        String word = "algorithms";
        String result = findSentence(sentences, word);
        System.out.println(result);
    }
}

