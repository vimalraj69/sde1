
package com.handson;

import java.util.*;

public class SummaryRanges {
	
	public static void range(List<Integer> l1) {
		try {
			List<String> ans = new ArrayList<>();
			
			for (int i = 0; i < l1.size() ; i++) {
				int cv = l1.get(i);
				int j =i;
				if (i == l1.size()-1) {
					ans.add(String.valueOf(l1.get(i)));
					break;
				}
				if ( i < l1.size()-1 && cv +1 != l1.get(i+1) ) {
					ans.add(String.valueOf(l1.get(i)));
				}else {
					while ( j < l1.size() ) {
						if(j == l1.size()-1 && cv == l1.get(j)) {
							ans.add(l1.get(i)+"->"+l1.get(j));
							i=j;
							break;
						}
						if(cv != l1.get(j)) {
							ans.add(l1.get(i)+"->"+l1.get(j-1));
							i=j-1;
							break;
						}
						cv++; j++;
					}
					
				}
				
			}
			System.out.print(ans);
			

		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
		
	}
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size and  Arrays and :");
		
		int size1 = sc.nextInt();
		List<Integer> l1 = new ArrayList<>();
		
		for (int i = 0; i< size1; i++) {
			l1.add(sc.nextInt());
		}
		
		
		range(l1 );
		
		
	}

}


