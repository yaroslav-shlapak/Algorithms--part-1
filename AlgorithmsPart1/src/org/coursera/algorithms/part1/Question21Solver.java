package org.coursera.algorithms.part1;

public class Question21Solver {
	public static void main(String[] args) {
	   double igrec = log(3, 24.59);
	   System.out.println(igrec);
	   System.out.println(0.04 / Math.pow(Math.pow(2, 10), igrec));
	   System.out.println(1.19 / Math.pow(Math.pow(2, 12), igrec));
	   System.out.println(37.29 / Math.pow(Math.pow(2, 14), igrec));
	   System.out.println(1142.09 / Math.pow(Math.pow(2, 16), igrec));
	   System.out.println(log(2, 2.0 * Math.pow(2, 12)));
	}
	
	public static <T extends Number> double log(T base, T x) {
	    return (Math.log(x.doubleValue()) / Math.log(base.doubleValue()));
	}

}
