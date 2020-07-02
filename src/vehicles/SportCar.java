package vehicles;

public class SportCar extends Car {
    @Override
    public void brand() {
        System.out.println("Ferrari 458 ");
    }

    @Override
    public int speed() {
        return 340;
    }
}
