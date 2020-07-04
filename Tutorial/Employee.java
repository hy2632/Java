import java.io.*;

public class Employee {
    String name, designation;
    int age;
    public double salary;

    //实例变量，私有，子类不可见
    // private double salary;
    // 类变量（静态变量），类中，方法之外。可通过ClassName.VariableName访问
    // public static double salary;
    // 不随实例变化，类的固定值。
    public static final String DEPARTMENT = "开发人员";


    public Employee(String name){
        this.name = name;
    }

    public void empAge(int empAge){
        // this.age = empAge;
        age = empAge;
    }

    public void empDesignation(String empDesig){
        designation = empDesig;
    }

    public void empSalary(double empSalary){
        salary = empSalary;
    }

    public void printEmployee(){
        System.out.println("名字:"+ name );
        System.out.println("年龄:" + age );
        System.out.println("职位:" + designation );
        System.out.println("薪水:" + salary);
    }
}

