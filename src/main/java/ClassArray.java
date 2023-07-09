import java.util.*;
import java.util.stream.Collectors;

public class ClassArray {
    public static void main(String[] args) {

        printEvenCharacters(new String[]{"мама", "папа", "їж їжак желе"});
    }

    public static void printEvenCharacters(String[] phrases) {
        List<String> evenPhrases = new ArrayList<>();
        int counter = 0;
        for (String phrase : phrases) {
            Map<Character, Integer> charCount = countCharacters(phrase);
            if (isEvenCountChars(charCount)) {
                evenPhrases.add(phrase);
                counter++;
                if (counter == 2)
                    break;
            }
        }
        Set<Character> uniqueChars = getUniqueCharacters(evenPhrases);
        System.out.println(uniqueChars);
    }
    private static Map<Character, Integer> countCharacters(String phrase) {
        char[] chars = phrase.toCharArray();
        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch : chars) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        return charCount;
    }
    private static Set<Character> getUniqueCharacters(List<String> list) {
        Set<Character> uniqueChars = new HashSet<>();
        for (String phrase : list) {
            char[] chars = phrase.toCharArray();
            for (char ch : chars)
                uniqueChars.add(ch);
        }
        return uniqueChars;
    }
    private static boolean isEvenCountChars(Map<Character, Integer> charCount) {
        boolean isEven = false;
        for (Character ch : charCount.keySet()) {
            System.out.println(ch + " - " + charCount.get(ch));
            isEven = charCount.get(ch) % 2 == 0;
            if (!isEven) break;
        }
        return isEven;
    }
}
