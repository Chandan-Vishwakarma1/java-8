import java.util.function.Function;

public class FunctionIdentityMethod {

    public static void main(String[] args) {

        Function<String,String> f1 = Function.identity();
        String s2=f1.apply("Chandan");
        System.out.println(s2);
    }
}
