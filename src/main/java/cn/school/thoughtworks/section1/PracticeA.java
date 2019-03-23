package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> collection = new ArrayList<>();
        for (String item : collection1) {
            for (String value : collection2) {
                if (item.equals(value)) {
                    collection.add(item);
                }
            }
        }
        return collection;
    }
}
