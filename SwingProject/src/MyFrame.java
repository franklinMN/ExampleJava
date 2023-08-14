import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class MyFrame extends JFrame {
    
    public MyFrame( int FRAME_HEIGHT, int FRAME_WIDTH ) {
        this.getContentPane().setBackground(new Color(13,05,98));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize( FRAME_HEIGHT , FRAME_WIDTH );
        this.setVisible(true);
        this.setTitle("My First Swing GUI Application");
        this.setResizable(false);
        ImageIcon image = new ImageIcon(MyFrame.class.getResource("\\SwingProject\\images\\image.jpg"));
        this.setIconImage(image.getImage());
        //centering Windows
        Toolkit toolKit = getToolkit();
		Dimension size = toolKit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
    }


}
