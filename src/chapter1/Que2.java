package chapter1;

public class Que2 
{
	public static void main(String[] args) 
	{
		System.out.println(checkPermutationV1("abcd", "dabd"));
	}
	
	public static boolean checkPermutationV1(String s1, String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		
		return sort(s1).equals(sort(s2));
	}
	
	public static boolean checkPermutationV2(String s1, String s2)
	{
		//int array, for first string increase count of char and for other string reduce the count and if we get
		// negetive value then return false;
		return false;
	}
	
	public static String sort(String str)
	{
		char content[] = str.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
}
