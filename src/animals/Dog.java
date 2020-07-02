package animals;

public class Dog extends Buildings {
    @Override
    public void callSound() {
        System.out.println("Woof ");
    }

    @Override
    public int run() {
        return 70;
    }
}
