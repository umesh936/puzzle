package umesh.random;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostFrequentInteger {


    public static void findFrequency(Integer a[]) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        if (a.length == 0) {
            System.out.println("Frequency 0");
            System.out.println("Number null");
            return;
        }

        for (int i = 0; i < a.length; i++) {
            if (freqMap.containsKey(a[i])) {
                Integer count = freqMap.get(a[i]) + 1;
                freqMap.put(a[i], count);
            }
            else {
                freqMap.put(a[i], 1);
            }
        }
        Integer number = Integer.MIN_VALUE;
        int frequency = Integer.MIN_VALUE;
        for (Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (frequency < entry.getValue()) {
                frequency = entry.getValue();
                number = entry.getKey();
            }
        }
        System.out.println("number : " + number);
        System.out.println("Frequency  : " + frequency);
    }

    public static void main(String[] args) {
        Integer a[] = {23, 456, 2, 13, 3, 3, 234, 1};
        findFrequency(a);
    }
}
