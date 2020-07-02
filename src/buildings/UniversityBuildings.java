package buildings;

public class UniversityBuildings extends EducationBuildings{
    @Override
    public void BuildingColor() {
        System.out.println(" Red and Blue");
    }

    @Override
    public int BuildingValue() {
        return 53000000;
    }
}
