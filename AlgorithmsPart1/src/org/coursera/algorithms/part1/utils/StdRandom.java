package org.coursera.algorithms.part1.utils;

public class StdRandom extends FrameSort{
	private static int uniform(int i, int N) throws InterruptedException{
		int ret = -1;
		while(!(ret >= i && ret < N)) {
			ret = (int) (Math.random() * N);
//			System.out.println(i);
//			System.out.println(ret);
//			System.out.println(N);
//			System.out.println("===");
//			Thread.sleep(500);
		}
		return ret;
	}
	
	public static void shuffle(Comparable[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int r = 0;
			try {
				r = StdRandom.uniform(i, N);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			exch(a, i, r);
		}
	}
}
