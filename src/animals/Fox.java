package animals;

public class Fox extends Dog{
    @Override
    public void callSound() {
        System.out.println("Wow Wow Wow ");
    }

    @Override
    public int run() {
        return 72;
    }
}
