package calendarPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Day8 {

	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()) {
			String st = scan.nextLine();
			stringList.add(st);
		}
		someMethod(stringList);
		scan.close();
	}
	
	
	public static void someMethod(List<String> a) {
		
		List<String> list = a;
		Set<String> set = new HashSet<String>();
		//List<String> variables = new ArrayList<String>();
		List<String[]> stringArrayList = new ArrayList<String[]>();
		String[] temp = new String[7];

		int size = a.size();
		for(int i = 0; i < size; i++) {
			stringArrayList.add(list.get(i).split("\\s"));
		}	
		
		int stringArraySize = stringArrayList.size();
		for(int i = 0; i < stringArraySize; i++) {
			
			String theVar = stringArrayList.get(i)[0];
			temp[0] = stringArrayList.get(i)[3];
			temp[1] = "( " + stringArrayList.get(i)[4] + " ";
			temp[2] = stringArrayList.get(i)[5] + " ";
			temp[3] = stringArrayList.get(i)[6] + " ) { " + theVar;
			if(stringArrayList.get(i)[1].matches("inc")) { temp[4] = " += "; }
			else { temp[4] = " -= "; }
			temp[5] = stringArrayList.get(i)[2] + "; }";
			temp[6] = " if( " + theVar + " > count ) { count = " + theVar + "; }";
			System.out.print(temp[0] + temp[1] + temp[2] + temp[3] + temp[4] + temp[5] + temp[6]);
			System.out.println();
			
			//set.add(stringArrayList.get(i)[0]);
			//set.add(stringArrayList.get(i)[4]);
		}		
		//System.out.println();

		
		//should look like System.out.print( rjx + " " + gy + " " +
		/*for(String name : set) {
			System.out.print(name + " +" + " \"" + " " + " \"" + " + ");     
		}*/
		
		/*System.out.println();
		System.out.println();
		
		for(String name : set) {
			String blah = "int " + name + " = 0; ";
			System.out.println(blah);
		}
		*/
		/*for(String[] str : stringArrayList) {
			for(String string : str) {
				System.out.print(string + " ");
			}
			System.out.println();
		}*/
		
	}

}

/*
 * 
js inc 257 if wn < 9
jq dec -586 if esb != -3
gcf inc -603 if i >= -9
gcf dec -300 if d != 1
g inc -973 if gy > -1
epp dec -79 if rjx < 9

 */
