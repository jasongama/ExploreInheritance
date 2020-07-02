package vehicles;


public class Main {
    public static void main(String[] args) {

        Vehicles[] vehicles = new Vehicles[6];
        vehicles[0] = new Car();
        vehicles[1] = new SportCar();
        vehicles[2] = new Suv();
        vehicles[3] = new Truck();
        vehicles[4] = new TankTruck();
        vehicles[5] = new GarbageTruck();

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].brand();

        }
    }
}
