import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 46, 12, 32, 4, 5, 46, 8, 585, 4, 43, 1, 2, 23, 5553, 2, 12123, 4, 355, 34, 223, 24, 23, 4, 4, 35};
        TreeSet<Integer> arrSet = new TreeSet<>();
        TreeMap<Integer, String> arrMap = new TreeMap<>();
        long startTime = System.nanoTime();
        for (Integer i : arr) {
            arrSet.add(i);
        }
        System.out.println(arrSet);
        long endTime = System.nanoTime();
        long timeSet = (endTime - startTime);
        System.out.println("Time Set: " + timeSet);

        long startTime1 = System.nanoTime();
        for (Integer i : arr) {
            arrMap.put(i, "value");
        }
        System.out.println(arrMap);
        long endTime1 = System.nanoTime();
        long timeMap = (endTime1 - startTime1);
        System.out.println("Time Map: " + timeMap);

        if (timeSet < timeMap) {
            System.err.println("Set nhanh hơn Map");
        } else
            System.err.println("Map nhanh hơn Set");
    }
}
