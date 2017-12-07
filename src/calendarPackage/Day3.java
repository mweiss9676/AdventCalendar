package calendarPackage;

import java.util.Arrays;

public class Day3
{
	public static void main(String[] args)
	{
		int[][] zeroedArray = new int[100][100];
		for(int[] row : zeroedArray) { Arrays.fill(row, 0); }
		//printArray(zeroedArray);
	}
	/*public static void printArray(int[][] a)
	{
		for(int i = 0; i < 100; i++)
		{
			for(int j = 0; j < 100; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}*/
}