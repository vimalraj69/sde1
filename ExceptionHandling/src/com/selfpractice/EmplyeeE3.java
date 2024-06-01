package com.selfpractice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class InvalidEmpNumberException extends Exception{
	InvalidEmpNumberException(String s ) {
		super(s);
	}
}

class InvalidDateOfJoinException extends Exception{
	InvalidDateOfJoinException(String s ) {
		super(s);
	}
}

class employee{
	int empCode;
	String name;
	Date dateOfBirth;
	Date DateOfAppointment;
	int exp;
	employee(int empCode,String name, Date dob,
			Date apd, int exp ){
		this.empCode=empCode;
		this.name=name;
		this.dateOfBirth=dob;
		this.DateOfAppointment=apd;
		this.exp=exp;
	}
	
	public void showInfo() {
		System.out.println("empCode :"+empCode);
		System.out.println("name :"+name);
		System.out.println("dateOfBirth :"+dateOfBirth);
		System.out.println("DateOfAppointment :"+DateOfAppointment);
	}
	
}
public class EmplyeeE3 {
	public static void main (String args[]) {
		Scanner sc= new Scanner (System.in);
        SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
        d.setLenient(false);
		try {
			System.out.println("Enter the employee Number :");
			int empNO = sc.nextInt();
			
			if(empNO<=0) {
				throw new InvalidEmpNumberException ("empNO must be positive");
			}
			System.out.println("Enter the Name :");
			String name = sc.next();
			
			System.out.print("Enter the Date of Birth (yyyy-mm-dd)");
			String date =sc.next();
			
			Date dateOfBirth = d.parse(date);
			
			System.out.println("Enter the Date of Appointment (yyyy-mm-dd)");
			String dateAppoint = sc.next();
			
            Date dofA = d.parse(dateAppoint);
			
			if(! dateOfBirth .before(dofA)) {
				throw new InvalidDateOfJoinException("birth date must be a Date of Appointment");
			}
			employee e1 = new employee(empNO,name,dateOfBirth,dofA,9);
			
			e1.showInfo();
			
		}catch(Exception e) {
			System.out.print(e);
		}
		
	}

}
