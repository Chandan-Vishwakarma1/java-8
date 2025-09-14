package supplier;

import java.util.function.Supplier;

public class SupplierEx2 {

    public static void main(String[] args) {

        Supplier<String> s = ()->{
          String[] str = {"Chandan", "Alok","Goku","Yogi"};
          int x = (int) (Math.random()*4);
          return str[x];
        };

        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());

    }
}
