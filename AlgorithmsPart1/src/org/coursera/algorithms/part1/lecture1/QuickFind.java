package org.coursera.algorithms.part1.lecture1;

public class QuickFind {
	
	public static void main(String args[]) {
		run1();
		run2();
	}
	
	public static void run1() {
		QuickUnionUF qf = new QuickUnionUF(10);
		int[] cc = {0,8, 8,4, 3,5, 8,9, 1,4, 6,9 };
		for(int i = 0; i < cc.length; i += 2) {
			qf.union(cc[i], cc[i + 1]);
		}
		System.out.println("=================");
	}
	public static void run2() {
		QuickUnionUF qf = new QuickUnionWeighted(10);
		int[] cc = {0,7, 5,6, 9,8, 2,3, 7,4, 2,8, 6,7, 6,2, 6,1 };
		for(int i = 0; i < cc.length; i += 2) {
			qf.union(cc[i], cc[i + 1]);
		}
		System.out.println("=================");
	}
	public static void run3() {
		QuickUnionUF qf = new QuickUnionWeighted(10);
		int[] cc = {};
		for(int i = 0; i < cc.length; i += 2) {
			qf.union(cc[i], cc[i + 1]);
		}
		System.out.println("=================");
	}


}
/*QuickUnionUF qf = new QuickUnionUF(10);
qf.union(9, 8);
qf.union(3, 6);
qf.union(7, 0);
qf.union(6, 9);
qf.union(1, 9);
qf.union(7, 3);
System.out.println("=================");
QuickUnionUF qfw = new QuickUnionWeighted(10);
qfw.union(6, 1);
qfw.union(5, 9);
qfw.union(7, 4);
qfw.union(6, 9);
qfw.union(8, 4);
qfw.union(4, 0);
qfw.union(7, 6);
qfw.union(9, 2);
qfw.union(2, 3);
System.out.println("=================");
//1 {8,1, 7,0, 7,3, 7,8, 7,9, 2,5, 6,4, 6,2, 7,6};
//1.1 {7,0, 8,1, 6,4, 9,7, 9,1, 2,5, 6,2, 3,1, 4,7 };
//2 {6,5, 0,1, 2,1 }
QuickUnionUF qfw2 = new QuickUnionWeighted(10);
int[] cc = {8,1, 7,0, 7,3, 7,8, 7,9, 2,5, 6,4, 6,2, 7,6};
for(int i = 0; i < cc.length; i += 2) {
	qfw2.union(cc[i], cc[i + 1]);
}*/
