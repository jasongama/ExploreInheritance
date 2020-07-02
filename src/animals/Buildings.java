package animals;

public class Buildings implements Animal {
    @Override
    public void callSound() {
        System.out.println("howl");
    }

    public int run() {
        return 0;
    }

}
