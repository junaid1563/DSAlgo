package ArrayList;

import java.util.*;

public class A {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);// to add a single entry
		ArrayList<Integer> b = new ArrayList<>();
		for(int i=10;i<20;i++) {
			a.add(i);
		}
		System.out.println(a);
		reverse(a);
		System.out.println(a);
		removeDuplicates(a);
	
	//	a.addAll(0, b);// add a collection into other

//		System.out.println(a);
//		System.out.println(a.get(0));// gives value at i index get(index i)

		// set(int index,int value)
//		a.set(0, 120);
//		System.out.println(a);

		// remove(index i)
//		a.remove(0);
//		System.out.println(a);
//		

		// removeAll() and clear()
//		b.clear();
//		b.add(a.get(0));
//		b.add(a.get(1));
//		a.removeAll(b);
//		System.out.println(a);

		// size()
//		System.out.println(a.size());
//
//		// contains(item)
//		System.out.println(a.contains(120));
//		System.out.println(a.contains(23));
//		
//		

		// isEmpty()
		//System.out.println(a.isEmpty());

		// toArray(receiving array)
//		Integer[] s = new Integer[a.size()];// toArray() gives an array of Object type so basically we have to typecast
//											// it to Integer/String before using it
//		a.toArray(s);

	}

	
	
	public static void reverse(ArrayList<Integer> a) {
	ArrayList<Integer> b=new ArrayList<>();	
		for(int i=0;i<a.size();i++) {
			b.add(a.get(a.size()-i-1));
		}
	a.clear();
	a.addAll(b);
	}

	public static void removeDuplicates(ArrayList<Integer> a) {
		Set<Integer> b=new LinkedHashSet<>();
		b.addAll(a);
		a.clear();
		a.addAll(b);
		System.out.println(a);
	}}
