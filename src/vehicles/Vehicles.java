package vehicles;

public class Vehicles implements Vehicle {
    @Override
    public void brand() {
        System.out.println("show brand name ");
    }

    @Override
    public int speed() {
        return 0;
    }
}
