package com.selfpractice;

public class InterestCalculator {
    
    public static double calculateCompoundInterest(double principal,double annualInterestRate,int years) {
        double total = principal*Math.pow((1+annualInterestRate /100),years);
        return total;
    }
    
    public static double calculateInterestOnly(double principal,double annualInterestRate,int years) {
        double total = calculateCompoundInterest(principal, annualInterestRate, years);
        double ci = total-principal;
        return ci;
    }
    
    public static void main(String[] args) {
        double principal = 1000.0;
        double annualInterestRate = 5.0;
        int years = 10;
        InterestCalculator ic = new InterestCalculator();
        ic.calculateCompoundInterest(principal,annualInterestRate,years);
        
        System.out.println("principal: " + principal);
        System.out.println("annual Interest Rate: " + annualInterestRate);
        System.out.println("Years: " + years);
        System.out.println("total Amount including interest:" + ic.calculateCompoundInterest(principal, annualInterestRate, years));
        System.out.println("compound Interest Earned:" + ic.calculateInterestOnly(principal, annualInterestRate, years));
        
    }
}
