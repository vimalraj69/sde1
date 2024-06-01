package com.handson;

import java.util.*;
class SeatManager {
    private PriorityQueue<Integer> q;

    public SeatManager(int n) {
        q = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
    }

    public int reserve() {
        return (!q.isEmpty())? q.poll() : -1;
    }

    public void unreserve(int seatNumber) {
        q.offer(seatNumber);
    }
}
public class SeatReservationManager {
	
	public static void main (String args []) {
		SeatManager sm = new SeatManager(5);
		
		System.out.println(sm.reserve());
		System.out.println(sm.reserve());
		sm.unreserve(2);
		System.out.println(sm.reserve());
		System.out.println(sm.reserve());
		System.out.println(sm.reserve());
		System.out.println(sm.reserve());
		sm.unreserve(5);
	}

}
