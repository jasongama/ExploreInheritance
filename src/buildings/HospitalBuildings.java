package buildings;

public class HospitalBuildings extends HealthCareBuildings{
    @Override
    public void BuildingColor() {
        System.out.println(" White-Brown");
    }

    @Override
    public int BuildingValue() {
        return 550000000;
    }
}
