import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame {

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        new Main().setVisible(true);
    }

    private Main() {

        //set up the window
        super("YOLO Bbox");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(30, 30, 640, 640);
        this.setResizable(false);

        /*
         * Layout
         */

        //main container of 1x5 grid
        GridLayout primaryLayout = new GridLayout(1, 5);
        JPanel mainPanel = new JPanel(primaryLayout);

        //button container for 5 buttons
        GridLayout buttonLayout = new GridLayout(5, 1);
        JPanel buttonPanel = new JPanel(buttonLayout);

        //video container to hold the video
        GridLayout videoLayout = new GridLayout(1, 1);
        JPanel videoPanel = new JPanel(videoLayout);

        this.add(mainPanel);
        mainPanel.add(buttonPanel);
        mainPanel.add(videoPanel);

        /*
         * Components
         */

        // Add an ok button
        JButton okButton = new JButton("OK");
        buttonPanel.add(okButton);
        okButton.addActionListener(new ButtonListener());
        // Set  okButton   as  the   default  button
        this.getRootPane().setDefaultButton(okButton);

        // Add a close button
        JButton closeButton = new JButton("Close");
        buttonPanel.add(closeButton);
        closeButton.addActionListener(new ButtonListener());

        // Add image component
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(new ImageIcon());
        videoPanel.add(imageLabel);
    }

    class ButtonListener implements ActionListener {
        ButtonListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("OK")) {
                System.out.println("Button1 has been clicked");
            }
        }
    }
}
