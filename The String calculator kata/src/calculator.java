
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
			String[] str = string.split(",");
			return Integer.parseInt(str[0])+Integer.parseInt(str[1]);
		}
	}
	
}
