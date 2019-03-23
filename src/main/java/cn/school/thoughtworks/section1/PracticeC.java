package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        List<String> collections = new ArrayList<>();

        for (String collection : collection1) {
            if (collection2.get("value").contains(collection)) {
                collections.add(collection);
            }

        }

        return collections;
    }
}
