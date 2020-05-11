package umesh.random;

import static java.lang.Math.abs;

/**
 * <pre>
 *     Given an array of Integer , you may assume every element appears twice except one.
 *     e.g. {1,12,12,45,1,45,3} should give 3.
 *
 *     Constraint : constant Space and time complexity O(n)
 *
 * </pre>
 */
public class FindElementComesOnce {

    public static int solutionForAllTwice(Integer a[]) {
        int result = 0;
        for (Integer integer : a) {
            result = result ^ integer;
        }
        return result;
    }

    /**
     * An array contains numbers. Exactly one number is duplicated in the array. Write java function to find this duplicate can use Runner Technique we take inspiration from
     * Floyd’s cycle-finding algorithm, we can derive the following algorithm: Initiate two pointers slow and fast For each step, slow is moving one step at a time with slow =
     * a[slow], whereas fast is moving two steps at a time with fast = a[a[fast]] When slow == fast, we are in a cycle
     */

    public static int solutionForOneTwice(Integer a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[abs(a[i])] > 0) {
                a[abs(a[i])] = -1 * a[abs(a[i])];
            }
            else {
                return abs(a[i]);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Integer a[] = {1, 9, 9, 1, 8, 12, 12, 8, 78, 78, 90};
        System.out.println(solutionForAllTwice(a));
        Integer b[] = {1, 8, 1, 8, 2, 5, 3, 6, 7};
        System.out.println(solutionForOneTwice(b));
    }
}
