import javax.swing.*;
import java.awt.*;//in-order to use Flow Layout
public class Main {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame() ;

        // Set the size, title, and exit operationframe.  Open at the center of the screen
        frame.setTitle("Random Bar Chart");
        frame.setSize(400, 400) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // this will cause the frame to open in the middle of the screen instead of top left corner

        // Instantiate a new JComponent object, then make the JFrame visible
        Graph barChart = new Graph(10);
        frame.add(barChart);  
        frame.setVisible(true);

        //creating a "Redraw" button
        JButton Redraw = new JButton("Redraw");
        //each time the button is clicked, a new bar graph is created
        Redraw.addActionListener(e->barChart.repaint());

        JPanel south = new JPanel(new FlowLayout(FlowLayout.CENTER));
        south.setBorder(BorderFactory.createEmptyBorder(8, 0, 8, 0));
        south.add(Redraw);
        frame.add(south, BorderLayout.SOUTH);

        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}