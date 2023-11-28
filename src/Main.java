public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Akash", 101, 50000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Tomas", 102, 40, 100.0);
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Initial Employee Details: ");
        payrollSystem.displayEmployees();
        System.out.println("Removing employees");
        payrollSystem.removeEmployee(102);
        System.out.println("remainign emplyoes details: ");
        payrollSystem.displayEmployees();
    }
}
