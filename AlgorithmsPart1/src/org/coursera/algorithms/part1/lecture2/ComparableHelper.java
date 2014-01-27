package org.coursera.algorithms.part1.lecture2;

public class ComparableHelper {
	public static void printComparable(Comparable[] a) {
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static void fillComparable(Comparable[] a) {
		for(int i = 0; i < a.length; i++)
			a[i] = i;
	}
	
	public static Comparable[] copyComparable(Comparable[] a) {
		Comparable[] b = new Comparable[a.length];
		for(int i = 0; i < a.length; i++)
			b[i] = a[i];
		return b;
	}

}
