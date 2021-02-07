package barriers;

import runners.Jumpble;

public class Wall implements Obstacle{
    private int hight;

    public Wall(int hight) {
        this.hight = hight;
    }

    @Override
    public boolean action(Jumpble c) {
        return c.jump(hight);
    }
}
