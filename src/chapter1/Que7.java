package chapter1;

public class Que7
{
	public static void main(String[] args)
	{
		int ip[][] = {{1,2,3}, {4,5,6},{7,8,9}};
		ip = rotateMatrix(ip,3);
		System.out.println("");
	}
	
	public static int[][] rotateMatrix(int[][] ip, int n)
	{
		for(int layer=0; layer<n/2; layer++)
		{
			int last = n-1-layer;
			for(int i=layer; i<last; i++)
			{
				ip[layer][i] = ip[last+layer-i][layer];
			}
		}
		return ip;
	}
}
