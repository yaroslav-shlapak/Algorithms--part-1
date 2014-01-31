package org.coursera.algorithms.part1.lecture3;

import org.coursera.algorithms.part1.utils.ComparableHelper;

public class MergeSortBU extends MergeSort {

	public static void sort(Comparable[] a) {
		int N = a.length;
		nMerge = 0;
		Comparable[] aux = new Comparable[N];
		for (int sz = 1; sz < N; sz = sz + sz)
			for (int lo = 0; lo < N - sz; lo += sz + sz) {
				merge(a, aux, lo, lo + sz - 1,
						Math.min(lo + sz + sz - 1, N - 1));
				System.out.print(nMerge + ": ");
				ComparableHelper.printComparable(a);	
			}
	}

}
