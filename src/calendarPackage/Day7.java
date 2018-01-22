package calendarPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day7 {
	public static void main(String[] args) {
		
		ArrayList<String> inputLines = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextLine()) {
			String st = scan.nextLine();
			inputLines.add(st);
		}
		scan.close();
		parser(inputLines);
	}
	public static void parser(ArrayList<String> a) {
		
		String[] allDuplicates;
		String[] allWords;
		ArrayList<String> wordsToRemove = new ArrayList<String>();
		ArrayList<String> firstWords = new ArrayList<String>();
		ArrayList<String[]> valuesToRemove = new ArrayList<String[]>();

		
		
		//put all first words into firstWords
		for(int i = 0; i < a.size(); i++) {
			allWords = a.get(i).split("\\s");
			firstWords.add(allWords[0]);
		}
		
		//put all second and on words into valuesToRemove
		for(int i = 0; i < a.size(); i++) {
			
			//remove all digits and symbols and replace them with spaces
			//then copy them into a String[]
			//then copy them into a hashset and back to remove all duplicates
			//then finally add them to an arraylist of strings so that they can be compared and values can be removed
			allDuplicates = a.get(i).replaceAll("[\\W\\d]", " ").split("\\s");
			System.arraycopy(allDuplicates, 1, allDuplicates, 0, allDuplicates.length - 1);
			
			Set<String> set = new HashSet<String>(Arrays.asList(allDuplicates));
			allDuplicates = set.toArray(new String[set.size()]);
			
			valuesToRemove.add(allDuplicates);
		}
		
		//put all valuesToRemove into arrylist of strings wordsToRemove so that they can be compared with firstwords
		for(String[] st : valuesToRemove) {
			for(String str : st) {
				wordsToRemove.add(str);
			}
		}

		firstWords.removeAll(wordsToRemove);
		for(String string : firstWords) {
			System.out.print(string);
		}
		System.out.println();
		System.out.println(firstWords.size());
		System.out.println("success");
	}
}