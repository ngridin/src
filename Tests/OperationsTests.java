package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Constants.Constants;
import Operations.OperationsHelper;

public class OperationsTests {
	OperationsHelper helper = new OperationsHelper();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {	
		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));

		helper.addTypedValue("100");
		assertTrue(helper.performButtonAction(Constants.ADD_BUTTON_SIGN).equals("100"));

		helper.addTypedValue("100");
		assertTrue(helper.performButtonAction(Constants.ADD_BUTTON_SIGN).equals("200.0"));

		helper.addTypedValue("0");
		assertTrue(helper.performButtonAction(Constants.ADD_BUTTON_SIGN).equals("200.0"));

		helper.addTypedValue("-50");
		assertTrue(helper.performButtonAction(Constants.ADD_BUTTON_SIGN).equals("150.0"));

		helper.addTypedValue("-200");
		assertTrue(helper.performButtonAction(Constants.ADD_BUTTON_SIGN).equals("-50.0"));
		
		helper.addTypedValue("123.123");
		assertTrue(helper.performButtonAction(Constants.ADD_BUTTON_SIGN).equals("73.123"));

		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));
	}
	
	@Test
	public void testSub() {
		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));

		helper.addTypedValue("100");
		assertTrue(helper.performButtonAction(Constants.SUB_BUTTON_SIGN).equals("100"));

		helper.addTypedValue("50");
		assertTrue(helper.performButtonAction(Constants.SUB_BUTTON_SIGN).equals("50.0"));

		helper.addTypedValue("0");
		assertTrue(helper.performButtonAction(Constants.SUB_BUTTON_SIGN).equals("50.0"));

		helper.addTypedValue("-50");
		assertTrue(helper.performButtonAction(Constants.SUB_BUTTON_SIGN).equals("100.0"));

		helper.addTypedValue("1234");
		assertTrue(helper.performButtonAction(Constants.SUB_BUTTON_SIGN).equals("-1134.0"));
		
		helper.addTypedValue("123.123");
		assertTrue(helper.performButtonAction(Constants.SUB_BUTTON_SIGN).equals("-1257.123"));

		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));
	}
	
	@Test
	public void testMultiply() {
		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));

		helper.addTypedValue("25");
		assertTrue(helper.performButtonAction(Constants.MULTIPLY_BUTTON_SIGN).equals("25"));

		helper.addTypedValue("10");
		assertTrue(helper.performButtonAction(Constants.MULTIPLY_BUTTON_SIGN).equals("250.0"));

		helper.addTypedValue("-10");
		assertTrue(helper.performButtonAction(Constants.MULTIPLY_BUTTON_SIGN).equals("-2500.0"));

		helper.addTypedValue("-20");
		assertTrue(helper.performButtonAction(Constants.MULTIPLY_BUTTON_SIGN).equals("50000.0"));
		
		helper.addTypedValue("12.456");
		assertTrue(helper.performButtonAction(Constants.MULTIPLY_BUTTON_SIGN).equals("622800.0"));

		helper.addTypedValue("0");
		assertTrue(helper.performButtonAction(Constants.SUM_BUTTON_SIGN).equals("0.0"));

		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));
	}
	
	@Test
	public void testDivide() {
		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));

		helper.addTypedValue("1000");
		assertTrue(helper.performButtonAction(Constants.DIVIDE_BUTTON_SIGN).equals("1000"));

		helper.addTypedValue("10");
		assertTrue(helper.performButtonAction(Constants.DIVIDE_BUTTON_SIGN).equals("100.0"));

		helper.addTypedValue("-25");
		assertTrue(helper.performButtonAction(Constants.DIVIDE_BUTTON_SIGN).equals("-4.0"));

		helper.addTypedValue("-2");
		assertTrue(helper.performButtonAction(Constants.DIVIDE_BUTTON_SIGN).equals("2.0"));

		helper.addTypedValue("0");
		assertTrue(helper.performButtonAction(Constants.SUM_BUTTON_SIGN).equals(Constants.DIVIDE_BY_ZERO_ERROR));
		
		helper.addTypedValue("15");
		assertTrue(helper.performButtonAction(Constants.DIVIDE_BUTTON_SIGN).equals("15"));
		
		helper.addTypedValue("3");
		assertTrue(helper.performButtonAction(Constants.SUM_BUTTON_SIGN).equals("5.0"));

		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));
	}
	
	@Test
	public void testPercentage() {
		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));

		helper.addTypedValue("1000");
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("1000"));

		helper.addTypedValue("10");
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("100.0"));

		helper.addTypedValue("50");
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("50.0"));

		helper.addTypedValue("20");
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("10.0"));
		
		helper.addTypedValue("0.25");
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("0.025"));

		helper.addTypedValue("0");
		assertTrue(helper.performButtonAction(Constants.SUM_BUTTON_SIGN).equals("0.0"));

		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));
	}
	
	@Test
	public void testDifferentOperations() {
		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));
		
		helper.addTypedValue("50.25");
		assertTrue(helper.performButtonAction(Constants.ADD_BUTTON_SIGN).equals("50.25"));
		
		helper.addTypedValue("10.25");
		assertTrue(helper.performButtonAction(Constants.ADD_BUTTON_SIGN).equals("60.5"));
		
		helper.addTypedValue("29.3");
		assertTrue(helper.performButtonAction(Constants.SUB_BUTTON_SIGN).equals("89.8"));
		
		helper.addTypedValue("1.05");
		assertTrue(helper.performButtonAction(Constants.SUB_BUTTON_SIGN).equals("88.75"));
		
		helper.addTypedValue("8.75");
		assertTrue(helper.performButtonAction(Constants.MULTIPLY_BUTTON_SIGN).equals("80.0"));
		
		helper.addTypedValue("2");
		assertTrue(helper.performButtonAction(Constants.MULTIPLY_BUTTON_SIGN).equals("160.0"));
		
		helper.addTypedValue("10.5");
		assertTrue(helper.performButtonAction(Constants.DIVIDE_BUTTON_SIGN).equals("1680.0"));
		
		helper.addTypedValue("10.5");
		assertTrue(helper.performButtonAction(Constants.DIVIDE_BUTTON_SIGN).equals("160.0"));
		
		helper.addTypedValue("2");
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("80.0"));
		
		helper.addTypedValue("50");
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("40.0"));
		
		helper.addTypedValue("100");
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("40.0"));
		
		helper.addTypedValue("150");
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("60.0"));
		
		helper.addTypedValue("20.25");
		assertTrue(helper.performButtonAction(Constants.SUM_BUTTON_SIGN).equals("12.15"));
		
		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));
	}
	
	@Test
	public void testDoubleOperations() {
		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));
		
		helper.addTypedValue("50.25");
		assertTrue(helper.performButtonAction(Constants.ADD_BUTTON_SIGN).equals("50.25"));
		assertTrue(helper.performButtonAction(Constants.ADD_BUTTON_SIGN).equals("50.25"));
		
		helper.addTypedValue("10.25");
		assertTrue(helper.performButtonAction(Constants.ADD_BUTTON_SIGN).equals("60.5"));
		assertTrue(helper.performButtonAction(Constants.ADD_BUTTON_SIGN).equals("60.5"));
		
		helper.addTypedValue("29.3");
		assertTrue(helper.performButtonAction(Constants.SUB_BUTTON_SIGN).equals("89.8"));
		assertTrue(helper.performButtonAction(Constants.SUB_BUTTON_SIGN).equals("89.8"));
		
		helper.addTypedValue("1.05");
		assertTrue(helper.performButtonAction(Constants.SUB_BUTTON_SIGN).equals("88.75"));
		assertTrue(helper.performButtonAction(Constants.SUB_BUTTON_SIGN).equals("88.75"));
		
		helper.addTypedValue("8.75");
		assertTrue(helper.performButtonAction(Constants.MULTIPLY_BUTTON_SIGN).equals("80.0"));
		assertTrue(helper.performButtonAction(Constants.MULTIPLY_BUTTON_SIGN).equals("80.0"));
		
		helper.addTypedValue("2");
		assertTrue(helper.performButtonAction(Constants.MULTIPLY_BUTTON_SIGN).equals("160.0"));
		assertTrue(helper.performButtonAction(Constants.MULTIPLY_BUTTON_SIGN).equals("160.0"));
		
		helper.addTypedValue("10.5");
		assertTrue(helper.performButtonAction(Constants.DIVIDE_BUTTON_SIGN).equals("1680.0"));
		assertTrue(helper.performButtonAction(Constants.DIVIDE_BUTTON_SIGN).equals("1680.0"));
		
		helper.addTypedValue("10.5");
		assertTrue(helper.performButtonAction(Constants.DIVIDE_BUTTON_SIGN).equals("160.0"));
		assertTrue(helper.performButtonAction(Constants.DIVIDE_BUTTON_SIGN).equals("160.0"));
		
		helper.addTypedValue("2");
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("80.0"));
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("80.0"));
		
		helper.addTypedValue("50");
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("40.0"));
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("40.0"));
		
		helper.addTypedValue("100");
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("40.0"));
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("40.0"));
		
		helper.addTypedValue("150");
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("60.0"));
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("60.0"));
		
		helper.addTypedValue("20.25");
		assertTrue(helper.performButtonAction(Constants.SUM_BUTTON_SIGN).equals("12.15"));
		assertTrue(helper.performButtonAction(Constants.SUM_BUTTON_SIGN).equals("12.15"));
		
		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));
	}
	
	@Test
	public void testChangingOperations() {
		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));
		
		helper.addTypedValue("50.25");
		assertTrue(helper.performButtonAction(Constants.ADD_BUTTON_SIGN).equals("50.25"));
		assertTrue(helper.performButtonAction(Constants.SUB_BUTTON_SIGN).equals("50.25"));
		assertTrue(helper.performButtonAction(Constants.MULTIPLY_BUTTON_SIGN).equals("50.25"));
		assertTrue(helper.performButtonAction(Constants.DIVIDE_BUTTON_SIGN).equals("50.25"));
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("50.25"));
		assertTrue(helper.performButtonAction(Constants.SUB_BUTTON_SIGN).equals("50.25"));
		
		helper.addTypedValue("10.25");
		assertTrue(helper.performButtonAction(Constants.SUB_BUTTON_SIGN).equals("40.0"));
		assertTrue(helper.performButtonAction(Constants.ADD_BUTTON_SIGN).equals("40.0"));
		assertTrue(helper.performButtonAction(Constants.MULTIPLY_BUTTON_SIGN).equals("40.0"));
		assertTrue(helper.performButtonAction(Constants.DIVIDE_BUTTON_SIGN).equals("40.0"));
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("40.0"));
		assertTrue(helper.performButtonAction(Constants.MULTIPLY_BUTTON_SIGN).equals("40.0"));
		
		helper.addTypedValue("3");
		assertTrue(helper.performButtonAction(Constants.MULTIPLY_BUTTON_SIGN).equals("120.0"));
		assertTrue(helper.performButtonAction(Constants.ADD_BUTTON_SIGN).equals("120.0"));
		assertTrue(helper.performButtonAction(Constants.SUB_BUTTON_SIGN).equals("120.0"));
		assertTrue(helper.performButtonAction(Constants.DIVIDE_BUTTON_SIGN).equals("120.0"));
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("120.0"));
		assertTrue(helper.performButtonAction(Constants.DIVIDE_BUTTON_SIGN).equals("120.0"));
		
		helper.addTypedValue("2");
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("60.0"));
		assertTrue(helper.performButtonAction(Constants.MULTIPLY_BUTTON_SIGN).equals("60.0"));
		assertTrue(helper.performButtonAction(Constants.ADD_BUTTON_SIGN).equals("60.0"));
		assertTrue(helper.performButtonAction(Constants.SUB_BUTTON_SIGN).equals("60.0"));
		assertTrue(helper.performButtonAction(Constants.DIVIDE_BUTTON_SIGN).equals("60.0"));
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("60.0"));
		
		helper.addTypedValue("10");
		assertTrue(helper.performButtonAction(Constants.SUM_BUTTON_SIGN).equals("6.0"));
		
		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));
	}
	
	@Test
	public void testSumAndContinue() {
		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));
		
		helper.addTypedValue("20");
		assertTrue(helper.performButtonAction(Constants.ADD_BUTTON_SIGN).equals("20"));
		
		helper.addTypedValue("30");
		assertTrue(helper.performButtonAction(Constants.SUM_BUTTON_SIGN).equals("50.0"));
		assertTrue(helper.performButtonAction(Constants.SUB_BUTTON_SIGN).equals("50.0"));
		
		helper.addTypedValue("5");
		assertTrue(helper.performButtonAction(Constants.SUM_BUTTON_SIGN).equals("45.0"));
		assertTrue(helper.performButtonAction(Constants.MULTIPLY_BUTTON_SIGN).equals("45.0"));
		
		helper.addTypedValue("4");
		assertTrue(helper.performButtonAction(Constants.SUM_BUTTON_SIGN).equals("180.0"));
		assertTrue(helper.performButtonAction(Constants.DIVIDE_BUTTON_SIGN).equals("180.0"));
		
		helper.addTypedValue("2");
		assertTrue(helper.performButtonAction(Constants.SUM_BUTTON_SIGN).equals("90.0"));
		assertTrue(helper.performButtonAction(Constants.PERCENTAGE_BUTTON_SIGN).equals("90.0"));
		
		helper.addTypedValue("10");
		assertTrue(helper.performButtonAction(Constants.SUM_BUTTON_SIGN).equals("9.0"));
		
		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));
	}
	
	@Test
	public void testDevideByZero() {
		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));
		
		helper.addTypedValue("20");
		assertTrue(helper.performButtonAction(Constants.DIVIDE_BUTTON_SIGN).equals("20"));
		
		helper.addTypedValue("0");
		assertTrue(helper.performButtonAction(Constants.DIVIDE_BUTTON_SIGN).equals(Constants.DIVIDE_BY_ZERO_ERROR));
		
		helper.addTypedValue("20");
		assertTrue(helper.performButtonAction(Constants.DIVIDE_BUTTON_SIGN).equals("20"));
		
		helper.addTypedValue("10");
		assertTrue(helper.performButtonAction(Constants.SUM_BUTTON_SIGN).equals("2.0"));
		
		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));
	}
	
	@Test
	public void testEndlessDivide() {
		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));
		
		helper.addTypedValue("10");
		assertTrue(helper.performButtonAction(Constants.DIVIDE_BUTTON_SIGN).equals("10"));
		
		helper.addTypedValue("3");
		assertTrue(helper.performButtonAction(Constants.SUM_BUTTON_SIGN).equals("3.3333333333333335"));
		
		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));
	}
	
	@Test
	public void testBigMultiply() {
		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));
		
		helper.addTypedValue("1234567890");
		assertTrue(helper.performButtonAction(Constants.MULTIPLY_BUTTON_SIGN).equals("1234567890"));
		
		helper.addTypedValue("1234567890");
		assertTrue(helper.performButtonAction(Constants.SUM_BUTTON_SIGN).equals("1.52415787501905203E18"));
		
		assertTrue(helper.clearValues().equals(Constants.DEFAULT_VALUE));
	}
}
