public class Fib {
    public static void main(String[] args) {
        calculateFib(4);
    }

    static int calculateFib(int n) {
        if (n <= 1) {
            return n;
        }
        return calculateFib(n-1) + calculateFib(n-2);
    }
}
