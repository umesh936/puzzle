package umesh.sorting;

public class SelecctionSort {
	public static int[] solution(int[] A)
	{
		for(int i =0; i<A.length;i++)
			for(int j =i+1; j<A.length;j++)
			{
				if(A[j]<A[i]){
					int tmp = A[i];
					A[i] =A[j];
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
