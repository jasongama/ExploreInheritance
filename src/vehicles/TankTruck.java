package vehicles;

public class TankTruck  extends Truck{
    @Override
    public void brand() {
        System.out.println("Tank Truck");
    }

    @Override
    public int speed() {
        return 70;
    }
}

