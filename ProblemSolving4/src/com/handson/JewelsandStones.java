package com.handson;

import java.util.Arrays;
import java.util.Scanner;

public class JewelsandStones {
	static int toalstones (String jewels,String stones) {
		int count =0;
		for(char c: stones.toCharArray()) {
			if(jewels.contains(String.valueOf(c))) {
				count++;
			}
		}
		return count;
	}
	
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter jewels and stones:");
		
		String jewels =sc.next();
		String stones =sc.next();
		
		System.out.print("Total stones used : "+ toalstones(jewels,stones));
		
		
		sc.close();

	}
}
