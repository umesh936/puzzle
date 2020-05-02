package umesh.codeChallenege;

import static java.util.List.of;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 *
 * Bonus: Can you do this in one pass?
 * </pre>
 */
public class DailyCodeChallenge1_d {

    public static void solution1(List<Integer> input, Integer sum) {
        Map<Integer, Integer> map = new HashMap<>();
        if (sum == null || input.size() == 0)
            return;
        for (Integer num : input) {
            Integer pairObject = map.get(num);
            if (pairObject == null)
                map.put(sum - num, num);
            else {
                System.out.println("Pair Found: " + pairObject + ":" + num);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("------  Test 1 --------");
        solution1(of(10, 15, 3, 7), 17);
        System.out.println("------  Test 2 --------");
        solution1(of(-1, 0, 2, 6, 9, 10), 1);
        System.out.println("------  Test 3 --------");
        solution1(of(-1, 0, -2, -6, 9, 10), 1);
        System.out.println("------  Test 4 --------");
        solution1(of(-1, 0, 23, -13, 9, 90), 10);
    }

}
