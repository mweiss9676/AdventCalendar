// The goal of this day's challenge is to take an input of a multidimensional array of integers and 
// return the sum of the differences between the hightest value and the lowest value per row
package calendarPackage;

import java.util.Scanner;

class Day2
{
	public static void checkSum(int[][] a)
	{
		int results = 0;
		
		for(int i = 0; i <= 15; i++)
		{
			Integer min = Integer.MAX_VALUE;
			Integer max = Integer.MIN_VALUE;
			for(int j = 0; j <= 15; j++)
			{
				if(a[i][j] < min)
				{
					min = a[i][j];
				}
				if(a[i][j] > max)
				{
					max = a[i][j];
				}
			}
			results += (max - min);
			System.out.println(results);
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[][] input = new int[16][16];

		for(int i = 0; i <= 15; i++)
		{
			for(int j = 0; j <= 15; j++)
			{
				input[i][j] = scan.nextInt();
			}
		}
		checkSum(input);
		scan.close();
	}
}

