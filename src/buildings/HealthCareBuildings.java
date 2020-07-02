package buildings;

public class HealthCareBuildings extends Buildings {
    @Override
    public void BuildingColor() {
        System.out.println(" Blue ");
    }

    @Override
    public int BuildingValue() {
        return 600000000;
    }
}
