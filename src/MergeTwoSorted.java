import java.util.*;
import java.util.HashMap;
public class MergeTwoSorted {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(100,"Amit");
        hm.put(102,"Ravi");
        hm.put(100,"chal");
    }

    void sort(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int arr3[] = new int[n1+n2];

        int i = 0, j =0;
        int k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }

    }
}
