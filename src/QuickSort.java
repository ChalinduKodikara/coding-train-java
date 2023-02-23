public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {7, 1, 6, 2, 5};
        QuickSort qs = new QuickSort();
        qs.sort(arr, 0, arr.length - 1);

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    void sort(int arr[], int p, int r) {
        if (p < r) {
            // get the pivot element
            int q = partition(arr, p, r);

            // Seperately sort the two arrays
            sort(arr, p, q-1);
            sort(arr, q+1, r);
        }
    }

    int partition(int arr[], int p, int r) {
        int pivot = arr[p];

        int i = p;
        int j = r;
        while (true) {
            while (arr[j] > pivot) {
                j = j-1;
            }
            while (arr[i] < pivot) {
                i = i+1;
            }
            if (i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            else {
                return j;
            }
        }
    }
}
