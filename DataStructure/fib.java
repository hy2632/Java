public class fib{
    public static void main(String[] args){
        int f = 0;
        int g = 1;
        int n = 3;
        while(1<n--){
            g = g+f;
            f = g-f;
        }
        System.out.println(g);
    }
}