import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // System.out.println("nextLine方式接收: ");
        // // nextLine可以包含空白
        // if (scan.hasNextLine()){
        //     String str1 = scan.nextLine();
        //     System.out.println("输入的数据为： " + str1);
        // }


        // 平均数
        double sum = 0;
        int m = 0;
        while (scan.hasNextInt()){
            sum += scan.nextInt();
            m+=1;
        }
        System.out.println("总和是： " + sum);
        System.out.println("平均数是： " + (sum/m));
        scan.close();
    }
}