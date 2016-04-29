package chapter1;

public class Que6 
{
	public static void main(String[] args) 
	{
		System.out.println(isOneAway("pale", "ple"));
		System.out.println(isOneAway("pales", "pale"));
		System.out.println(isOneAway("pale", "bale"));
		System.out.println(isOneAway("pale", "bae"));
	}
	
	public static boolean isOneAway(String str1, String str2)
	{
		if(str1.length() == str2.length())
		{
			return isOneReplaceAway(str1, str2);
		}
		else if(str1.length() - str2.length() == 1)
		{
			return isOneInsertAway(str2, str1);
		}
		else if(str2.length() - str1.length() == 1)
		{
			return isOneInsertAway(str1, str2);
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isOneReplaceAway(String str1, String str2)
	{
		boolean flag =false;
		
		for(int i = 0; i<str1.length(); i++)
		{
			if(str1.charAt(i) != str2.charAt(i))
			{
				if(flag)
				{
					return false;
				}
				flag = true;
			}
		}
		
		return true;
	}
	
	public static boolean isOneInsertAway(String str1, String str2)
	{
		int index1 = 0;
		int index2 = 0;
		
		while(index1 < str1.length() && index2 < str2.length())
		{
			if(str1.charAt(index1) != str2.charAt(index2))
			{
				if(index1 != index2)
				{
					return false;
				}
				else
				{
					index2++;
				}
			}
			else
			{
				index1++;
				index2++;
			}
		}
		return true;
	}
}
