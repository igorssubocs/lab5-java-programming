public class Dog extends Mammal implements AnimalBehavior {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }

    @Override
    public void move() {
        System.out.println("Dog moves");
    }
}
