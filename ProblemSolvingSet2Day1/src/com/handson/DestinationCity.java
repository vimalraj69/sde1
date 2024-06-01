package com.handson;




import java.util.*;

public class DestinationCity {

	public static void destination( List<List<String>> l ) {
		try {
			List<String> start = new ArrayList<>();
			List<String> end = new ArrayList<>();
			
			for(List<String> list : l) {
				start.add(list.get(0));
				end.add(list.get(1));
			}
			
			for(String s : end) {
				if(!start.contains(s)) {
					System.out.print("Final Distination City :"+s);break;
				}
			} 
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size  :");

		int size1 = sc.nextInt();
		List<List<String>> l = new ArrayList<>();

		for (int i = 0; i < size1; i++) {
			List<String> list = new ArrayList<>();
			
				System.out.println("Enter start city:");
				list.add(sc.next());
				System.out.println("Enter End city:");
				list.add(sc.next());
			
			l.add(list);
		}
		
		destination(l);

	}

}
 


