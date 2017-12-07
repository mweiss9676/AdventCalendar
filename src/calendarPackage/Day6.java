package calendarPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
 
public class Day6 {

	static int count = 0;
	static ArrayList<int[]> intArrayList = new ArrayList<int[]>();
	//static ArrayList<ArrayList> intArrayList = new ArrayList<ArrayList>();
	
	public static void someFunction(ArrayList<Integer> a) {
		
		//System.out.println(a);
		/*if (equals(a) > 0) {
			
			System.out.println(count - 1);
			return;
		};*/
		int currentMax = Collections.max(a);
		int currentMaxIndex = a.indexOf(currentMax);
		int remainderOfMax = currentMax;
		a.set(currentMaxIndex, 0);

		//return currentMaxIndex;
		
		for(int i = currentMaxIndex + 1; remainderOfMax > 0 ; i++) {
			
			remainderOfMax--;
			
			if (i < a.size()) {

				int indexValueAtI = a.get(i);
				a.set(i, ++indexValueAtI);
				continue; 
				
			} else if (i >= a.size()) {
				
				i = 0;
				int indexValueAtI = a.get(i);
				a.set(i, ++indexValueAtI);
				continue;
			}
			
		}
		//someFunction(a);
	} 
	public static int equals(ArrayList<Integer> a) {
		
		
		//System.out.println(a);
		count++;
		/*for(ArrayList g : intArrayList) { System.out.println(g); }
		if(intArrayList.contains(a)) {
			
			return count;
		}*/
			
		//intArrayList.add(a);
				
		int[] converted = a.stream().mapToInt(Integer::intValue).toArray();
		intArrayList.add(converted);
		
		/*for(int[] b : intArrayList) { 
			for(int c : b) {
				System.out.print(c);
			}
			System.out.println();
		}*/
		int size = intArrayList.size();
		
		for(int i = 0; i < size - 1; i++) {
			
				int j = size - 1;
				
				if(Arrays.equals(intArrayList.get(i), intArrayList.get(j))) {
					
					return count;
				}				
				//System.out.println("i is: " + intArrayList.get(i) + " and j is: " + intArrayList.get(j));		
		}
		
		return -1;
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.addAll(Arrays.asList(14, 0, 15, 12, 11, 11, 3, 5, 1, 6, 8, 4, 9, 1, 8, 4));
		//input.addAll(Arrays.asList(0, 2, 7, 0));		
		//someFunction(input);
		while (equals(input) <= 0) {
			
			someFunction(input);
		};
		System.out.println(count - 1);
	}
}

// input => 14	0	15	12	11	11	3	5	1	6	8	4	9	1	8	4