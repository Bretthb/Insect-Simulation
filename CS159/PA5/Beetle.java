import java.util.Scanner;

/**
 * Beetle.
 * 
 * @author Brett Bono
 * @version 4/15/2022
 * 
 */
public class Beetle extends Insect {

    protected double turnProb;
    
    /**
     * constructor.
     * @param scan scan
     */
    Beetle(Scanner scan) {
        super(scan);
        turnProb = scan.nextDouble();
    }

    @Override
    public void draw() {
        StdDraw.setPenColor(color);
        StdDraw.filledCircle(this.pose.getX(), this.pose.getY(), 6);

    }

    @Override
    public void update() {
        if (Simulation.RNG.nextDouble() < turnProb) {
            this.pose = PoseUtils.move(
                    new Pose(this.pose.getX(), this.pose.getY(),
                            Math.toRadians(360) * Simulation.RNG.nextDouble()),
                    speed);
        } else {
            this.pose = PoseUtils.move(pose, speed);
        }

    }

}
