package Interview;

public class ThreadRunTime {
    public static void main(String[] args) {
        A1 a = new A1();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                a.m1();
            }
        }) ;
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                a.m2();
            }
        });
        t.start();t1.start();
    }
}

class A1 {
    public synchronized static void m1(){
        System.out.println("In M1 -> A");
    }
    public synchronized void m2(){
        System.out.println("In M2 -> A");
    }
}

