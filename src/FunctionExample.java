import java.util.function.Function;
public class FunctionExample {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();

    }

    //check the length of string
    public static void example1(){
        Function<String,Integer> f = s->s.length();
        System.out.println(f.apply("Chandan"));
    }

    // to find the square of the given number
    public static void example2(){
        Function<Integer,Integer> f = i->i*i;
        System.out.println(f.apply(10));
    }

    // remove the spaces from the string
    public static void example3(){
        Function<String,String> f = s->s.replaceAll(" ","");
        System.out.println(f.apply("My name is Chandan"));
    }

    //to count the number of spaces present in the given string
    public static void example4(){
        Function<String, Integer> f = s->s.length()-s.replaceAll(" ","").length();
        System.out.println(f.apply("my name is chandan"));
    }

}



