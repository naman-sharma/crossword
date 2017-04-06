import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class SpellChecker {
	static ArrayList<String>testArray = new ArrayList();
	static ArrayList<String> compArray = new ArrayList();
	
	public static void main(String[] args) throws IOException{
		
		Scanner testScan = new Scanner(new File("lab4_testdata.txt"));
		Scanner compScan = new Scanner(new File("lab4_wordlist.txt"));
		
		
		
		while(testScan.hasNext()){
			testArray.add(testScan.next());
		}
		while(compScan.hasNext()){
			compArray.add(compScan.next());
		}
		int start = 1, end = compArray.size();
		
		System.out.print("The number of words you couldn't find in seqSearch are: ");
		long seqStart = System.currentTimeMillis();
		System.out.print(seqSearch(testArray, compArray)); //return how many words didn't match
		long seqEnd = System.currentTimeMillis() - seqStart;
		System.out.print(" in " + seqEnd + " nanoseconds.");
		
		int noMatches = 0;
		long binStart= System.currentTimeMillis();
		for(int i = 0; i < testArray.size(); i++)
			noMatches += binSearch(compArray, testArray.get(i), start, end);
		long binEnd= System.currentTimeMillis() - binStart;
		System.out.println("\nThe number of words you couldn't find in binSearch are: " + noMatches + " in " + binEnd + " nanoseconds.");
		

	}
	
	public static int seqSearch(ArrayList<String> testArray, ArrayList<String> compArray){
		boolean found = false;
		int noMatches = 0;
		for(int i = 0; i < testArray.size(); i++) {
			found = false;
			for (int j = 0; j < compArray.size(); j++){
				if( testArray.get(i).equalsIgnoreCase(compArray.get(j))){
					found = true;
					break;
				}
			}
			if(found == false)
				noMatches++;
		}
		return noMatches;
	}
	
	
	public static int binSearch(ArrayList<String> compArray, String key, int start, int end) {
		if(end < start)
			return 1;
		int middle = (start + end) / 2;
		int cmp = (key.compareToIgnoreCase(compArray.get(middle)));
		if (cmp > 0)
			return binSearch (compArray, key, middle+1, end);		
		else if (cmp < 0)
			return binSearch (compArray, key, start, middle-1);
		return 0;
	}
}
		
	

