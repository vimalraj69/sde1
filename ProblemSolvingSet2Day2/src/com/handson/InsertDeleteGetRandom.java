package com.handson;

import java.util.*;

class RandomizedSet {
	private ArrayList<Integer> list;
	private Map<Integer, Integer> map;

	public RandomizedSet() {
		list = new ArrayList<>();
		map = new HashMap<>();
	}

	public boolean search(int val) {
		return map.containsKey(val);
	}

	public boolean insert(int val) {
		if (search(val))
			return false;

		list.add(val);
		map.put(val, list.size() - 1);
		return true;
	}

	public boolean remove(int val) {
		if (!search(val))
			return false;

		int index = map.get(val);
		list.set(index, list.get(list.size() - 1));
		map.put(list.get(index), index);
		list.remove(list.size() - 1);
		map.remove(val);

		return true;
	}

	public int getRandom() {
		Random rand = new Random();
		return list.get(rand.nextInt(list.size()));
	}
}

public class InsertDeleteGetRandom {

	public static void main(String args[]) {
		
		RandomizedSet r= new RandomizedSet();
		System.out.println(r.insert(1));
		System.out.println(r.remove(2));
		System.out.println(r.insert(2));
		System.out.println(r.getRandom());
		System.out.println(r.remove(1));
		System.out.println(r.insert(2));
		System.out.println(r.getRandom());
	}

}
