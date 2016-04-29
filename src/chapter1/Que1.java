package chapter1;

public class Que1 
{
	public static void main(String[] args) 
	{
		String str = "abcad ";
		System.out.println(isAllUniqueCharactersV1(str));
		System.out.println(isAllUniqueCharactersV2(str));
	}
	
	// Time: O(n2), Space: O(1)
	public static Boolean isAllUniqueCharactersV1(String str)
	{
		for(int i=0; i<str.length(); i++)
		{
			for(int j=(i+1); j<str.length(); j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
	}
	
	// Time: O(n) or O(min(n,c)) or O(c), Space: O(c), c is the size of the character set
	public static Boolean isAllUniqueCharactersV2(String str)
	{
		boolean arr[] = new boolean[128];
		for(int i=0; i<str.length(); i++)
		{
			if(arr[str.charAt(i)])
			{
				return false;
			}
			else
			{
				arr[str.charAt(i)] = true;
			}
		}
		return true;
	}
}
