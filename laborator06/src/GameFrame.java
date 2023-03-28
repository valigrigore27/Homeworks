import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    public GameFrame() {
        // Set the title of the frame
        setTitle("My Drawing Application");


        // Create a new control panel for managing the game
        JPanel controlPanel = new JPanel(new FlowLayout());

        JButton loadButton = new JButton("Load");
        JButton saveButton = new JButton("Save");
        JButton resetButton = new JButton("Reset");
        JButton exitButton = new JButton("Exit");
        controlPanel.add(loadButton);
        controlPanel.add(saveButton);
        controlPanel.add(resetButton);
        controlPanel.add(exitButton);

        // Add the control panel to the south region of the frame
        add(controlPanel, BorderLayout.SOUTH);

//------------------------------------------------------------------

        // Create a new text field
        JPanel configPanel = new JPanel(new FlowLayout());

        // Create a new label
        JLabel label = new JLabel("Number of dots:");

        // Create a new spinner
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));

        //add to the configPanel
        configPanel.add(label);
        configPanel.add(spinner);


        //new game button
        JButton newGameButton = new JButton("Create new game");
        configPanel.add(newGameButton);
        add(configPanel, BorderLayout.NORTH);
        setVisible(true);


        // Set the size of the frame
        setSize(800, 600);


        // Set the visibility of the frame
        setVisible(true);



        // Set the visibility of the frame
        setVisible(true);
    }
}
