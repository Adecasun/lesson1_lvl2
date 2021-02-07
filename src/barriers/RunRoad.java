package barriers;


public class RunRoad implements Obstacle{
     int distance;

    public RunRoad(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean action(Runnable r) {
        return r.run(distance);
    }
}
