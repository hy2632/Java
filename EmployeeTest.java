public class EmployeeTest {
    public static void main(String[] args){
        Employee John = new Employee("John");

        John.empAge(45);
        John.empDesignation("Engineer");
        John.empSalary(75000.00);
        John.printEmployee();
    }
}