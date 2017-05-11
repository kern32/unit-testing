package ua.com.codespace.testing;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionProcessor {

    public List<String> getListStingsStartWithAChar(List<String> collection) {
        Optional.ofNullable(collection).orElse(null);
        return collection.stream()
                .filter(element -> element.startsWith("a") )
                .collect(Collectors.toList());
    }
}
