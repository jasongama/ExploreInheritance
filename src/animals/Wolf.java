package animals;

public class Wolf extends Dog{
    @Override
    public void callSound() {
        System.out.println("Howling ");
    }

    @Override
    public int run() {
        return 60;
    }
}
