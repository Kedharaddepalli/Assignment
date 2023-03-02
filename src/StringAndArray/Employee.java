package StringAndArray;

public class Employee {
    private static int nextEmployeeId = 1;

    private int employeeId;
    private String employeeName;
    private String department;
    private int experience;

    public Employee(String firstName, String lastName, String department, int experience) {
        this.employeeId = generateNextOddEmployeeId();
        this.employeeName = capitalizeName(firstName) + " " + capitalizeName(lastName);
        this.department = department;
        this.experience = experience;
    }

    private int generateNextOddEmployeeId() {
        int employeeId = nextEmployeeId;
        nextEmployeeId += 2;
        return employeeId;
    }

    private String capitalizeName(String name) {
        if (name != null && name.length() > 0) {
            return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        } else {
            return "";
        }
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public int getExperience() {
        return experience;
    }


    public double getTotalSalaryForDepartment() {
        double baseSalary = 200000.0;
        double salaryPerYear = 150000.0;

        double totalSalary = baseSalary + (salaryPerYear*experience);
        return totalSalary;
    }

    public String toString() {
        return "Employee ID: " + employeeId + "\nName: " + employeeName + "\nDepartment: " + department + "\nExperience: " + experience + " years\nGross Salary: INR " + getTotalSalaryForDepartment();
    }
    public static void main(String[] args) {
        Employee employee = new Employee("aruna", "surendar", "Sales", 11);
        System.out.println(employee.toString());
        System.out.println("--------------------");
        Employee employee1 = new Employee("kedhar", "addepalli", "Sales", 3);
        System.out.println(employee1.toString());
    }

}
