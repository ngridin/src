package Actions;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Constants.Constants;

/**
 * Key controller.
 */
public class KeyController implements KeyListener {
	CommonControllerActions actions = new CommonControllerActions();

	// Users can't live without a keyboard, let's add ability
	// to type everything instead of clicking.
	@Override
	public void keyPressed(KeyEvent e) {
		//System.out.println("Key code: " + e.getKeyCode());
		String operation = "";
		String keyValue = String.valueOf(e.getKeyChar());
		String keyCode = String.valueOf(e.getKeyCode());
		if (keyValue.equals("1")) operation = keyValue;
		if (keyValue.equals("2")) operation = keyValue;
		if (keyValue.equals("3")) operation = keyValue;
		if (keyValue.equals("4")) operation = keyValue;
		if (keyValue.equals("5")) operation = keyValue;
		if (keyValue.equals("6")) operation = keyValue;
		if (keyValue.equals("7")) operation = keyValue;
		if (keyValue.equals("8")) operation = keyValue;
		if (keyValue.equals("9")) operation = keyValue;
		if (keyValue.equals("0")) operation = keyValue;
		if (keyValue.equals(Constants.PERCENTAGE_BUTTON_SIGN)) operation = keyValue;
		if (keyValue.equals(Constants.SUB_BUTTON_SIGN)) operation = keyValue;
		if (keyValue.equals(Constants.ADD_BUTTON_SIGN)) operation = keyValue;
		if (keyValue.equals(Constants.SUM_BUTTON_SIGN)) operation = keyValue;
		if (keyValue.equals(Constants.DELIMETER_BUTTON_SIGN)) operation = keyValue;
		if (keyValue.equals(Constants.DIVIDE_BUTTON_SIGN)) operation = keyValue;
		
		// Some non-standard button
		if (keyCode.equals("8")) operation = Constants.DELETE_BUTTON_SIGN;
		if (keyCode.equals("27")) operation = Constants.CLEAR_BUTTON_SIGN;
		if (keyCode.equals("10")) operation = Constants.SUM_BUTTON_SIGN;
		if (keyValue.equals("*")) operation = Constants.MULTIPLY_BUTTON_SIGN;

		// Ignore all unknown commands
		if (operation.equals("")) return;

		actions.performAction(operation);
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}
