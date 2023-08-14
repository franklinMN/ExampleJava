import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class App{
    private static int FRAME_HEIGHT = 400;
    private static int FRAME_WIDTH = 400;

    private static int PANEL_HEIGHT = 200;
    private static int PANEL_WIDTH = 200;
    private static int TOP_PANEL_X = 0;
    private static int TOP_PANEL_Y = 0;
    private static int BOTTOM_PANEL_X = 0;
    private static int BOTTOM_PANEL_Y = 200;

    private static int BUTTON_HEIGHT = 30;
    private static int BUTTON_WIDTH = 95;
    

    public static void main(String[] args) {
        
        MyFrame frame = new MyFrame( FRAME_HEIGHT, FRAME_WIDTH );
        JPanel topPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        JButton stone = new JButton();
        JButton paper = new JButton();
        JButton scissor = new JButton();

        topPanel.setBounds( TOP_PANEL_X , TOP_PANEL_Y , PANEL_WIDTH, PANEL_HEIGHT);
        bottomPanel.setBounds( BOTTOM_PANEL_X , BOTTOM_PANEL_Y , PANEL_WIDTH , PANEL_HEIGHT );
        topPanel.setBackground(new Color(0,0,0));
        bottomPanel.setBackground(new Color(0,0,0));

        stone.setBounds(50,100, BUTTON_WIDTH , BUTTON_HEIGHT);
        paper.setBounds(150,100, BUTTON_WIDTH , BUTTON_HEIGHT );
        scissor.setBounds(250,100, BUTTON_WIDTH , BUTTON_HEIGHT);

        bottomPanel.add(stone);
        bottomPanel.add(paper);
        bottomPanel.add(scissor);

        frame.add(topPanel);
        frame.add(bottomPanel);

    }
}
