import javax.swing.JFrame;

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
    }
}