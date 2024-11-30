import java.util.List;

public class BubbleSort {

  static void bubbleSort(List<Integer> list) {
        if (list == null || list.size() <= 1) {
            return;
        }

        int n = list.size();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (list.get(i - 1) > list.get(i)) {
                    int temp = list.get(i - 1);
                    list.set(i - 1, list.get(i));
                    list.set(i, temp);
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
}

