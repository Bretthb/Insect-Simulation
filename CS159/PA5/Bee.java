import java.util.Scanner;

/**
 * Bee.
 * 
 * @author Brett Bono
 * @version 4/15/2022
 *
 */
public class Bee extends Insect {

    protected double angleStd;

    /**
     * Bee.
     * 
     * @param scan scan
     */
    Bee(Scanner scan) {
        super(scan);
        angleStd = scan.nextDouble();
    }

    /**
     * Draw.
     */
    public void draw() {
        StdDraw.setPenColor(color);
        StdDraw.setPenRadius(.002);
        PoseUtils.drawPoseAsTriangle(pose, 10, 20);

    }

    /**
     * Find next position.
     * 
     * @return Pose
     */
    public Pose nextPose() {
        double x = Simulation.RNG.nextGaussian() * angleStd;
        return PoseUtils.move(new Pose(this.pose.getX(), this.pose.getY(),
                this.pose.getHeading() + x), speed);

    }


    /**
     * Update.
     */
    public void update() {

        this.pose = nextPose();
    }

}
