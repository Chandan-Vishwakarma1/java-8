import java.util.ArrayList;

public class EmsWithPredicate {

    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<Employee>();

        Employee e1 = new Employee("Chandan","Software Engineer",50000.0,"Pune");
        Employee e2 = new Employee("Ajit", "QA Analyst", 45000.0, "Mumbai");
        Employee e3 = new Employee("Amit", "DevOps Engineer", 60000.0, "Hyderabad");
        Employee e4 = new Employee("Mohan", "UI/UX Designer", 48000.0, "Bangalore");
        Employee e5 = new Employee("Rahul", "Project Manager", 75000.0, "Chennai");
        Employee e6 = new Employee("Nikhil", "Data Scientist", 82000.0, "Delhi");



    }
}

class Employee{
    String name;
    String designation;
    double salary;
    String city;

    public Employee(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %.2f, %s", name, designation, salary, city);
    }
}