package org.coursera.algorithms.part1.lecture2;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Comparable[] a = new Comparable[100];
		ComparableHelper.fillComparable(a);
		StdRandom.shuffle(a);
		ComparableHelper.printComparable(a);
		Comparable[] b = ComparableHelper.copyComparable(a);
		ComparableHelper.printComparable(b);
		SelectionSort.sort(b);
		ComparableHelper.printComparable(b);
		StdRandom.shuffle(b);
		ComparableHelper.printComparable(b);
		InsertionSort.sort(b);
		ComparableHelper.printComparable(b);

		
	}
}
