import java.util.ArrayList;

public class PayrollSystem {

    private ArrayList<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void removeEmployee(int id){
        //I want to remove an employee of type Employee
        Employee employeeToRemove = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == id){
                employeeToRemove = employee;
                System.out.println(employeeToRemove);
                break;
            }
        }
        if (employeeToRemove != null) {
            employeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployees(){
        for (Employee employee: employeeList) {
            System.out.println(employee);
        }
    }
}
