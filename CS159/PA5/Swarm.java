import java.util.Scanner;

/**
 * Swarm.
 * 
 * @author Brett Bono
 * @version 4/15/2022
 */
public class Swarm implements Actor {
    protected Bee queen;
    protected Bee[] drones;
    protected double maxTurnRate;
    
    /**
     * Constructor.
     * @param scan scan
     */
    public Swarm(Scanner scan) {
        int numdrones = scan.nextInt();
        queen = new Bee(scan);
        drones = new Bee[numdrones];

        String beequality = "" + scan.nextInt() + " " + scan.nextInt() + " "
                + scan.nextInt() + " " + scan.nextDouble() + " "
                + scan.nextDouble();
        maxTurnRate = scan.nextDouble();

        for (int b = 0; b < numdrones; b++) {
            Scanner bee = new Scanner(beequality);
            drones[b] = new Bee(bee);
        }

    }

    @Override
    public void draw() {
        queen.draw();
        for (int b = 0; b < drones.length; b++) {
            drones[b].draw(); 
        }

    }

    @Override
    public void update() {
        queen.update();

        for (int b = 0; b < drones.length; b++) {
            Point target = (Point) queen.pose;
            Pose newpos = PoseUtils.steer(drones[b].nextPose(), target,
                    maxTurnRate);
            drones[b].pose = newpos;

        }

    }
}
