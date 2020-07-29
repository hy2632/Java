public class BinarySearch{
    public static void main(String[] args){
        int[] a = new int[] {1,2,5,10,13,14,19,20,25};
        System.out.println(BinSearch(a, 5));
    }
    private static int BinSearch(int[] array, int target){
        int mid = array.length >> 1;
        int left = 0;
        int right = array.length-1;
        
        while (target != array[mid]){
            if (left == right){
                return 0;
            }
            if (target > array[mid]){
                left = mid+1;
            }
            else {
                right =mid;
            }
            mid = (left+right) >> 1;
        }
        return mid;
    }
}