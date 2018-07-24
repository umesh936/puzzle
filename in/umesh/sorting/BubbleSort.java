package in.umesh.sorting;

public class BubbleSort {
	public static int[] solution(int[] A)
	{
		for(int i =0; i<A.length;i++)
			for(int j =0; j<A.length-i-1;j++)
			{
				if(A[j]>A[j+1]){
					int tmp = A[j+1];
					A[j+1] =A[j];
					A[j]=tmp;
				}
			}
		return A;
	}

	public static void main(String[] args) {
		int A[] = { 2, 5, 8, 2, 4, 5 };
		solution(A);
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + ",");
		}
	}
}
