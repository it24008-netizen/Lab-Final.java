package InheritanceOverriding;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();

        e1.calculateSalary(); // Runtime polymorphism
        e2.calculateSalary();
    }
}