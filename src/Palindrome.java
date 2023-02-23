import java.util.HashSet;
import java.util.Set;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome rev = new Palindrome();
        rev.reverseInteger(523);
    }

    boolean isPalindrome(String str) {
        for (int i=0; i<=Math.floor(str.length()); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    int reverseInteger(int n) {
        int reverse = 0;
        int temp = n;
        while(temp!=0) {
            reverse = reverse*10 + temp%10;
            temp = (int) Math.floor(temp/10);
        }
        System.out.println(reverse);
        return reverse;
    }

    boolean findDuplicates(int arr[]) {
//        arr.sort(); // Merge sort or something
        for (int i=1; i<arr.length; i++) {
            if (arr[i-1] == arr[i]) {
                return false;
            }
        }
        return true;
    }

    boolean findDuplicates2(int arr[]) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int num: arr) {
            if (seen.contains(num)) {
                return true;
            }
        }
        return false;
    }
}
