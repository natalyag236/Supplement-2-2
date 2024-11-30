import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        List<Integer> list1 = Arrays.asList(10, 7, 8, 9, 1, 5);
        BubbleSort.bubbleSort(list1);
        assertEquals(Arrays.asList(1, 5, 7, 8, 9, 10), list1);

        List<Integer> list2 = Arrays.asList();
        BubbleSort.bubbleSort(list2);
        assertEquals(Arrays.asList(), list2);

        List<Integer> list3 = Arrays.asList(42);
        BubbleSort.bubbleSort(list3);
        assertEquals(Arrays.asList(42), list3);

        List<Integer> list4 = Arrays.asList(5, 3, 3, 9, 5, 1, 4);
        BubbleSort.bubbleSort(list4);
        assertEquals(Arrays.asList(1, 3, 3, 4, 5, 5, 9), list4);
    }
}
