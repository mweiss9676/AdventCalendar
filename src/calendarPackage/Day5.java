package calendarPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Day5 {

	public static int findTheExit(ArrayList<Integer> a) {
		
		int count = 0;

		try {
			int currentIndex = 0, previousIndex = 0;
									
			int arrSize = a.size();
			
			while(currentIndex < arrSize) {
				
				int currentValue = a.get(currentIndex);
				
				if(currentValue == 1) {

					previousIndex = currentIndex;
					count++;
					currentIndex++;
					int previousIndexValue = a.get(previousIndex);
					a.set(previousIndex, ++previousIndexValue);
					
					
				} else if(currentValue == 0) {
					
					previousIndex = currentIndex;
					count++;
					int previousIndexValue = a.get(previousIndex);
					a.set(previousIndex, ++previousIndexValue);
					
				}else {
					
					previousIndex = currentIndex;
					count++;
					currentIndex += currentValue;
					int previousIndexValue = a.get(previousIndex);
					a.set(previousIndex, ++previousIndexValue);
					
				} /*else {
					
					previousIndex = currentIndex;
					count++;
					currentIndex -= currentValue;
					int previousIndexValue = a.get(previousIndex);
					a.set(previousIndex, ++previousIndexValue);
				}*/
			}
			return count;
			
		} /*catch (ArrayIndexOutOfBoundsException exception) {
			
			return count;
			
		}*/ catch (Exception e) {
			
			System.out.println(count);
			return -1;
		}
	}
public static int findTheExitPart2(ArrayList<Integer> a) {
		
		int count = 0;

		try {
			int currentIndex = 0, previousIndex = 0;
									
			int arrSize = a.size();
			
			while(currentIndex < arrSize) {
				
				int currentValue = a.get(currentIndex);
				
				if(currentValue == 1) {

					previousIndex = currentIndex;
					count++;
					currentIndex++;
					int previousIndexValue = a.get(previousIndex);
					a.set(previousIndex, ++previousIndexValue);
					
					
				} else if(currentValue == 0) {
					
					previousIndex = currentIndex;
					count++;
					int previousIndexValue = a.get(previousIndex);
					a.set(previousIndex, ++previousIndexValue);
					
				} else if(currentValue >= 3) {
					
					previousIndex = currentIndex;
					count++;
					int previousIndexValue = a.get(previousIndex);
					a.set(previousIndex, --previousIndexValue);
					
				} else {
					
					previousIndex = currentIndex;
					count++;
					currentIndex += currentValue;
					int previousIndexValue = a.get(previousIndex);
					a.set(previousIndex, ++previousIndexValue);
					
				} 
			}
			return count;
			
		} /*catch (ArrayIndexOutOfBoundsException exception) {
			
			return count;
			
		}*/ catch (Exception e) {
			
			System.out.println(count);
			return -1;
		}
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		
		while(scan.hasNextInt()) {
			
			intArrList.add(scan.nextInt());
		}
		//System.out.print(intArrList);
		scan.close();
		System.out.println(findTheExitPart2(intArrList));
	}
}
