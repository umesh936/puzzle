package umesh.codeChallenege;

/**
 * <pre>
 *
 *     Given two arrays which are duplicates of each other except one element,
 *     that is one element from one of the array is missing, we need to find that missing element.
 *
 * Examples:
 *
 * Input:  arr1[] = {1, 4, 5, 7, 9}
 *         arr2[] = {4, 5, 7, 9}
 * Output: 1
 * 1 is missing from second array.
 *
 * Input: arr1[] = {2, 3, 4, 5}
 *        arr2[] = {2, 3, 4, 5, 6}
 * Output: 6
 * 6 is missing from first array.
 * </pre>
 */
public class DailyCodeChallenge5_d {


    public static void findMissing(Integer[] fullSet, Integer[] partialSet) {
        if (fullSet.length < partialSet.length - 1) {
            System.out.println(" Input Invalid");
        }
        Integer xorSum = 0;
        for (int index = 0; index < fullSet.length; index++) {
            xorSum = xorSum ^ fullSet[index];
        }
        for (int index = 0; index < partialSet.length; index++) {
            xorSum = xorSum ^ partialSet[index];
        }
        System.out.println("Missing Element in : " + xorSum);
    }

    public static void main(String[] args) {
        Integer[] fullList = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] partialList = new Integer[]{1, 2, 3, 5, 4, 7, 8, 9};
        findMissing(fullList, partialList);
    }
}
