package umesh.codeChallenege;

/**
 * <Pre>
 * This problem was asked by Facebook.
 *
 * Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
 *
 * For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
 *
 * 1, 1, 1 11, 1 1, 11
 *
 * You can assume that the messages are decodable. For example, '001' is not allowed.
 * </Pre>
 */
public class DailyCodeChallenge7 {

    private static Integer count = 0;

    public static int solution1(String decodedString) {
        System.out.println("working with : " + decodedString);
        if (decodedString.startsWith("0"))
            return 0;
        if (decodedString.length() <= 1) {
            return 1;
        }
        int result = solution1(decodedString.substring(1));
        if (Integer.parseInt(decodedString.substring(0, 2)) <= 26) {
            result = result + solution1(decodedString.substring(2));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution1("111"));
    }
}
