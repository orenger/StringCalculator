
public class calculator 
{
	public int calculate(String string)
	{
		if(string.isEmpty())
			return 0;
		else 
			return Integer.parseInt(string)-1;
	}
	
}
