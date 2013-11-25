package org.coursera.algorithms.part1;

public class QuickUnionUF {
	protected int[] id;
	
	public QuickUnionUF(int N) {
		id = new int[N];
		for(int i = 0; i < N; i++) id[i] = i;
	}
	
	protected int root(int i) {
		while(i != id[i]) i = id[i];
		return i;
	}
	
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}
	
	public void union(int p, int q) {
		System.out.print(+ p + "-" + q + ":   ");
		int i = root(p);
		int j = root(q);
		if (i == j) return;
		
		id[i] = j;
		replaceRoot(i, j);
		show(id);
		System.out.println("---------------------------");
	}
	
	protected void replaceRoot(int p, int q) {
		for(int i = 0; i < id.length; i++) {
			if(id[i] == p)
				id[i] = q;
		}
	}
	
	public static void show(int[] data) {
		for(int i = 0; i < data.length; i++)
			System.out.print("" + data[i] + " ");
		System.out.println();
	}
}