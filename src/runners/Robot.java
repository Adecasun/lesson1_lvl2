package runners;

public class Robot implements Runnable {
    private String name;
    private int maxRunDistance;
    private int maxJumpHight;

    public Robot(String name, int maxRunDistance, int maxJumpHight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHight = maxJumpHight;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Робот " + name + " пробежал " + distance+"м");
            return true;
        } else {
            System.out.println("Робот " + name + " не пробежал " + distance + "м");
            return false;
        }

    }

    @Override
    public boolean jump(int distance) {
        if (distance <= maxJumpHight) {
            System.out.println("Робот " + name + " перепрыгнул " + distance+"м");
            return true;
        } else {
            System.out.println("Робот " + name + " не перепрыгнул " + distance + "м");
            return false;
        }


    }


}
