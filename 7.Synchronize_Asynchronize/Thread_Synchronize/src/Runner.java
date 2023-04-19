public class Runner extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
