package com.handson;
/*Read a person's name first, read another person and another. 
Greet the first person first, the third person second and the second 
person last. If ‘Chloe’, ‘Joey’ & ‘Zoe’ are the inputs, then the 
output will be ‘Welcome Chloe! Welcome Zoe! Welcome Joey too!’
 * 
 */
import java.util.*;
public class welcome {
	public static void main(String []args) {
		Scanner read=new Scanner(System.in);
		String firstName=read.next();
		String SecoundName=read.next();
		String ThirdName=read.next();
		System.out.println("Welcome "+ firstName+"! "+ "Welcome " +ThirdName+"! "
							+"Welcome " +SecoundName+"! too!");
		read.close();
	}

}
