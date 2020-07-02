package buildings;

public class Clinics extends HealthCareBuildings {
    @Override
    public void BuildingColor() {
        System.out.println(" Red and White");
    }

    @Override
    public int BuildingValue() {
        return 500000000;
    }

}
