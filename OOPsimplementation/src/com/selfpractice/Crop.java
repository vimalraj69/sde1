package com.selfpractice;

 class Crop {
    private int carrots;
    private int potatoes;
    private int brinjals;
    public Crop() {
        this.carrots = 0;
        this.potatoes = 0;
        this.brinjals = 0;
    }
    public Crop(int c) {
        this.carrots = c;
        this.potatoes = 0;
        this.brinjals = 0;
    }
    public Crop(int c,int p) {
        this.carrots = c;
        this.potatoes = p;
        this.brinjals = 0;
    }
    public Crop(int c, int p, int b) {
        this.carrots = c;
        this.potatoes = p;
        this.brinjals = b;
    }
    public void printResult() {
        System.out.println("C " +carrots+ " P " +potatoes+ " B " +brinjals);
    }

    public static void main(String[] args) {
    	Crop c1 =new Crop();
    	Crop c2 =new Crop(10);
    	Crop c3 =new Crop(20, 15);
        Crop c4 =new Crop(15, 25, 30);
        c1.printResult(); 
        c2.printResult(); 
        c3.printResult(); 
        c4.printResult(); 
    }
}

