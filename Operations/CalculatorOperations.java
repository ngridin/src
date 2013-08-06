package Operations;

import Gui.GuiConstructor;

/**
 * Performs all operations like add, sub, divide, etc.
 */
public class CalculatorOperations {
	private GuiConstructor guiConstructor = new GuiConstructor();
	private OperationsHelper helper = new OperationsHelper();;

	/** Clears the CalcText Field and resets the static field to default **/
	public void clearCalcTextField() {
		guiConstructor.setCalcTextFieldValue(helper.clearValues());
	}

	/** Types a value on the CalcText Field. **/
	public void typeValue(String value) {
		guiConstructor.setCalcTextFieldValue(helper.addTypedValue(value));
	}

    /** Deletes the last symbol **/
    public void deleteLastSymbol() {
    	guiConstructor.setCalcTextFieldValue(helper.deleteLastSymbol());
    }
    
    /** Performs arithmetic operation by the operator type */
    public void performArithmeticOperation(String operation) {
    	guiConstructor.setCalcTextFieldValue(
    			helper.performButtonAction(operation));
    }
}
