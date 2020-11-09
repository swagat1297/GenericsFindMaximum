import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class GenericsTesting {

	@Test
	public void checkForMaximumtest() {
		TestMaximum CheckInputTest = new TestMaximum(34,45,87);
		int output = CheckInputTest.maximum(32, 65, 87);
		assertEquals(87, output);
	}

}
