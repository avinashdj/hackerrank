package com.prac.simple;

public class RemoveSeven {
	public static void main(String args[]) {
		int n = 7;
		int a[] = { 7, 8, 9 };
		System.out.println(String.format("The Sum without %s is: %s", n, removeNumberAndAdd(n, a)));
	}

	public static int removeNumberAndAdd(int n, int a[]) {
		int len = a.length;
		int i = 0;
		int sum = 0;
		while (i < len) {
			if ((a[i] == 7) || ((i > 0) && (a[i - 1] == 7))) {
				i = i + 1;
				continue;
			} else {
				sum = sum + a[i];
				i = i + 1;
			}
		}
		return sum;
	}

}
