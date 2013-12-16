
public class calculator 
{
	public int calculate(String string)
	{
		if(string.isEmpty())
			return 0;
		else 
		{
			if(string.length()== 1)
				return Integer.parseInt(string);
			String delims = "[,.\n?!]+";
			String [] str = string.split(delims,-1);
			int sum = 0;
			for(int i = 0 ; i<str.length ; i++ )
				sum += calculate(str[i]);
			return sum;
		}
	}
	
	
	
}
