public class Test {
    public static void main(String[] args) {

    }
}

class Singleton3 {
    private volatile static Singleton3 instance;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

}

class TowerOfHanoi2{
    public static void main(String args[]) {

    }

    void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n==0) {
            return;
        }
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Move last disk from A to C");
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
    }

}