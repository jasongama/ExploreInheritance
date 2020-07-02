package vehicles;

public class Suv extends Car{
    @Override
    public void brand() {
        System.out.println("Lamborghini Urus ");
    }

    @Override
    public int speed() {
        return 190;
    }
}
