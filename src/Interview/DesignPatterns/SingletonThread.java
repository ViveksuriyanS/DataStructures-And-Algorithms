package Interview.DesignPatterns;

public class SingletonThread {
    public static void main(String[] args) {
        SingletonT single = SingletonT.getInstance();

    }
}

class SingletonT {
    private static SingletonT obj; // Object should be private

    private SingletonT() { // Constructor should be private

    }

    // Double checked singleton
    public static SingletonT getInstance() { // Method should be "Static"
        if (obj == null) {
            synchronized (SingletonT.class) {
                if (obj == null) {
                    obj = new SingletonT();
                }
            }
        }
        return obj;
    }

    // Single check Singleton
    public synchronized  SingletonT getNewInstance() {
        if(obj == null) {
            obj = new SingletonT();
        }
        return obj;
    }
}
