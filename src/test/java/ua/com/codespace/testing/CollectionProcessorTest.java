package ua.com.codespace.testing;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CollectionProcessorTest {
    
    private CollectionProcessor unit = new CollectionProcessor();

    @Test
    public void getListStingsStartWithAChar() throws Exception {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("bb", "cc", "ab", "d", "aa", "Aa"));
        List<String> result = unit.getListStingsStartWithAChar(input);
        List<String> expected = Arrays.asList("ab", "aa");
        assertEquals(expected, result);
    }

    @Test
    public void getListStingsStartWithACharNullValue() throws Exception {
        List<String> result = unit.getListStingsStartWithAChar(null);
        assertNull(result);
    }
}