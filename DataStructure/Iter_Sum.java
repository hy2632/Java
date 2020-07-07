public class Iter_Sum {
    public static void main(String[] args){
		int[] A = new int[] {1,2,3};
		System.out.println(sum(A, 3));
	}

	static int sum(int[] A, int n){
		return ((n < 1)? 0 : sum(A,n-1) + A[n-1]);
	}
}