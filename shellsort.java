class ShellSort {
    public static void main(String args[]) {
        int a[] = { 6, 5, 12, 10, 9, 1 };
        int n = a.length;
        for (int gap = n / 2; gap > 0; gap = gap / 2) {
            for (int i = gap; i < n; i++) {
                int temp = a[i];
                int j;
                for (j = i; j >= gap && a[j - gap] > temp; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j] = temp;
            }
        }
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}