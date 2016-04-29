package chapter1;

public class Que4 
{
	public static void main(String[] args) 
	{
		System.out.println(isPalindromePermutation("tact coa"));
	}
	
	// palindrome is case insensitive and no other characters then a to z.
	public static boolean isPalindromePermutation(String str)
	{
		int charCount[] = new int['z'-'a'+1];
		
		for(char c : str.toCharArray())
		{
			int charNo = getCharNo(c);
			if(charNo != -1)
			{
				charCount[charNo]++;
			}
		}
		
		int noOfOddCounts = 0;
		
		for(int i=0; i<charCount.length; i++)
		{
			if(charCount[i]%2 != 0)
			{
				noOfOddCounts++;
			}
			
			if(noOfOddCounts>1)
			{
				break;
			}
		}
		
		if(noOfOddCounts>1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static int getCharNo(char c)
	{
		int cNo = -1;
		if('A' <= c && c <= 'Z')
		{
			cNo = c - 'A';
		}
		else if('a' <= c && c <= 'z')
		{
			cNo = c - 'a';
		}
		System.out.println(c + " : " + cNo);
		return cNo;
	}
}
