import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class QuickSortTest {

    @Test
    public void testQuickSort() {
        List<Integer> list1 = Arrays.asList(5, 9, 1, 10, 7, 8);
        QuickSort.quickSort(list1);
        assertEquals(Arrays.asList(1, 5, 7, 8, 9, 10), list1);

        List<Integer> list2 = Arrays.asList();
        QuickSort.quickSort(list2);
        assertEquals(Arrays.asList(), list2);

        List<Integer> list3 = Arrays.asList(42);
        QuickSort.quickSort(list3);
        assertEquals(Arrays.asList(42), list3);

        List<Integer> list4 = Arrays.asList(4, 1, 9, 3, 5, 3, 5);
        QuickSort.quickSort(list4);
        assertEquals(Arrays.asList(1, 3, 3, 4, 5, 5, 9), list4);
    }
}
