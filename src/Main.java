import runners.Cat;
import runners.Human;
import runners.Robot;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Vasya", 300, 10);
        h1.run(3100);
        h1.jump(50);

        Cat cat1 = new Cat("Barsik", 200, 2);
        cat1.run(100);
        cat1.jump(10);

        Robot rob1 = new Robot("R2D2", 5000, 10);
        rob1.run(3000);
        rob1.jump(8);

    }
}
