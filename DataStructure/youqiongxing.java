import java.util.Arrays;

public class youqiongxing{
    public static void main(String[] args){
        int[] hs = Hailstone(165);
        System.out.println(Arrays.toString(hs));
    }

    public static int[] Hailstone(int n){
        if(n==1){
            int[] hs =  {1}; 
            return hs;
        }
        else if(n % 2 ==0){
            // 两数组合并
            int[] hs_right = Hailstone(n/2);
            int[] hs_left = {n};
            int[] hs = new int[hs_right.length+1];
            System.arraycopy(hs_left, 0, hs, 0, 1);
            System.arraycopy(hs_right, 0, hs, 1, hs_right.length);
            return hs;
        }else{
            int[] hs_right = Hailstone(3*n+1);
            int[] hs_left = {n};
            int[] hs = new int[hs_right.length+1];
            System.arraycopy(hs_left, 0, hs, 0, 1);
            System.arraycopy(hs_right, 0, hs, 1, hs_right.length);
            return hs;
        }
    }
}