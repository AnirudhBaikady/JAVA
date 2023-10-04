
//program to find repeated array1
import java.util.HashMap;
import java.util.Map;

public class arr2 {
    public static void main(String[] args) {
        int[] numbers = { 1, 1, 2, 2, 3 };

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : numbers) {
            if (frequencyMap.containsKey(number)) {
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {
                frequencyMap.put(number, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Number " + entry.getKey() + " is repeated " + entry.getValue() + " times.");
        }
    }
}
