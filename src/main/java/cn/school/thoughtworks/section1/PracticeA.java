package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> collections = new ArrayList<>();

        for (String collection : collection1) {
            if (collection2.contains(collection)) {
                collections.add(collection);
            }

        }
        
        return collections;
    }
}
