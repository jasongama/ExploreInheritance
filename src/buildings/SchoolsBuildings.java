package buildings;

public class SchoolsBuildings extends EducationBuildings {
    @Override
    public void BuildingColor() {
        System.out.println(" Blue");
    }

    @Override
    public int BuildingValue() {
        return 40000000;
    }
}
