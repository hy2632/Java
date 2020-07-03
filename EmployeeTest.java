public class EmployeeTest {
    public static void main(String[] args){
        Employee John = new Employee("John");


        John.empAge(45);
        John.empDesignation("Engineer");
        John.empSalary(75000.00);

        // salary is private now
        // System.out.println(John.salary);
        John.printEmployee();
        // 类变量DEPARTMENT的访问方式
        System.out.println(Employee.DEPARTMENT+"平均工资: "+John.salary);

    }
}