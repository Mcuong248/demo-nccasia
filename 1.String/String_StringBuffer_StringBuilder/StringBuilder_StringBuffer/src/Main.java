public class Main {
    public static void main(String[] args) {
        long starTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer("Hello");
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append("World");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuffer is: " + (endTime - starTime) + "ms" );

        long starTime1 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("Hello");
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("World");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("StringBuilder is: " + (endTime1 - starTime1) + "ms");
    }
}
