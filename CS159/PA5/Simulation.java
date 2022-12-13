import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**
 * Simulation Class.
 * 
 * @author Brett Bono
 * @version 4/15/2022
 */
public class Simulation {

    public static final Random RNG = new Random();
    protected Actor[] actors;
    
    /**
     * Contructor.
     * @param path path
     * @throws FileNotFoundException no file found
     */
    Simulation(String path) throws FileNotFoundException {

        Scanner in = new Scanner(new File(path));

        actors = new Actor[in.nextInt()];
        int location = 0;
        while (in.hasNextLine()) {

            switch (in.nextLine()) {

                case "bee":
                    actors[location] = new Bee(in);
                    location++;
                    break;

                case "swarm":
                    actors[location] = new Swarm(in);
                    location++;
                    break;

                case "beetle":
                    actors[location] = new Beetle(in);
                    location++;
                    break;

                case "flower":
                    actors[location] = new Flower(in);
                    location++;
                    break;

                default:
                    break;

            } 

        }
    }
    
    /**
     * draw.
     */
    public void draw() {
        for (int b = 0; b < actors.length; b++) {
            actors[b].draw();
        }
    }
    
    /**
     * draw.
     */
    public void update() {
        for (int b = 0; b < actors.length; b++) {
            actors[b].update();
        }
    }

}
