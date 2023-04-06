import java.util.Random;

public class People implements Runnable {
    private int length;
    private StringBuffer stringBuffer;
    private StringBuilder stringBuilder;

    public People(int length, StringBuffer stringBuffer) {
        super();
        this.length = length;
        this.stringBuffer = stringBuffer;
    }

    public People() {
        super();
    }

    public People(int length, StringBuilder stringBuilder) {
        super();
        this.length = length;
        this.stringBuilder = stringBuilder;
    }

    public void run() {
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            char c = (char) (r.nextInt(26) + 'a');
            stringBuilder.append(c);
        }
    }
}
