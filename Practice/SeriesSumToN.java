package Practice;

import java.util.*;
import java.lang.Math;
// https://blog.csdn.net/qq_42894896/article/details/82182775

// 31、和为n 连续正数序列

// 题目：输入一个正数n，输出所有和为n 连续正数序列。

// 例如输入15，由于1+2+3+4+5=4+5+6=7+8=15，所以输出3 个连续序列1-5、4-6 和7-8。

public class SeriesSumToN {
    public static void main(final String[] args){
        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        // k为序列起点数
        // 至少两个连续数，n%2!=0 ? (n-1)/2 (n+1)/2; 2k+1
        // 三个连续数， n%3 == 0 ? (n-3)/3, n/3, (n+3)/3; 3k+(1+2) = 3k+3
        // 4个连续数?  4k+(1+2+3) = 4k+6
        // i 个连续数? n = ik + i(i-1)/2  
        // 终点：直到1是最小值

        int k = 0; // k为序列起点数
        // 项数i最大可能多大？数组需要开多长？ 根据公式，n = ik+i(i-1)/2
        // 放缩，i < sqrt(2n)
        int max_length = (int) Math.sqrt(2*n);
        // int [] Series = new int[max_length];
        int i = 2; // i为序列项数
        // for(i=2; (n-i*(i-1)/2)>=i; i++){
        for(i=max_length; i>=2; i--){
            if  ((n-i*(i-1)/2) % i == 0){
                k = (n-i*(i-1)/2) / i;
            }
            else continue;
            // 找到这样的k和i以后
            final int[] Series = new int[i];
            // 实现一下range
            for(int idx = 0; idx < i; idx++){
                Series[idx] = k+idx;
                }
            System.out.println(Arrays.toString(Series));
            }
        }
}