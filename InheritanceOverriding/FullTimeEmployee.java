package InheritanceOverriding;

public class FullTimeEmployee extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Full-time salary: 40000 BDT");
    }
}