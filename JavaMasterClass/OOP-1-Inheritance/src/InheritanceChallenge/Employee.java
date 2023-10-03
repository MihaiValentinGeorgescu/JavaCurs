package InheritanceChallenge;

public class Employee extends Worker{

    private long employeeId;
    private String hireDate;

    private static int employeeN0 = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeN0++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }


    public double collectPay() {
        return 0;
    }
}
