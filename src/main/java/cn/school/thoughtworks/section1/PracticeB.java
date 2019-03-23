package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> collections = new ArrayList<>();

        for (String collection : collection1) {
            for (List<String> collectionList : collection2) {
                if (collectionList.contains(collection)) {
                    collections.add(collection);
                }
            }

        }

        return collections;
    }
}
