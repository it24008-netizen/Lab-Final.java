package EncapsulationValidation;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(101);
        s1.setName("Rafi");
        s1.setCgpa(3.75); // Valid
        s1.setCgpa(5.0);  // Invalid

        System.out.println("ID: " + s1.getId());
        System.out.println("Name: " + s1.getName());
        System.out.println("CGPA: " + s1.getCgpa());
    }
}