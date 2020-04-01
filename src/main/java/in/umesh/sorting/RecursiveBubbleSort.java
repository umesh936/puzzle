package umesh.sorting;

public class RecursiveBubbleSort {
	public static void solution(int[] A, int length) {
		if (length == 1)
			return;

			for (int j = 0; j < length; j++)
				if (A[j] > A[j+1]) {
					int tmp = A[j+1];
					A[j+1] = A[j];
					A[j] = tmp;
				}
			solution(A,length-1);

	}

	public static void main(String[] args) {
		int A[] = { 2, 5, 8, 2, 4, 5 };
		solution(A,A.length-1);
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + ",");
		}
	}

}
