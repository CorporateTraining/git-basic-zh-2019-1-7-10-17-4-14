package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        Map<String, Integer> result = new HashMap<>();

        for (String collection : collectionA) {
            if (result.containsKey(collection)) {
                result.put(collection, result.get(collection) + 1);
            } else {
                result.put(collection, 1);
            }
        }
        for (String item : object.get("value")) {
            if (result.containsKey(item)) {
                result.put(item, result.get(item) - (result.get(item) / 3));
            }
        }

        return result;
    }
}
