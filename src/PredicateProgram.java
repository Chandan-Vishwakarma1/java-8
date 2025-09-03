import java.util.function.IntPredicate;

public class PredicateProgram {
    //to find even and greater than 5
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        IntPredicate p1 = i->i%2==0;
        IntPredicate p2 = i->i>5;

        for(int e:arr){
            if((p1.and(p2).test(e))){
                System.out.println("Even and greater than 5 are:"+e);
            }
        }
    }
}
