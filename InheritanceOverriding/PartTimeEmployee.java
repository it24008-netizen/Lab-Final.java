package InheritanceOverriding;

public class PartTimeEmployee extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Part-time salary: 20000 BDT");
    }
}