package umesh.random;

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

    public static int solution(Integer a[]) {
        int result = 0;
        for (Integer integer : a) {
            result = result ^ integer;
        }
        return result;
    }

    public static void main(String[] args) {
        Integer a[] = {1, 9, 9, 1, 8, 12, 12, 8, 78, 78, 90};
        System.out.println(solution(a));
    }
}
