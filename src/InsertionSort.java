public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 8, 1, 2};
        InsertionSort is = new InsertionSort();
        is.sort(arr);

        for (int i=0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    void sort(int arr[]) {
        int n = arr.length;
        for (int i=1; i<n; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }

}
