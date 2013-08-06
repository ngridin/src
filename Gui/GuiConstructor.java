package Gui;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Actions.KeyController;
import Constants.Constants;

/**
 * Drives the GUI.
 */
public class GuiConstructor {
    JFrame guiFrame;
    JPanel buttonPanel;
    private static JTextField calcTextField;
    int calcOperation = 0;
    int currentCalc;

    public void start() {
        guiFrame = new JFrame();
        
        // Make sure the program exits when the frame closes
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Simple Calculator");
        guiFrame.setSize(300,300);
        // Centers the JFrame in the middle of the screen. So, it'll look better.
        guiFrame.setLocationRelativeTo(null);
        
        calcTextField = new JTextField();
        calcTextField.setHorizontalAlignment(JTextField.RIGHT);
        calcTextField.setEditable(false);
        calcTextField.setText(Constants.DEFAULT_VALUE);
        calcTextField.addKeyListener(new KeyController());
        calcTextField.setFocusTraversalKeysEnabled(false);

        guiFrame.add(calcTextField, BorderLayout.NORTH);

        buttonPanel = new JPanel();

        // Puts all buttons into the grid
        buttonPanel.setLayout(new GridLayout(5,4));
        guiFrame.add(buttonPanel, BorderLayout.CENTER);
        
        ButtonConstructor buttonConstructor = new ButtonConstructor();
        buttonConstructor.addButtons(buttonPanel);
        
        // It is a very important part
        guiFrame.setVisible(true);
    }
    
    public String getCalcTextFieldValue() {
    	return calcTextField.getText();
    }

    public void setCalcTextFieldValue(String text) {
    	calcTextField.setText(text);
    }
}