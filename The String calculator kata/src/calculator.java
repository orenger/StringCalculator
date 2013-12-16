
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
			//String[] str = string.split(",",-1);
			String delims = "[,.\n?!]+";
			String [] str = string.split(delims,-1);
			int sum = 0;
			for(int i = 0 ; i<str.length ; i++ )
				sum += calculate(str[i]);
			return sum;
			//return calculate(str[0])+calculate(str[1]);
			//return calculate(Integer.parseInt(str[0]))+calculate(Integer.parseInt(str[1]));
		}
	}
	
	
	String  splitter(String s)
	{
		String  splt = "";
		
		for(int i = 0; i<s.length() ; i++)
		{
			if (s.charAt(i) == '\n' )
			{
				splt+=',';
			}
			else splt+=s.charAt(i);
		}
		return splt;
	}
}
