import java.util.ArrayList;

public class YourOrderPlease {

    public String order(String sentence) {
        String[] words = sentence.split(" ");
        ArrayList orderedSentence = new ArrayList<String>(sentence.length());

        if (sentence.length() == 0) return "";

        for (int i = 0; i < words.length + 1; i++) {
            orderedSentence.add(i, " ");
        }

        for (String word : words) {
            String position = word.replaceAll("[^0-9]+", "");
            orderedSentence.set(Integer.valueOf(position), word);
        }
        orderedSentence.remove(0);
        return String.join(" ", orderedSentence);
    }

}
