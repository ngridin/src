package Actions;

import Constants.Constants;
import Operations.CalculatorOperations;

public class CommonControllerActions {
    private CalculatorOperations calcOperations = new CalculatorOperations();
    
    
	public void performAction(String operator) {
    	if (operator.equals(Constants.DELETE_BUTTON_SIGN)) {
    		calcOperations.deleteLastSymbol();
    		return;
    	}
    	if (operator.equals(Constants.CLEAR_BUTTON_SIGN)) {
    		calcOperations.clearCalcTextField();
    		return;
    	}
    	if (operator.equals(Constants.ADD_BUTTON_SIGN)) {
    		calcOperations.performArithmeticOperation(operator);
    		return;
    	}
    	if (operator.equals(Constants.SUM_BUTTON_SIGN)) {
    		calcOperations.performArithmeticOperation(operator);
    		return;
    	}
    	if (operator.equals(Constants.SUB_BUTTON_SIGN)) {
    		calcOperations.performArithmeticOperation(operator);
    		return;
    	}
    	if (operator.equals(Constants.MULTIPLY_BUTTON_SIGN)) {
    		calcOperations.performArithmeticOperation(operator);
    		return;
    	}
    	if (operator.equals(Constants.DIVIDE_BUTTON_SIGN)) {
    		calcOperations.performArithmeticOperation(operator);
    		return;
    	}
    	if (operator.equals(Constants.PERCENTAGE_BUTTON_SIGN)) {
    		calcOperations.performArithmeticOperation(operator);
    		return;
    	}
    	calcOperations.typeValue(operator);	
	}
}
