package ua.com.codespace.testing;

import java.util.List;
import java.util.stream.Collectors;

public class CollectionProcessor {

    public List<String> getListStingsStartWithAChar(List<String> collection) {
        if(collection == null) {
            return null;
        }
        return collection.stream()
                .filter(element -> element.startsWith("a") )
                .collect(Collectors.toList());
    }
}
