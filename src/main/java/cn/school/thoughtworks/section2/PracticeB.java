package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<>();

        for (String collection : collection1) {
            if (result.containsKey(collection)) {
                result.put(collection, result.get(collection) + 1);
            } else {
                if (collection.contains("-")) {
                    result.put(collection.split("-")[0], Integer.valueOf(collection.split("-")[1]));
                } else {
                    result.put(collection, 1);
                }
            }
        }

        return result;
    }
}
