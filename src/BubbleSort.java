public class BubbleSort {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        x = x + y;

        y = x-y;
        x = x-y;

        BubbleSort bs = new BubbleSort();
        int arr[] = {4, 5, 6, 8, 1, 2};
        bs.sort(arr);
        for (int i =0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    void sort(int arr[]) {
        int n = arr.length;
        boolean swapped;
        for (int j=n-1; j>=1; j--) {
            swapped = false;
            for (int i=1; i<=j; i++){
                if (arr[i] < arr[i-1]) {
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    swapped = true ;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
