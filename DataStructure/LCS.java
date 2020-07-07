import java.util.Arrays;

public class LCS {

    public static void main(String[] args) {
        String A = "abcde";
        String B = "ace";
        char[] A_ch = A.toCharArray();
        char[] B_ch = B.toCharArray();
        int lcs_len = Solution_DP(A_ch, B_ch);
        System.out.println(lcs_len);
    }

    // 最长公共子序列
    /*
     * 0)递归基： 空序列。 1）减而治之： 若A[n] = B[m]，末字符相同，则可同时约去 2）若末字符不同，两种情况：A去尾和B，
     * B去尾和A，看哪一个解更长
     */
    private static int Solution(char[] A, char[] B) {
        int lcs_len = 0;
        // 递归基别忘了写了
        if ((A.length == 0) | (B.length == 0)) {
            return 0;
        }
        char[] A_pre = Arrays.copyOfRange(A, 0, A.length - 1);
        char[] B_pre = Arrays.copyOfRange(B, 0, B.length - 1);
        if (A[A.length - 1] == B[B.length - 1]) {
            lcs_len = 1 + Solution(A_pre, B_pre);
        } else {
            lcs_len = max(Solution(A_pre, B), Solution(A, B_pre));
        }
        return lcs_len;
    }

    private static int max(int A, int B) {
        return (A >= B) ? A : B;
    }

    /* 动态规划解法：把先前的数据存储起来 */
    private static int Solution_DP(char[] A, char[] B) {
        int[][] DP = new int[A.length + 1][B.length + 1];
        int lcs_len = 0;
        for (int j = 0; j < B.length + 1; j++) {
            DP[0][j] = 0;
        }
        for (int i = 0; i < A.length + 1; i++) {
            DP[i][0] = 0;
        }
        DP[1][1] = (A[0] == B[0]) ? 1 : 0;
        for (int i = 1; i < A.length + 1; i++) {
            for (int j = 1; j < B.length + 1; j++) {
                if (A[i - 1] == B[j - 1])
                    DP[i][j] = DP[i - 1][j - 1] + 1;
                else
                    DP[i][j] = max(DP[i - 1][j], DP[i][j - 1]);
            }
        }
        lcs_len = DP[A.length][B.length];
        return lcs_len;
    }
}