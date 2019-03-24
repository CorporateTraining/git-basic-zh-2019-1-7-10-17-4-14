package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<>();
        for (String collection : collection1) {
            if (collection.length() > 1) {
                Integer elementNumber = getElementNumber(collection);
                String element = String.valueOf(collection.charAt(0));
                getElementsCount(result, element, elementNumber);
            } else {
                getElementsCount(result, collection, 1);
            }
        }

        return result;
    }

    private void getElementsCount(Map<String, Integer> result, String collection, int number) {
        if (result.containsKey(collection)) {
            result.put(collection, result.get(collection) + number);
        } else {
            result.put(collection, number);
        }
    }

    private Integer getElementNumber(String collection) {
        Pattern pattern = Pattern.compile("[^0-9]");
        Matcher matcher = pattern.matcher(collection);

        return Integer.valueOf(matcher.replaceAll(""));
    }
}
