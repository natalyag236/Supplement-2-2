import java.util.List;
import java.util.ArrayList;

/**
 * A class that implements the MergeSort algorithm to sort a list of integers.
 */
public class mergesort {

    /**
     * Sorts the given list using the MergeSort algorithm.
     * This method divides the list into two halves and recursively sorts them.
     * 
     * @param list The list of integers to be sorted.
     *             If the list is null or has 1 or fewer elements, it is returned as-is.
     */
    public static void mergeSort(List<Integer> list) {
        if (list == null || list.size() <= 1) {
            return;
        }
        mergeSortHelper(list, 0, list.size() - 1);
    }

    /**
     * A helper method to divide the list into two halves and recursively apply the MergeSort algorithm.
     * It calls itself recursively on the two halves and then merges the sorted halves.
     * 
     * @param list The list of integers to be sorted.
     * @param low The starting index of the sublist to be sorted.
     * @param high The ending index of the sublist to be sorted.
     */
    private static void mergeSortHelper(List<Integer> list, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;

            mergeSortHelper(list, low, mid);
            mergeSortHelper(list, mid + 1, high);

            merge(list, low, mid, high);
        }
    }

    /**
     * Merges two sorted sublists into one sorted list.
     * The method combines the elements from the left and right sublists while maintaining sorted order.
     * 
     * @param list The list of integers to be sorted.
     * @param low The starting index of the sublist to be merged.
     * @param mid The midpoint index of the list, dividing the sublist into two halves.
     * @param high The ending index of the sublist to be merged.
     */
    private static void merge(List<Integer> list, int low, int mid, int high) {
        List<Integer> left = new ArrayList<>(list.subList(low, mid + 1));
        List<Integer> right = new ArrayList<>(list.subList(mid + 1, high + 1));

        int i = 0, j = 0, k = low;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            list.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            list.set(k++, right.get(j++));
        }
    }
}
