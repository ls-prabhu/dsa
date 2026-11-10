import java.util.*;

class QuickSort {
    static int partition(int a[], int l, int h) {
        int p = a[h], i = l - 1;
        for (int j = l; j < h; j++)
            if (a[j] <= p) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        int t = a[i + 1];
        a[i + 1] = a[h];
        a[h] = t;
        return i + 1;
    }

    static void quickSort(int a[], int l, int h) {
        if (l < h) {
            int p = partition(a, l, h);
            quickSort(a, l, p - 1);
            quickSort(a, p + 1, h);
        }
    }

    public static void main(String[] args) {
        int a[] = { 8, 7, 2, 1, 0, 9, 6 };
        System.out.println("Unsorted: " + Arrays.toString(a));
        quickSort(a, 0, a.length - 1);
        System.out.println("Sorted: " + Arrays.toString(a));
    }
}