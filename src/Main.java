public class Main {
    public static void main(String[] args) {
        AnimalBehavior[] b = {
                new Dog("A"),
                new Pigeon("B"),
                new Blowfish("C")
        };
        b[0].sleep();
        b[1].sleep();
        b[2].sleep();

        Animal[] a = {
                new Bird("Bird"),
                new Mammal("Mammal"),
                new Fish("Fish"),
                new Pigeon("B"),
                new Dog("A"),
                new Blowfish("C")
        };

        for (Animal x : a) {
            x.move();
        }

        for (Animal x : a) {
            AnimalName.name(x.getName());
        }
    }
}
