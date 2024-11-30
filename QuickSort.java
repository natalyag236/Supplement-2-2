import java.util.List;

/**
 * A class that implements the QuickSort algorithm for sorting a list of integers.
 */
public class QuickSort {

    /**
     * Sorts the given list using the QuickSort algorithm.
     * 
     * @param list The list of integers to be sorted.
     *             If the list is null or has 1 or fewer elements, it is returned as-is.
     */
    public static void quickSort(List<Integer> list) {
        if (list == null || list.size() <= 1) {
            return;
        }
        quickSortHelper(list, 0, list.size() - 1);
    }

    /**
     * Helper method to recursively apply the QuickSort algorithm to sublists.
     * 
     * @param list The list of integers to be sorted.
     * @param low The starting index of the sublist to be sorted.
     * @param high The ending index of the sublist to be sorted.
     */
    private static void quickSortHelper(List<Integer> list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);

            quickSortHelper(list, low, pi - 1);
            quickSortHelper(list, pi + 1, high);
        }
    }

    /**
     * Partitions the list into two halves around a pivot element.
     * Elements smaller than or equal to the pivot are placed before it, and elements greater
     * than the pivot are placed after it.
     * 
     * @param list The list of integers to be partitioned.
     * @param low The starting index of the sublist to be partitioned.
     * @param high The ending index of the sublist to be partitioned.
     * @return The index of the pivot element after partitioning.
     */
    private static int partition(List<Integer> list, int low, int high) {
        int pivot = list.get(high); 
        int i = (low - 1);  

        for (int j = low; j < high; j++) {
            if (list.get(j) <= pivot) {
                i++;
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        int temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);

        return i + 1;  
    }
}
