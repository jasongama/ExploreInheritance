package animals;

public class Main {
    public static void main(String[] args) {
        Buildings[] animals= new Buildings[6];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Fox();
        animals[3] = new Lion();
        animals[4] = new Lynx();
        animals[5] = new Wolf();

        for (int i = 0; i < animals.length; i++) {
            animals[i].callSound();

        }

    }
}
