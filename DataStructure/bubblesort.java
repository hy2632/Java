import java.util.Arrays;

public class bubblesort{
    public static void main(String[] args){
        int[] A = {1,1200,543,123,43657,234,12};
        System.out.println(Arrays.toString(Solution(A)));
    }
    public static int[] Solution(int[] A){
        int len = A.length;

        for (boolean sorted = false; sorted = !sorted; len--){
            //赋值语句会返回右值
            for(int i=1; i<len; i++){
                if (A[i-1] > A[i]){
                    int temp = A[i-1];
                    A[i-1] = A[i];
                    A[i] = temp;
                    sorted = false;
                }
            }
        }
        return A;
    }
}