public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {7, 1, 6, 2, 5};
        MergeSort ms = new MergeSort();
        ms.sort(arr, 0, arr.length - 1);

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    void sort(int arr[], int p, int r) {
        if (p < r) {
            int q = (p+r)/2;

            sort(arr, p, q);
            sort(arr, q+1, r);

            merge(arr, p, q, r);
        }
    }

    void merge(int arr[], int p, int q, int r) {
        // Find sizes of two arrays
        int n1 = q - p + 1;
        int n2 = r - q;

        // Initiate two arrays to store
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Add values from the main array
        for (int i=0; i < n1; i++) {
            L[i] = arr[p+i];
        }
        for (int j=0; j < n2; j++) {
            R[j] = arr[q+1 + j];
        }

        // Initial indexes
        int i = 0, j = 0;

        int k = p;
        while (i < n1 && j < n2) {
//        for (int k=p; k<r; k++) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
