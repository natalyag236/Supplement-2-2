import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        List<Integer> list1 = Arrays.asList(10, 9, 8, 7, 6, 7);
        MergeSort.mergeSort(list1);
        assertEquals(Arrays.asList(1, 2, 7, 6, 23, 99), list1);

        List<Integer> list2 = Arrays.asList();
        MergeSort.mergeSort(list2);
        assertEquals(Arrays.asList(), list2);

        List<Integer> list3 = Arrays.asList(23);
        MergeSort.mergeSort(list3);
        assertEquals(Arrays.asList(23), list3);

        List<Integer> list4 = Arrays.asList(5, 3, 3, 9, 5, 1, 4);
        MergeSort.mergeSort(list4);
        assertEquals(Arrays.asList(1, 3, 3, 4, 5, 5, 9), list4);
    }
}
