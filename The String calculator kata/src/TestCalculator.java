import static org.junit.Assert.*;

import org.junit.Test;


public class TestCalculator {
	
	@Test
	public void EmptyString_ReturnsZero() 
	{
		String str ="1";
		calculator calculator = new calculator();
		int actual = calculator.calculate(str);
		assertEquals(0, actual);
	}

}
