public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}

class SingletonEagerInitialization {
    private static SingletonEagerInitialization uniqueInstance = new SingletonEagerInitialization();

    private SingletonEagerInitialization() {}

    public static SingletonEagerInitialization getInstance() {
        return uniqueInstance;
    }
}

class SingletonDoubleCheck {
    private volatile static SingletonDoubleCheck uniqueInstance;

    private SingletonDoubleCheck() {}

    public static SingletonDoubleCheck getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonDoubleCheck();
                }
            }
        }
        return uniqueInstance;
    }
}



