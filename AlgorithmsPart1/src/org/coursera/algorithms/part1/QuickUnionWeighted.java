package org.coursera.algorithms.part1;

public class QuickUnionWeighted extends QuickUnionUF {
	protected int[] sz;

	public QuickUnionWeighted(int N) {
		super(N);
	    sz = new int[N];
	    for(int i = 0; i < N; i++) sz[i] = 1;
	}
	protected int root(int i) {
		while(i != id[i]) {
			//id[i] = id[id[i]];
			i = id[i];
		}
		return i;
	}
	public void union(int p, int q) {
		System.out.print(+ p + "-" + q + ":   ");
		int i = root(p);
		int j = root(q);
		if (i == j) return;
		
		if (sz[i] < sz[j]) { id[i] = j; sz[j] += sz[i]; }
		else { id[j] = i; sz[i] += sz[j]; }
		//replaceRoot(i, j);
		show(sz);
		System.out.print(+ p + "-" + q + ":   ");
		show(id);
		System.out.println("---------------------------");
	}

}
