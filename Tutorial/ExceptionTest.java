package Tutorial;

import java.io.FileInputStream;

public class ExceptionTest {
    public static void main(String[] args) {
        
        int[] a = new int[2];
        // 捕获异常
        try {
            System.out.println("Access Element Three: " + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        }
        finally{
            a[0] = 6;
            System.out.println("First element value: "+ a[0]);
            System.out.println("The finally statement is executed.");
        }
    }
}

// catch不能独立于try
// try后不能既无catch也无finally

// 可以定义异常类
