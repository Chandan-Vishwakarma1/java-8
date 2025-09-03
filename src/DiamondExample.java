public interface DiamondExample {
  public void m2();
}

interface Diamond2{
    public void m2();
}

class TestDemo implements DiamondExample,Diamond2{

    @Override
    public void m2(){
        System.out.println("my own implemention");
    }
    public static void main(String[] args) {

        TestDemo testDemo  = new TestDemo();
        testDemo.m2();
    }
}
