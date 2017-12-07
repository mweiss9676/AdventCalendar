package calendarPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Day4
{
	public static void someFunction(ArrayList<String> a)
	{
		int results = 0;
		int arrayListLength = a.size();
		for(int i = 0; i < arrayListLength; i++)
		{
			String[] words = a.get(i).split("\\s");
			int sentenceLength = words.length;
			int count = 0;
			
			for(int j = 0; j < sentenceLength - 1; j++)
			{
				String key = words[j];
				
				for(int k = j + 1; k < sentenceLength; k++)
				{
					String compare = words[k];
					if(key.equals(compare))
					{
						count++;
					}
				}
			}
			if(count == 0) { results++; }
		}
		System.out.println(results);
	}
	public static void main(String[] args)
	{
		ArrayList<String> arraylist = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine())
		{
			String st = scan.nextLine();
			arraylist.add(st);
		}
		//System.out.println(arraylist);
		someFunction(arraylist);
		scan.close();
	}
}
