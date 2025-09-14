package supplier;

import java.util.Random;
import java.util.function.Supplier;

public class OtpGeneration {

    public static void main(String[] args) {

        Supplier<String> s = ()->{
        StringBuilder otp = new StringBuilder();
        for(int i=0;i<6;i++){
            otp.append(new Random().nextInt(10));
        }
        return otp.toString();};

        System.out.println(s.get());

    }

}
