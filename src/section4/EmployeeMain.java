package section4;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.firstName = "Rohit";
        employee.lastName = "Naagr";
        employee.age = 30;
        employee.gender = 'M';

        employee.getAge();
        System.out.println(employee.getAge());
        System.out.println(employee.getGender());
    }
}
