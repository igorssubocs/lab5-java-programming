public class Pigeon extends Bird implements AnimalBehavior {
    public Pigeon(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println("Pigeon sleeps");
    }

    @Override
    public void move() {
        System.out.println("Pigeon fly");
    }
}
