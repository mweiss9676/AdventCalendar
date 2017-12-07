package calendarPackage;

import java.util.ArrayList;
import java.util.Scanner;
import java.math.BigInteger;

public class Day1
{
	public static void consecutiveValueAdder(BigInteger a)
	{
		BigInteger ten = new BigInteger("10");
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		int results = 0;

		while(!a.equals(BigInteger.ZERO))
		{
			intArrayList.add(0, a.mod(ten).intValue());
			a = a.divide(ten);
			
		}
		
		int length = intArrayList.size();
		
		for (int i = 0, j = 1; i < length - 1; i++, j++)
		{
			int key = intArrayList.get(i);
			int compare = intArrayList.get(j);
				
				if(key == compare)
				{
					results += intArrayList.get(i);
				}
		}
		if(intArrayList.get(0) == intArrayList.get(length - 1)) { results += intArrayList.get(0); }
		System.out.println(results);

		
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		BigInteger input = scan.nextBigInteger();
		consecutiveValueAdder(input);
		scan.close();
	}
}

