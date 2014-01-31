package org.coursera.algorithms.part1.utils;

public abstract class FrameSort {
	protected static boolean less(Comparable v, Comparable w) { 
		return v.compareTo(w) < 0; 
	}
	
	protected static void exch(Comparable[] a, int i, int j) {
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	
	protected static boolean isSorted(Comparable[] a) {
		for (int i = 1; i < a.length; i++)
			if (less(a[i], a[i-1])) return false;
		return true;
	}
	
	protected static boolean isSorted(Comparable[] a, int lo, int hi) {
		for (int i = lo; i <= hi; i++)
			if (less(a[i], a[i-1])) return false;
		return true;
	}
	
}
