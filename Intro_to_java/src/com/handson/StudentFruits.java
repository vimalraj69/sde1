package com.handson;

public class StudentFruits {
	public static void main(String[] args) {
        
        int girls_Oranges = 136;
        int boys_Oranges = 128;
        int girls_Mangoes = 240;
        int boys_Mangoes = 243;
     
        int total_Oranges = girls_Oranges + boys_Oranges;        
        int total_Mangoes = girls_Mangoes + boys_Mangoes;
        int total_Students = total_Oranges + total_Mangoes;

        boolean girls_Exceed = girls_Oranges + girls_Mangoes > boys_Oranges + boys_Mangoes;

      
        System.out.println("students who like oranges= " + total_Oranges);
        System.out.println("students who like mangoes= " + total_Mangoes);
        System.out.println("students overall=" + total_Students);
        System.out.println("girls exceed the number of boys=" + girls_Exceed);
    }

}
