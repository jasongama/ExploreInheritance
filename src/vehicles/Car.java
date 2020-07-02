package vehicles;

public class Car extends Vehicles{
    @Override
    public void brand() {
        System.out.println("BMW M4 ");
    }

    @Override
    public int speed() {
        return 305;
    }
}
