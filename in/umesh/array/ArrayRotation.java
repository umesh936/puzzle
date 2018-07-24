package in.umesh.array;

/**
*  Puzzle here to solve the rotation of element around array by given number.
*
*
*
*
*/
import java.util.ArrayList;
import java.util.List;

public class ArrayRotation {

	public static int[] solution(int[] A, int K) {
		if (K == 0 || A.length == 0 || A.length == 1 || K == A.length)
			return A;
		int length = A.length;
		List<Integer> visted = new ArrayList<>();
		int i = 0, dest = 0, sour = 0, tmp = A[0], tmp1;
		while (i < length) {
			System.out.println("i: " + i);
			visted.add(sour);
			dest = sour + K;
			while (dest >= length) {
				dest = dest - length;
			}
			tmp1 = A[dest];
			A[dest] = tmp;
			tmp = tmp1;
			sour = dest;
			if (visted.contains(sour)) {
				sour++;
				if (sour >= length)
					sour = sour - length;
				tmp = A[sour];
			}
			i++;
			
		}
		return A;

	}

	public static void main(String[] args) {
		int a[] = { -10, -99, 45, 90, 47, 90 };
		solution(a, 3);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}
}
