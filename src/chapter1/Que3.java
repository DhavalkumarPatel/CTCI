package chapter1;

public class Que3 
{
	public static void main(String[] args)
	{
		char chars[] = {'a','b',' ','d',' ',' ',' '};
		System.out.println(new String(urlify(chars, 4)));
	}
	
	public static char[] urlify(char chars[], int length)
	{
		int noOfSpaces = 0;
		
		for(int i=0; i<length; i++)
		{
			if(chars[i] == ' ')
			{
				noOfSpaces++;
			}
		}
		
		int newLength = length + noOfSpaces*2;
		
		chars[newLength] = '\0';
		for(int i = length-1; i >= 0; i--)
		{
			if(chars[i]==' ')
			{
				chars[newLength-3] = '%';
				chars[newLength-2] = '2';
				chars[newLength-1] = '0';
				newLength = newLength - 3;
			}
			else
			{
				chars[newLength-1] = chars[i];
				newLength = newLength - 1;
			}
		}
		
		return chars;
	}
}
