public class StreamsCountingVowels {
    // Count the number of vowels in a sentence
    public static void main(String[] args) {
        String sentence = "This is a sentence, there are many words in it.";

        long numVowels = 0;
        for (char c : sentence.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) < 0) {
                numVowels++;
            }
        }

        System.out.println(numVowels);
    }
}
