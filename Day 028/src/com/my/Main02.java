package com.my;

public class Main02 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int k = 1;
		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k;
				k++;
			}

			count++;
			k = count;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
	}
}
