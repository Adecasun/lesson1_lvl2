import barriers.Obstacle;
import barriers.RunRoad;
import barriers.Wall;
import runners.Cat;
import runners.Human;
import runners.Jumpble;
import runners.Robot;

public class Main {
    public static void main(String[] args) {


        Jumpble[] jumpbles = {
                new Human("Petya", 300, 20),
                new Cat("Vaska",500, 2),
                new Robot("C3PO", 5000, 10)

        };

        Obstacle[] obstacles = {
                new RunRoad(500),
                new Wall(1)
        };

        for(Jumpble j : jumpbles){
            for(Obstacle o : obstacles){
                if(!o.action(j)){
                    break;
                }
            }
        }






    }
}
