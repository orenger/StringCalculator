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
		str = "1";
		actual = calculator.calculate(str);
		assertEquals(1, actual);
	}
	
}
