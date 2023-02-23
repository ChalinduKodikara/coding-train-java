public class Rotate {
    public static void main(String[] args) {
        String ans = leftRotate("Chalindu", 2);

    }
    static String leftRotate(String str, int d) {
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
    }

    static String rightRotate(String str, int d) {
        return leftRotate(str, str.length()-d);
    }
}
