package umesh.codeChallenege;

/**
 * <pre>
 * This problem was asked by Amazon.
 *
 * There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the
 * staircase. The order of the steps matters.
 *
 * For example, if N is 4, then there are 5 unique ways:
 *
 * 1, 1, 1, 1
 * 2, 1, 1
 * 1, 2, 1
 * 1, 1, 2
 * 2, 2
 *
 * Bonus, What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X? For
 * example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time.
 * </pre>
 */
public class DailyCodeChallenge12_d {

    public static int solutionForStep1or2(int targetStep) {
        if (targetStep == 1 || targetStep == 0)
            return 1;
        return solutionForStep1or2(targetStep - 1) + solutionForStep1or2(targetStep - 2);
    }

    public static int solutionForStepArray(int stairLength, int[] possibleStep) {
        if (stairLength == 1 || stairLength == 0)
            return 1;
        int result = 0;
        for (int stepCounter = 0; stepCounter < possibleStep.length; stepCounter++) {
            if (stairLength - possibleStep[stepCounter] > 0)
                result = result + solutionForStepArray(stairLength - possibleStep[stepCounter], possibleStep);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solutionForStep1or2(4));
        System.out.println(solutionForStepArray(4, new int[]{1, 2}));
    }


}
