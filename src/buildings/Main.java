package buildings;
public class Main {
    public static void main(String[] args) {
        Buildings[] buildings= new Buildings[6];
        buildings[0] = new EducationBuildings();
        buildings[1] = new UniversityBuildings();
        buildings[2] = new SchoolsBuildings();
        buildings[3] = new HealthCareBuildings();
        buildings[4] = new HospitalBuildings();
        buildings[5] = new Clinics();

        for (int i = 0; i < buildings.length; i++) {
            buildings[i].BuildingColor();

        }
    }
}
