package com.handson;

import java.util.Scanner;

class OverLapping {
    static boolean checkOverlap(int radius,int xCenter,int yCenter,int x1,int y1,int x2,int y2) {
        int closestX= max(xCenter, x1, x2);
        int closestY= max(yCenter, y1, y2);
        int distanceX= xCenter -closestX;
        int distanceY= yCenter -closestY;
        int distance= distanceX*distanceX+distanceY*distanceY;
        return distance <=radius *radius;
    }
    
    static int max(int val,int min,int max) {
        return Math.max(min,Math.min(max,val));
    }
    
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner (System.in);
		System.out.print("Enter the center circle radius :");
		int radius= sc.nextInt();
		int xCenter= sc.nextInt();
		int yCenter= sc.nextInt();
		System.out.print("Enter the x1 y1 and x2 y2 :");
		int x1= sc.nextInt();
		int y1= sc.nextInt();
		int x2= sc.nextInt();
		int y2= sc.nextInt();
		System.out.print("is OverLapping :"+checkOverlap(radius,xCenter,yCenter,x1,y1,x2,y2));



    }
}
