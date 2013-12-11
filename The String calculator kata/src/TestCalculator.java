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
	public void MultipleNumbers_retrunsSum()
	{
		str = "1,2";
		actual = calculator.calculate(str);
		assertEquals(3, actual);
	}
}
