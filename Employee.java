import java.util.Scanner;

public class Employee {
    private int ID;
    private String firstName;
    private String lastName;
    private int salaryMonthly;

    Employee() {
    }

    public void setID(int iD) {
        ID = iD;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalaryMonthly(int salaryMonthly) {
        this.salaryMonthly = salaryMonthly;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalaryMonthly() {
        return salaryMonthly;
    }

    String getFullName() {
        return firstName + " " + lastName;
    }

    int getSalaryYearly() {
        return salaryMonthly * 12;
    }

    void ShowInformation() {
        System.out.printf("ID : %d\nName : %s\nSalary of Month : %d", ID, getFullName(), salaryMonthly);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ID : ");
        employee.setID(scanner.nextInt());
        System.out.println("Input first name : ");
        employee.setFirstName(scanner.nextLine());
        System.out.println("Input last name : ");
        employee.setLastName(scanner.nextLine());
        System.err.println("Input Salary of month : ");
        employee.setSalaryMonthly(scanner.nextInt());
        scanner.close();
        employee.ShowInformation();
    }
}
