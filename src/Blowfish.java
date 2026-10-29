public class Blowfish extends Fish implements AnimalBehavior {
    public Blowfish(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println("Blowfish sleeps");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swim");
    }
}
