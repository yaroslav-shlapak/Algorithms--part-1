package org.coursera.algorithms.part1.lecture2;

import org.coursera.algorithms.part1.utils.ComparableHelper;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Comparable[] a = {41, 43, 53, 64, 91, 46, 88, 71, 14, 34};
		ComparableHelper.printComparable(a);
		InsertionSort.sort(a);
		ComparableHelper.printComparable(a);
	
	}
}
