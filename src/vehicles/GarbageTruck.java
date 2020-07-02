package vehicles;

public class GarbageTruck extends Truck {
    @Override
    public void brand() {
        System.out.println("Garbage Truck ");
    }

    @Override
    public int speed() {
        return 96;
    }
}
