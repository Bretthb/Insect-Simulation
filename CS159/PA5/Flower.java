import java.util.Scanner;
import java.awt.Color;

/**
 * Flower.
 * 
 * @author Brett Bono
 * @version 4/15/2022
 */
public class Flower implements Actor {

    protected Color color;
    protected double[] x;
    protected double[] y;
    
    /**
     * constructor.
     * @param scan scan
     */
    public Flower(Scanner scan) {

        color = new Color(scan.nextInt(), scan.nextInt(), scan.nextInt());

        int cords = scan.nextInt();
        x = new double[cords];
        y = new double[cords];

        for (int b = 0; b < cords; b++) {
            x[b] = scan.nextDouble();
        }

        for (int b = 0; b < cords; b++) {
            y[b] = scan.nextDouble();
        }

    }

    @Override
    public void draw() {
        StdDraw.setPenColor(color);
        StdDraw.filledPolygon(x, y);

    }

    @Override
    public void update() {

    }

}
