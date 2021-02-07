package runners;

public class Cat implements Runnable {
    private String name;
    private int maxRunDistance;
    private int maxJumpHight;


    public Cat(String name, int maxRunDistance, int maxJumpHight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHight = maxJumpHight;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Кот " + name + " пробежал " + distance + "м");
            return true;
        } else {
            System.out.println("Кот " + name + " не пробежал " + distance + "м");
            return false;
        }

    }

    @Override
    public boolean jump(int distance) {
        if (distance <= maxJumpHight) {
            System.out.println("Кот " + name + " перепрыгнул " + distance);
            return true;
        } else {
            System.out.println("Кот " + name + " не перепрыгнул " + distance + "м");
            return false;
        }

    }

}
