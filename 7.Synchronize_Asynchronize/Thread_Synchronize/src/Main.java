public class Main {
    public static void main(String[] args) {
//        Runner r1 = new Runner();
//        r1.start();
//        Runner r2 = new Runner();
//        r2.start();

        TestThread t = new TestThread();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();
    }
}


