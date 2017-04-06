package Techniques;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tech3 {
	/**
	 * a simple integer array (dont use vector class)
	 * Size of integer array is 128, initialize all to 0.
	 * Find ascii code for each character in word 1, increment the array index with ascii code
	 * Find ascii code for each character in word 2, decrement the array index with ascii code
	 * If array is 0, it is true.
	 * 
	 * 
	 */
	public static void main(String[] args) throws FileNotFoundException{
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(new FileReader("Dict.txt"));
		ArrayList<String> list = new ArrayList<>();
		while (sc.hasNext())
			list.add(sc.next().toLowerCase());
		String[] str = list.toArray(new String[list.size()]);
		int[] count = new int[str.length];
		Arrays.fill(count, 1);
		for(int i = 0; i < str.length;i++){
			for(int j = i + 1; j < str.length; j++){
				if(tech3(str[i], str[j])) {
					count[i]++;
				}
			}
				
		}
		
		long time  = System.currentTimeMillis() - start;
		System.out.println();
		System.out.println("Time taken: " + time + "ms");
		int max = count[0];
		for(int i = 1; i<count.length;i++){
			if(count[i] > count[max])
				max = i;
		}
		System.out.println("Tech 3: The word with max anagrams is: " + str[max] + " with " + count[max] + " anagrams");
	}
	
	public static boolean tech3(String word1, String word2){
		if(word1.length() == word2.length()){ //continue if same length
			int v[] = new int[128];
			for(int i = 0; i < word1.length(); i++){
				v[(int)word1.charAt(i)]++;
				v[(int)word2.charAt(i)]--;
			}
			for(int i = 0; i < v.length;i++)
				if(v[i] != 0)
					return false;
			return true;	
		}else
			return false;
	}
}