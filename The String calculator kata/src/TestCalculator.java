import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestCalculator {
	
	calculator calculator = new calculator();
	int actual;
	String str ;
	
//	@Before
//	public void init()
//	{
//		calculator calculator = new calculator();
//		
//	}
	
	@Test
	public void EmptyString_ReturnsZero() 
	{
		str = "";
		actual = calculator.calculate(str); 
		assertEquals(0, actual);
	}

	@Test
	public void OneNumber_returnsTheNumber()
	{
		str = "2";
		actual = calculator.calculate(str);
		assertEquals(2, actual);
	}
	
	@Test
	public void handleWithTwoNmubers_retrunsSum()
	{
		str = "1\n2";
		actual = calculator.calculate(str);
		assertEquals(3, actual);
	}
	
	@Test
	public void handleWithMultipleNumbers()
	{
		str = "1,2\n2,0.1,2.3";
		actual = calculator.calculate(str);
		assertEquals(11, actual);
	}
	
	@Test
	public void negativeException()
	{
		str = "-1\n2";
		actual = calculator.calculate(str);
		assertEquals(-1, actual);
	}
}
