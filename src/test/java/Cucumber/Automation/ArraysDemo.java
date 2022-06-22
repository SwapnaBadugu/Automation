package Cucumber.Automation;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1D Array
		int[] num = { 7, 6, 5, 4 };
		for (int i = 0; i <= 3; i++)

			System.out.println(num[i]);

		for (int k : num) {
			System.out.println(" " + k);
		}

		// 2D Array
		int abd[][] = { { 3, 4, 5, 6 }, { 4, 5, 6, 7 }, { 5, 6, 4, 3 } };

		for (int j = 0; j < 3; j++) {
			for (int k = 0; k < 4; k++) {
				System.out.print(" " + abd[j][k]);
			}
			System.out.println();
		}
		for (int[] k : abd) {
			for (int l : k) {
				System.out.print(" " + l);
			}
			System.out.println();
		}

		// Jagged array
		int c[][] = { { 3, 4, 5, 6 }, { 4, 5, 6 }, { 5, 6, 4, 3, 7 } };

		for (int a = 0; a < c[a].length; a++) {
			for (int b = 0; b < c[a].length; b++) {
				System.out.print(" " + c[a][b]);

			}
			System.out.println();
		}

	}
}
