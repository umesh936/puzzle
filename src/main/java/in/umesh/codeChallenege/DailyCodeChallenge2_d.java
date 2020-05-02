package umesh.codeChallenege;

/**
 * <pre>
 *
 * This problem was asked by Uber.
 *
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
 *
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 *
 * Follow-up: what if you can't use division?
 *
 * Solution concept :
 * {              1,         a[0],    a[0]*a[1],    a[0]*a[1]*a[2],  }
 * { a[1]*a[2]*a[3],    a[2]*a[3],         a[3],                 1,  }
 *
 * </pre>
 */
public class DailyCodeChallenge2_d {

    public static void solution1(Integer[] input) {

        Integer[] product = new Integer[input.length];

        int p = 1;
        for (int i = 0; i < input.length; ++i) {
            product[i] = p;
            p *= input[i];
        }
        p = 1;
        for (int i = input.length - 1; i >= 0; --i) {
            product[i] *= p;
            p *= input[i];
        }
        for (Integer integer : product) {
            System.out.print("\t "+ integer);
        }
    }

    public static void main(String[] args) {
        System.out.println("------  Test 1 --------");
        solution1(new Integer[]{1, 2, 3, 4, 5, 6});
    }
}
