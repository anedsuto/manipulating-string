package Test;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Optional;
import java.util.TreeMap;

public class OrderString {

    public static void main(String[] args) {

        if (args==null || args.length == 0) {
            System.out.println("Sends the input parameters");
            return ;
        }
        int countText = Integer.parseInt(args[0]);
        for (int i = 0; i < countText; i++) {
            Optional<String> text = Optional.of(args[i + 1]);
            System.out.println(stringManipulation(text.get()));
        }
    }

    static String stringManipulation(String stringToManipulate) {

        char[] textArray = stringToManipulate.toCharArray();
        HashMap<Character, Integer> intermediateMap = new HashMap<>();


        for (int i = 0; i < textArray.length; i++) {
            if (intermediateMap.get(textArray[i]) != null) {
                int value = intermediateMap.get(textArray[i]) + 1;
                intermediateMap.put(textArray[i], value);
            } else {
                intermediateMap.put(textArray[i], 1);
            }
        }
        //Natural order
        TreeMap<Character, Integer> characterIntegerTreeMap = new TreeMap<Character, Integer>();
        characterIntegerTreeMap.putAll(intermediateMap);

        //Value order
        ValueComparator mapComparator = new ValueComparator(intermediateMap);
        TreeMap<Character, Integer> characterIntegerTreeMapValue = new TreeMap<Character, Integer>(mapComparator);
        characterIntegerTreeMapValue.putAll(characterIntegerTreeMap);

        Optional<StringBuilder> textResult = Optional.of(new StringBuilder());
        characterIntegerTreeMapValue.forEach((key, value) -> {
            textResult.get().append(createStringFromCountCharacter(key, value));
        });

        return textResult.get().toString();
    }

    static String createStringFromCountCharacter(char character, int count) {
        return StringUtils.repeat(character, count);
    }
}
