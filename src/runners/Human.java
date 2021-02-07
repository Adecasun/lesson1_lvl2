package runners;

public class Human implements Jumpble {

    private String name;
    private int maxRunDistance;
    private int maxJumpHight;

    public Human(String name, int maxRunDistance, int maxJumpHight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHight = maxJumpHight;
    }
    public Human(){
        this("Vasya",300,30);
    }

    @Override
    public boolean run(int distance) {
        if(distance <= maxRunDistance){
            System.out.println("Человек успешно пробежал дистанцию " + distance + "м");
            return true;
        } else {
            System.out.println("Человек не смог пробежать дистанцию "+ distance + "м");
            return false;
        }

    }

    @Override
    public boolean jump(int distance) {
        if(distance <= maxJumpHight){
            System.out.println("Человек по имени " + name+" успешно перепрыгнул препятствие высотой " + distance + "м");
            return true;
        } else {
            System.out.println("Человек по имени " + name+" не смог перепрыгнуть препятствие высотой " + distance + "м");
            return false;
        }


    }


}
