public class TestThread implements Runnable{
    public int tong;

    public TestThread(){
        this.tong = 1000;
    }

    public void rutTien() throws InterruptedException {
        System.out.println("a");
        synchronized (this) {
            if (tong > 0) {
                Thread.sleep(1000);
                tong = tong - 1000;
                System.out.println(tong);
            } else {
                System.out.println("Không đủ tiền để rút");
            }
        }
    }
    @Override
    public void run() {
        try {
            rutTien();
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
