package animals;

public class Lynx extends Cat  {
    @Override
    public void callSound() {
        System.out.println("low growls ");
    }

    @Override
    public int run() {
        return 82;
    }

}
