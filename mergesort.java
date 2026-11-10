class MergeSort {
    void merge(int a[], int l, int m, int r) {
        int temp[] = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= r) {
            if (a[i] < a[j])
                temp[k++] = a[i++];
            else
                temp[k++] = a[j++];
        }
        while (i <= m)
            temp[k++] = a[i++];
        while (j <= r)
            temp[k++] = a[j++];
        for (i = 0; i < temp.length; i++)
            a[l + i] = temp[i];
    }

    void sort(int a[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(a, l, m);
            sort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    public static void main(String args[]) {
        int a[] = { 6, 5, 12, 10, 9, 1 };
        MergeSort obj = new MergeSort();
        obj.sort(a, 0, a.length - 1);
        System.out.println("Sorted Array:");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}