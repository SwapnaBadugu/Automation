package Cucumber.Automation;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 1;
		for (int i = 1; i <= 5; i++) {

			for (int k = 4; k >= i; k--) {

				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++)
				System.out.print(i);

			System.out.println();
		}
	}
}
