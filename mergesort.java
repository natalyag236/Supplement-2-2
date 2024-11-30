import java.util.List;
import java.util.ArrayList;

public class mergesort {

    public static void mergeSort(List<Integer> list) {
        if (list == null || list.size() <= 1) {
            return;
        }
        mergeSortHelper(list, 0, list.size() - 1);
    }

    private static void mergeSortHelper(List<Integer> list, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSortHelper(list, low, mid);
            mergeSortHelper(list, mid + 1, high);
            merge(list, low, mid, high);
        }
    }

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
