public class Sort {

    public static void sort(int[] a) {
        for (int i = 1; i < a.length; ++i) {
            int value = a[i];
            int j;

            for (j = i - 1; j >= 0; --j) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }

            a[j + 1] = value;
        }
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    static int partition(int[] a, int start, int end) {
        int value = a[end];
        int i = start - 1;
        for (int j = start; j < end; ++j) {
            if (a[j] < value) {
                swap(a, ++i, j);
            }
        }

        swap(a, i + 1, end);

        return i + 1;
    }

    static void quickSort(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }

        int middle = partition(a, start, end);

        quickSort(a, start, middle - 1);
        quickSort(a, middle + 1, end);
    }
}
