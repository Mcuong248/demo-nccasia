import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        int n = 100000;

        for (int i = 0; i < n; i++) {
            linkedHashMap.put(i, "Value " + i);
            linkedHashSet.add(i);
        }

        long startTime1 = System.nanoTime();
        for (int key : linkedHashMap.keySet()) {
            String value = linkedHashMap.get(key);
        }
        long endTime1 = System.nanoTime();
        long timeSet = (endTime1 - startTime1) / 1000000;

        long startTime2 = System.nanoTime();
        for (int element : linkedHashSet) {
            int value = element;
        }
        long endTime2 = System.nanoTime();
        long timeMap = (endTime2 - startTime2) / 1000000;

        System.out.println("LinkedHashMap " + timeMap + "ms");
        System.out.println("LinkedHashSet " + timeSet + "ms");
        if (timeSet < timeMap) {
            System.err.println("Set nhanh hơn Map");
        } else
            System.err.println("Map nhanh hơn Set");
    }
}

