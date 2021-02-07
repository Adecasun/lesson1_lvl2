package barriers;


import runners.Jumpble;

public class RunRoad implements Obstacle{
     int distance;

    public RunRoad(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean action(Jumpble c) {
        return c.run(distance);
    }
}
