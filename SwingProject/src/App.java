import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("My First Swing GUI Application");
        frame.setResizable(false);

        ImageIcon image = new ImageIcon("image.jpg");
        frame.setIconImage(image.getImage());
    }
}
