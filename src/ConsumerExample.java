import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<Integer> c1 = i-> System.out.println(i*i);
        c1.accept(2);

        List<Integer> l1 = Arrays.asList(1,2,3,4,5);
        l1.forEach(c1);
    }
    //ConsumerExample will take one input and return nothing
    //it is generally used for logging printing or modifying object.

}
