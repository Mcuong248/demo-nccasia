public class Main {
    public static void main(String[] args) throws Exception{
        TestThread t = new TestThread();
        t.setName("Thread1");

        TestThread t2 = new TestThread();
        t2.setName("Thread2");

        TestThread t3 = new TestThread();
        t3.setName("Thread3");

        t.start();
        try {
            t.join(1500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }
}
