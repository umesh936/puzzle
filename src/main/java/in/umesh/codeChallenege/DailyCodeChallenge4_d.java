package umesh.codeChallenege;

/**
 * <Pre>
 *
 * This problem was asked by Stripe.
 *
 * Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in
 * the array. The array can contain duplicates and negative numbers as well.
 *
 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
 *
 * You can modify the input array in-place.
 *
 * Since the first missing positive number must be between 1 and len(array) + 1 (why?), we can ignore any negative numbers and numbers bigger than len(array).
 * The basic idea is to use the indices of the array itself to reorder the elements to where they should be.
 * We traverse the array and swap elements between 0 and the length of the array to their value’s index.
 * We stay at each index until we find that index’s value and keep on swapping.
 * </Pre>
 */
public class DailyCodeChallenge4_d {


    // Function to find smallest positive
    // missing number.
    static int findMissingNo(int[] arr, int n) {
        // to store current array element
        int val;

        // to store next array element in
        // current traversal
        int nextval;

        for (int i = 0; i < n; i++) {

            // if value is negative or greater
            // than array size, then it cannot
            // be marked in array. So move to
            // next element.
            if (arr[i] <= 0 || arr[i] > n)
                continue;

            val = arr[i];

            // traverse the array until we
            // reach at an element which
            // is already marked or which
            // could not be marked.
            while (arr[val - 1] != val) {
                nextval = arr[val - 1];
                arr[val - 1] = val;
                val = nextval;
                if (val <= 0 || val > n)
                    break;
            }
        }

        // find first array index which is
        // not marked which is also the
        // smallest positive missing
        // number.
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        // if all indices are marked, then
        // smallest missing positive
        // number is array_size + 1.
        return n + 1;
    }

    // Driver code
    public static void main(String[] args) {
        int arr[] = {200, 300, 700, 600, 800, 100, -10, 1500};
        int arr_size = arr.length;

        int missing = findMissingNo(arr, arr_size);

        System.out.println("The smallest positive"
            + " missing number is " + missing);
    }


}
