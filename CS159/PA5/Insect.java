import java.awt.Color;
import java.util.Scanner;

/**
 * Insect Abstract.
 * @author Brett Bono
 * @version 4/15/2022
 */
public abstract class Insect implements Actor {
    protected Color color;
    protected double speed;
    protected Pose pose;

    /**
     * Constructor.
     * @param scan scan
     */
    Insect(Scanner scan) {
        color = new Color(scan.nextInt(), scan.nextInt(), scan.nextInt());
        speed = scan.nextDouble();
        pose = new Pose(Simulation.RNG.nextInt(800), 
                Simulation.RNG.nextInt(800),
                Math.toRadians(360) * Simulation.RNG.nextDouble());

    }
}
