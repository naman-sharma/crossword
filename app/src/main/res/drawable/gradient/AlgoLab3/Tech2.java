package Techniques;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tech2 {
/**
 * Use a sort function (arrays sort) and pass both words into them
 * Use .equals to compare them both
 * O(nlog(base2)n)
 * @throws FileNotFoundException 
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
				if(tech2(str[i], str[j])) {
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
		System.out.println("Tech2:The word with max anagrams is: " + str[max] + " with " + count[max] + " anagrams");
	}
	
	public static boolean tech2(String word1, String word2){
		if(word1.length() == word2.length()){ //continue if same length
			char w1Array[] = word1.toCharArray(); //convert to array
			char w2Array[] = word2.toCharArray(); //convert to array
			Arrays.sort(w1Array);
			Arrays.sort(w2Array);
			return Arrays.equals(w1Array, w2Array);
		}else
			return false;
		
	}
}
