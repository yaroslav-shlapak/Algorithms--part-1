package org.coursera.algorithms.part1.lecture2;

import org.coursera.algorithms.part1.utils.FrameSort;

public class SelectionSort extends FrameSort {
	public static void sort(Comparable[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i+1; j < N; j++)
					if (less(a[j], a[min]))
						min = j;
			exch(a, i, min);
		} 
	}
}
