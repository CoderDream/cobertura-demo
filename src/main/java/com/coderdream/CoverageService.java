package com.coderdream;

public class CoverageService {

	public CoverageService() {
	}

	public static void main(String[] args) {

	}

	public static int add(int x, int y) {
		int c = 0;
		if (x == 101) {
			c = x + y;
		} else {
			c = (x + y) * 2;
		}
		return c;
	}
}
