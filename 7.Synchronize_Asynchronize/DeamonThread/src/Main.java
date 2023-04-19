public class Main {
    public static void main(String[] args) {
        TestThread t = new TestThread();
        TestThread t2 = new TestThread();
        TestThread t3 = new TestThread();
        t.setName("a");
        t2.setName("b");
        t3.setName("c");

        // deamon thread là thread chạy ngầm như chương trình dọn rác
        t.setDaemon(true);
    }
}
