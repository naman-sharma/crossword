package Techniques;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tech1 {
/*
 * O(n^2)
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
			for(int j = i+1; j < str.length; j++){
				if(tech1(str[i], str[j]))
						count[i]++;
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
		System.out.println("Tech 1: The word with max anagrams is: " + str[max] + " with " + count[max] + " anagrams");
	}
		
	public static boolean tech1(String word1, String word2){
		if(word1.length() == word2.length()){ //continue if same length
			for(int i = 0; i < word1.length(); i++) {
				for (int j = 0; j < word2.length(); j++) {
					if (word1.charAt(i) == word2.charAt(j)) {
						word2 = word2.substring(0, j) + word2.substring(j + 1);
						break;
					}
				}
			}
			return word2.length() == 0;
		}else
			return false;
	}
	
}	