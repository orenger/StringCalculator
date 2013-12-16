
public class calculator 
{
	boolean negative = true ;
	
	public int calculate(String string)
	{
		int sum = 0 , j = 0;
		int [] negArr = new int [string.length()] ;
		
		if(string.isEmpty())
			return sum;
		if(string.contains("-"))
		{
			System.out.println("negatives not allowed  - ");
			
			return -1;
		}
			if(string.length()== 1 && string.charAt(0)>=0)
				return Integer.parseInt(string);
			
			String delims = "[,.\n?!;:]+";
			String [] str = string.split(delims);
			//String [] str = string.split(".");
				for(int i = 0 ; i<str.length ; i++ )
				{
					sum += calculate(str[i]);
					negArr[i] = -1*Integer.parseInt(str[i]);
					System.out.println("["+negArr[i]+"],");
				}
		return sum;
	}
	
	
	
}
