import java.util.*;
import java.util.stream.Collectors;

public class ClassArray {
    public static void main(String[] args) {
        String[] stringArray = {"мама", "папа", "їж їжак желе"};

        System.out.println(Arrays.toString(stringArray));

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);

            Map<Character, Integer> result = new HashMap<>();
                for (char ch : stringArray[i].toCharArray()) {
                    if (Character.isLetter(ch)) {
                        int count = result.containsKey(ch) ? result.get(ch) : 0;
                        result.put(ch, count + 1);
                    }
                }

                for (Map.Entry<Character, Integer> pair : result.entrySet()) {

                    if (pair.getValue() % 2 == 0) {
                        System.out.println(pair.getKey() + " : " + pair.getValue());
                    }
                }

        }
        System.out.println("--------------------------------");

        Set<Character> letters = new HashSet<>();
        for (String words : stringArray) {
            for (char ch : words.toCharArray()) {
                letters.add(ch);
            }
        }

        System.out.println("Список унікальних символів: ");
        System.out.println(letters);


        System.out.println("--------------------------------");
        System.out.println("Набір всіх літер:");
        for (String phrase : stringArray) {
            char[] ch = phrase.toCharArray();

            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == ' ')
                    continue;
                System.out.print(ch[i]+ ", ");

            }
        }


    }


}
