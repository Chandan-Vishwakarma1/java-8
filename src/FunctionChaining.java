import java.util.function.Function;

public class FunctionChaining {

    public static void main(String[] args) {
        Function<String,String> f1 = s->s.toLowerCase();
        Function<String,String> f2 = s->s.substring(0,3);

        System.out.println("The result is: "+f1.andThen(f2).apply("Chandan"));
        System.out.println("The result is: "+f2.compose(f1).apply("Chandan"));
    }
}
