package runners;

public class Human implements Runnable {
    @Override
    public void run(int distance) {
        if(maxRunDistance <= distance){
            System.out.println("Человек успешно пробежал дистанцию");
        } else {
            System.out.println("Человек не смог пробежать дистанцию");
        }

    }

    @Override
    public void jump(int distance) {


    }

    private String name;
    private int maxRunDistance;
    private int maxJumpHight;
}
