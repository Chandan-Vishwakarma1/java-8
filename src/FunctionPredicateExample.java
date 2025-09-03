import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionPredicateExample {
    public static void main(String[] args) {
        example1();
    }

    //to find the student grade using marks.
    //also apply predicate to print the student grade whose marks is greater than 80
    public static void example1() {
         Student[] std = {
                new Student("Chandan", 90),
                new Student("Ravi", 75),
                new Student("Sneha", 90),
                new Student("Amit", 65),
                new Student("Priya", 85)};

        Function<Student, String> f = s -> {
            int marks = s.marks;
            if (marks >= 80) {
                return "A";
            } else return "B";
        };

        Predicate<Student> p = s->s.marks>=80;
        for (Student s :std){
            if(p.test(s)) {
                System.out.println("Name: " + s.name);
                System.out.println("Marks: " + s.marks);
                System.out.println("Grade: " + f.apply(s));
            }

        }
    }

}

class Student {
    String name;
    Integer marks;

    public Student(String name, Integer marks) {
        this.name = name;
        this.marks = marks;
    }
}


