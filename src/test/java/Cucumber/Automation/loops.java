package Cucumber.Automation;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 1;
		while (k <= 5) {
			System.out.println("Hello");
			k++;
		}

		do {
			System.out.println("Hello");
			k++;
		} while (k <= 5);
		k++;

		{
			for (int i = 1; i <= 5; i++) {
				System.out.println("Peep");
			}
		}

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		{

			char c='A';
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(c);
				}
				System.out.println();
			}
		}
		
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; i++) {
				if (i == 1 ||j == 1 || i == 4 || j == 4) {
					System.out.print("X ");
				}else 
				{
					System.out.println(" ");
				}
			}
			System.out.println();

			
		}

	}

	}


