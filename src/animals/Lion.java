package animals;

public class Lion extends Cat {
    @Override
    public void callSound() {
        System.out.println("Roar ");
    }

    @Override
    public int run() {
        return 80;
    }
}
