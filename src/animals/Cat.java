package animals;

public class Cat extends Buildings {

    @Override
    public void callSound() {
        System.out.println("Meow ");
    }

    @Override
    public int run() {
        return 48;
    }
}
