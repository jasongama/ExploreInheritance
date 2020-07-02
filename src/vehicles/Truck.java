package vehicles;

public class Truck extends Vehicles {
    @Override
    public void brand() {
        System.out.println("Mercedes-Benz Actros");
    }

    @Override
    public int speed() {
        return 110;
    }
}
