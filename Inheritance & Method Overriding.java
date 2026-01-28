class Employee {
    public double calculateSalary() {
        return 0.0;
    }
}

class FullTimeEmployee extends Employee {
    private double basicSalary;
    
    public FullTimeEmployee(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + 5000; 
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(20000);
        Employee e2 = new PartTimeEmployee(200, 80);

        System.out.println("Full Time Employee Salary: " + e1.calculateSalary());
        System.out.println("Part Time Employee Salary: " + e2.calculateSalary());
    }
}
