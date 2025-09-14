package supplier;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumber {

    public static void main(String[] args) {
        Supplier<Integer> s = () -> new Random().nextInt(100);
        System.out.println("Random number: "+s.get());
        System.out.println("Random number: "+s.get());
        System.out.println("Random number: "+s.get());
        System.out.println("Random number: "+s.get());
    }
}
