package Operations;

import Constants.Constants;

/** 
 * Contains methods for different operations like add, sum, etc.
 */
public class OperationsHelper {
	/** Default value of all fields */
	private static final String defaultValue = Constants.DEFAULT_VALUE;
	private static String previousValue = defaultValue;
	private static String previousOperation = defaultValue;
	private static String lastValue = defaultValue;

	/** Clears all main static fields: previousValue, lastValue, previousOperation */
	public String clearValues() {
		updateStaticFields(defaultValue, defaultValue, defaultValue);
		return defaultValue;
	}

	/** Returns a value that should be displayed after user's typing */
	public String addTypedValue(String typedValue) {
		// Checking that we don't add the delimiter twice
		if (typedValue.equals(Constants.DELIMETER_BUTTON_SIGN) &&
				lastValue.contains(Constants.DELIMETER_BUTTON_SIGN)) return lastValue;
		lastValue = lastValue + typedValue;
		return lastValue;
	}

	/** Deletes the last symbol of an entered value */
	public String deleteLastSymbol() {
		// Do not allow to edit operation results, user's only
		if (lastValue.equals(defaultValue)) return previousValue;
		lastValue = lastValue.length() == 1 ? defaultValue : lastValue.substring(0, lastValue.length()-1);
		return lastValue;
	}
	
	/** Performs all operations like sum, add, etc. by a button type */
	public String performButtonAction(String buttonSign) {
		// Clearing all errors
		if (previousValue.equals(Constants.DIVIDE_BY_ZERO_ERROR)) {
			previousValue = defaultValue;
		}
    	if (!lastValue.equals(defaultValue)) {
    		if (!previousValue.equals(defaultValue)) {
    			if (previousOperation.equals(Constants.DEFAULT_VALUE)) {
    				updateStaticFields(defaultValue, lastValue, defaultValue);
    			}
    			lastValue = performOperationByButtonSign(previousOperation, previousValue, lastValue);
    		}
    		updateStaticFields(lastValue, defaultValue, buttonSign);
    	} else {
    		if (!previousValue.equals(defaultValue)) {
    			updateStaticFields(previousValue, defaultValue, buttonSign);
    		}
    	}
    	System.out.println("Previous value: " + previousValue);
    	System.out.println("Last value: " + lastValue);
    	System.out.println("Button sign: " + previousOperation);
    	return previousValue;
	}

	/** Performs operations by a button sign */
    private String performOperationByButtonSign(String operation, String value1, String value2) {
    	// Common validation
    	if (value1.equals(defaultValue)) {
    		if (value2.equals(defaultValue)) {
    			return defaultValue;
    		}
    		return value2;
    	}
    	// For the sum button just use the last operation
    	if (operation.equals(Constants.SUM_BUTTON_SIGN)) {
    		operation =  previousOperation;
    	}
    	if (operation.equals(Constants.ADD_BUTTON_SIGN)) {
    		return getSummarize(value1, value2);
    	}
    	if (operation.equals(Constants.SUB_BUTTON_SIGN)) {
    		return getSubtract(value1, value2);
    	}
    	if (operation.equals(Constants.MULTIPLY_BUTTON_SIGN)) {
    		return getMultiply(value1, value2);
    	}
    	if (operation.equals(Constants.DIVIDE_BUTTON_SIGN)) {
    		return getDevide(value1, value2);
    	}
    	if (operation.equals(Constants.PERCENTAGE_BUTTON_SIGN)) {
    		return getPercentage(value1, value2);
    	}
    	return "";
    }

    /** Get divide of two values. It assumes that the values are convertible to the Double type. */
    private String getDevide(String value1, String value2) {
    	// Divide by zero, it's not good, java doesn't like such behavior
    	if (Double.valueOf(value2) == 0 ) {
    		clearValues();
    		return Constants.DIVIDE_BY_ZERO_ERROR;
    	}
    	return String.valueOf(Double.valueOf(value1) / Double.valueOf(value2));
    }
    
    /** Get sum of two values. It assumes that the values are convertible to the Double type. */
    private String getSummarize(String value1, String value2) {
    	return String.valueOf(Double.valueOf(value1) + Double.valueOf(value2));
    }
    
    /** Get subtraction of two values. It assumes that the values are convertible to the Double type. */
    private String getSubtract(String value1, String value2) {
    	return String.valueOf(Double.valueOf(value1) - Double.valueOf(value2));
    }
    
    /** Get multiplication of two values. It assumes that the values are convertible to the Double type. */
    private String getMultiply(String value1, String value2) {
    	return String.valueOf(Double.valueOf(value1) * Double.valueOf(value2));
    }
    
    /** Get percentage of two values. It assumes that the values are convertible to the Double type. */
    private String getPercentage(String value1, String value2) {
    	return String.valueOf(Double.valueOf(value1) * (Double.valueOf(value2) / 100));
    }

    /** Updates main static fields: previousValue, lastValue, previousOperation */
    private void updateStaticFields(
    		String previousValue, String lastValue, String previousOperation) {
    	OperationsHelper.previousValue = previousValue;
    	OperationsHelper.lastValue = lastValue;
    	// Do not remember about the sum button, this operation doesn't have a history
    	if (previousOperation.equals(Constants.SUM_BUTTON_SIGN)) {
    		OperationsHelper.previousOperation = defaultValue;
    	} else {
    		OperationsHelper.previousOperation = previousOperation;
    	}
    }
    
    public String getPreviousValue() {
    	return previousValue;
    }
    
    public String getLastValue() {
    	return lastValue;
    }
    
    public String getPreviousOperation() {
    	return previousOperation;
    }
}