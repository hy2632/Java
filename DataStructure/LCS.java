import java.util.Arrays;


public class LCS {
    // 最长公共子序列
    /* 
    0)递归基： 空序列。
    1）减而治之： 若A[n] = B[m]，末字符相同，则可同时约去
    2）若末字符不同，两种情况：A去尾和B， B去尾和A，看哪一个解更长
    */
    public static void main(String[] args){
        String A = "advantage";
        String B = "adversarial";
        char[] A_ch = A.toCharArray();
        char[] B_ch = B.toCharArray();
        int lcs_len = Solution(A_ch,B_ch);
        System.out.println(lcs_len);
    }
    private static int Solution(char[] A, char[] B){
        int lcs_len = 0;
        // 递归基别忘了写了
        if((A.length==0)|(B.length==0)){
            return 0;
        }
        char[] A_pre = Arrays.copyOfRange(A, 0, A.length-1);
        char[] B_pre = Arrays.copyOfRange(B, 0, B.length-1);
        if (A[A.length-1] == B[B.length-1]){
            lcs_len = 1 + Solution(A_pre, B_pre);
        }else{
            lcs_len = max(Solution(A_pre,B), Solution(A,B_pre));
        }
        return lcs_len;
    }
    private static int max(int A, int B){
        return (A>=B)?A:B;
    }
}