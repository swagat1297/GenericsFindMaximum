import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class GenericsTesting {

	@Test
	public void checkForMaximumtestEqualsFirstPosition() {
		TestMaximum CheckInputTest = new TestMaximum();
		int output = CheckInputTest.maximum(87, 65, 32);
		assertEquals(87, output);
	}
	@Test
	public void checkForMaximumtestEqualsSecondPosition() {
		TestMaximum CheckInputTest = new TestMaximum();
		int output = CheckInputTest.maximum(32, 87, 56);
		assertEquals(87, output);
	}
	@Test
	public void checkForMaximumtestEqualsthirdPosition() {
		TestMaximum CheckInputTest = new TestMaximum();
		int output = CheckInputTest.maximum(32, 65, 87);
		assertEquals(87, output);
	}
//	@Test
//	public void checkForMaximumtestEqualsFloatInput() {
//		TestMaximum CheckInputTest = new TestMaximum();
//		float output = CheckInputTest.maximum(32.00f, 32.01f, 32.03f);
//		assertEquals(32.0f, output);
//	}
	@Test
	public void checkForMaximumtestEqualMultipleInput() {
		TestMaximum CheckInputTest = new TestMaximum();
		int output = CheckInputTest.multipleInput(32, 65, 87, 43, 29, 12);
		assertEquals(87, output);
	}
	

}
