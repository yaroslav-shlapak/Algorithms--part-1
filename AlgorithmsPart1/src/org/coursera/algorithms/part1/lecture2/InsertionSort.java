package org.coursera.algorithms.part1.lecture2;

import org.coursera.algorithms.part1.utils.FrameSort;

public class InsertionSort extends FrameSort{
	public static void sort(Comparable[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++)
			for (int j = i; j > 0; j--)
				if (less(a[j], a[j - 1])) {
					exch(a, j, j - 1);
					//if(nEx >= 6) return;
				}
				else
					break;
	}
}
