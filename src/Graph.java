import javax.swing.*;
import java.awt.*;
import java.util.Random; // for random bar height and color generation

public class Graph extends JPanel {
    private int num_bars = 0;

    private float BAR_WIDTH = 10f; // defining as float only because instructions say so
    private int BAR_HEIGHT = 0;

    // Constructor
    public Graph(int num_bars) {
        this.num_bars = num_bars;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        // Extend using the Graphics2D library so we can add objects to the canvas
        super.paintComponent(graphics); //clear before re-drawing*
        Graphics2D g2 = (Graphics2D) graphics;

        // Calculate x and y coordinates of the intial bar based off of the frame x and y
        int x = (int) (this.getWidth() * 0.1);
        int y = (int) (this.getHeight() * 0.91);

        // Draw 10x10 grid with each square 30x30 pixels
        for (int gridX = 30; gridX <= 300; gridX += 30)
            for (int gridY = 30; gridY <= 300; gridY += 30) 
                g2.drawRect(gridX, gridY, 30, 30);

        //set y to the bottom of the grid
        final int GRIDBottom = 30 + 10 * 30;

        y = GRIDBottom; // for random heights and random colors
        Random random = new Random();

        // Draw 12 bars
        for (int i = 0; i < 12; i++) { //changed 12 to num_bars*
            // Get random height 0-200
            BAR_HEIGHT = random.nextInt(200);

            // Random colors
            float r = random.nextFloat();
            float g = random.nextFloat();
            float b = random.nextFloat();

            // Draw bars
            int rectangleWidth = (int) (BAR_WIDTH);
            int rectangleHeight = (int) (BAR_HEIGHT);
            Rectangle rectangle = new Rectangle(x, y - BAR_HEIGHT, rectangleWidth, rectangleHeight) ;
            g2.setColor(new Color(r, g, b));
            g2.fill(rectangle);

            // Bars are 20 pixels apart
            x = x + 20;
        }

    }
    //reprinting the bars as soon as the button is clicked
    public void Randomize() {
        Graphics2D g2 = (Graphics2D) this.getGraphics();
        int x = (int) (this.getWidth() * 0.1);
        int y = (int) (this.getHeight() * 0.91);

        Random random = new Random();
        for (int i = 0; i < 12; i++) { //changed 12 to num_bars*
            // Get random height 0-200
            BAR_HEIGHT = random.nextInt(200);

            // Random colors
            float r = random.nextFloat();
            float g = random.nextFloat();
            float b = random.nextFloat();

            // Draw bars
            int rectangleWidth = (int) (BAR_WIDTH);
            int rectangleHeight = (int) (BAR_HEIGHT);
            Rectangle rectangle = new Rectangle(x, y - BAR_HEIGHT, rectangleWidth, rectangleHeight);
            g2.setColor(new Color(r, g, b));
            g2.fill(rectangle);

            // Bars are 20 pixels apart
            x = x + 20;
            repaint(); //Calling re-print after button is clicked
        }
    }

}