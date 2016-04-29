package chapter1;

public class Que5 
{
	public static void main(String[] args) 
	{
		System.out.println(compressString("abcdefgh"));
	}
	
	public static String compressString(String ipStr)
	{
		StringBuilder opStr = new StringBuilder(ipStr.length());
		int count=0;
		
		for(int i=0; i<ipStr.length(); i++)
		{
			count++;
			
			if(i+1>=ipStr.length() || ipStr.charAt(i) != ipStr.charAt(i+1))
			{
				opStr.append(ipStr.charAt(i));
				opStr.append(count);
				count = 0;
				
				if(opStr.length() > ipStr.length())
				{
					return ipStr;
				}
			}
		}
		return opStr.toString();
	}
}
