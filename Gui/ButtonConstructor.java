package Gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JPanel;

import Actions.ActionController;
import Actions.KeyController;
import Constants.Constants;


/**
 * Adds all necessary buttons.
 */
public class ButtonConstructor {	
	public void addButtons(JPanel buttonPanel) {		
	    JButton clearButton = new JButton(Constants.CLEAR_BUTTON_SIGN);
	    clearButton.setActionCommand(Constants.CLEAR_BUTTON_SIGN);
	    clearButton.addActionListener(new ActionController(Constants.CLEAR_BUTTON_SIGN));
	    clearButton.addKeyListener(new KeyController());
	    clearButton.setToolTipText("Clear (or press ESC)");
	    buttonPanel.add(clearButton);

	    JButton multiplierButton = new JButton(Constants.MULTIPLY_BUTTON_SIGN);
	    multiplierButton.setActionCommand(Constants.MULTIPLY_BUTTON_SIGN);
	    multiplierButton.addActionListener(new ActionController(Constants.MULTIPLY_BUTTON_SIGN));
	    multiplierButton.setToolTipText("Multiply (or press *)");
	    buttonPanel.add(multiplierButton);

	    JButton divideButton = new JButton(Constants.DIVIDE_BUTTON_SIGN);
	    divideButton.setActionCommand(Constants.DIVIDE_BUTTON_SIGN);
	    divideButton.addActionListener(new ActionController(Constants.DIVIDE_BUTTON_SIGN));
	    divideButton.setToolTipText("Divide (or press " + Constants.DIVIDE_BUTTON_SIGN + ")");
	    buttonPanel.add(divideButton);
	    
	    JButton deleteButton = new JButton(Constants.DELETE_BUTTON_SIGN);
	    deleteButton.setActionCommand(Constants.DELETE_BUTTON_SIGN);
	    deleteButton.addActionListener(new ActionController(Constants.DELETE_BUTTON_SIGN));
	    deleteButton.setToolTipText("Delete last symbol (or press DEL)");
	    buttonPanel.add(deleteButton);
	    
		//Add the number buttons
	    for (int i=1;i<4;i++)
	    {
	        addButton(buttonPanel, String.valueOf(i));
	    }

	    JButton subButton = new JButton(Constants.SUB_BUTTON_SIGN);
	    subButton.setActionCommand(Constants.SUB_BUTTON_SIGN);
	    subButton.addActionListener(new ActionController(Constants.SUB_BUTTON_SIGN));
	    subButton.setToolTipText("Subtract (or press " + Constants.SUB_BUTTON_SIGN + ")");
	    buttonPanel.add(subButton);
	    
		//Add the number buttons
	    for (int i=4;i<7;i++)
	    {
	        addButton(buttonPanel, String.valueOf(i));
	    }

	    JButton addButton = new JButton(Constants.ADD_BUTTON_SIGN);
	    addButton.setActionCommand(Constants.ADD_BUTTON_SIGN);
	    addButton.addActionListener(new ActionController(Constants.ADD_BUTTON_SIGN));
	    addButton.setToolTipText("Add (or press " + Constants.ADD_BUTTON_SIGN + ")");
	    buttonPanel.add(addButton);

		//Add the number buttons
	    for (int i=7;i<10;i++)
	    {
	        addButton(buttonPanel, String.valueOf(i));
	    }

	    JButton percentageButton = new JButton(Constants.PERCENTAGE_BUTTON_SIGN);
	    percentageButton.setActionCommand(Constants.PERCENTAGE_BUTTON_SIGN);
	    percentageButton.addActionListener(new ActionController(Constants.PERCENTAGE_BUTTON_SIGN));
	    percentageButton.setToolTipText("Percentage (or press " + Constants.PERCENTAGE_BUTTON_SIGN + ")");
	    buttonPanel.add(percentageButton);

	    JButton delimeterButton = new JButton(Constants.DELIMETER_BUTTON_SIGN);
	    delimeterButton.setActionCommand(Constants.DELIMETER_BUTTON_SIGN);
	    delimeterButton.addActionListener(new ActionController(Constants.DELIMETER_BUTTON_SIGN));
	    delimeterButton.setToolTipText("Add delimeter (or press " + Constants.DELIMETER_BUTTON_SIGN + ")");
	    buttonPanel.add(delimeterButton);

	    addButton(buttonPanel, "0");
	    addButton(buttonPanel, "00");

	    JButton sumButton = new JButton(Constants.SUM_BUTTON_SIGN);
	    sumButton.setActionCommand(Constants.SUM_BUTTON_SIGN);
	    sumButton.addActionListener(new ActionController(Constants.SUM_BUTTON_SIGN));
	    sumButton.setToolTipText("Summarize (or press ENTER)");
	    buttonPanel.add(sumButton);
	}
    
	/** Adds numeric button */
    private void addButton(Container parent, String name)
    {
        JButton button = new JButton(name);
        ActionController actionController = new ActionController(name);
        button.setActionCommand(name);
        button.addActionListener(actionController);
        button.addKeyListener(new KeyController());
        parent.add(button);
    }
}
