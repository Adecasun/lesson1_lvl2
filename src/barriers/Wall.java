package barriers;

public class Wall implements Obstacle{
    private int hight;

    public Wall(int hight) {
        this.hight = hight;
    }

    @Override
    public boolean action(Runnable c) {
        return true;
    }
}
