import java.util.function.Predicate;
//multiple examples
public class PredicateExample {
    public static void main(String[] args) {

        String[] arr = {"Chandan", "Goku", "Karan", "Kartik"};

        Predicate<String> p = s -> s.startsWith("K");
//        or we can use charAt
//        Predicate<String> p1 = s->s.charAt(0)=='K';
        System.out.println("names start with K:");
        for (String s1 : arr) {
            if (p.test(s1)) {
                System.out.println(s1);
            }
        }
        validString();
        userAuth();
        walkingDrive();
    }


    public static void validString() {
        String[] names = {"Chandan", "", null, "", "Goku"};
        Predicate<String> p = s -> s != null && !(s.isEmpty());

        for (String s : names) {

            if (p.test(s)) {
                System.out.println(s);
            }
        }
    }

    public static void userAuth() {

        Predicate<User> p = user -> user.userName.equals("Chandan") && user.password.equals("goku");

        User user = new User("Chandan", "goku");
        if (p.test(user)) {
            System.out.println("Valid user");
        }
    }

    public static void walkingDrive() {
        SoftwareEngineer[] engineers = {new SoftwareEngineer("Chandan", 26, true),
                new SoftwareEngineer("Aisha", 29, false),
                new SoftwareEngineer("Ravi", 24, true),
                new SoftwareEngineer("Mei", 31, true),
                new SoftwareEngineer("Carlos", 28, false)
        };

        Predicate<SoftwareEngineer> p = se -> se.age > 18 && se.isHavingJava;

        for (SoftwareEngineer se : engineers) {
            if (p.test(se)) {
                System.out.println("Allowed for walking drive for " + se.toString());
            }
        }


    }
}

class User {
    String userName;
    String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

}

class SoftwareEngineer {
    String name;
    Integer age;
    boolean isHavingJava;

    public SoftwareEngineer(String name, Integer age, boolean isHavingJava) {
        this.name = name;
        this.age = age;
        this.isHavingJava = isHavingJava;
    }

    @Override
    public String toString() {
        return name;
    }
}
